/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans;

import org.avbravo.inscripcion.beans.talleres.TalleresBeans;
import org.avbravo.inscripcion.beans.talleres.Talleres;
import org.avbravo.inscripcion.beans.prioridades.PrioridadesBeans;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.avbravo.inscripcion.JsfUtil;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class AsignadorTalleresAutomaticos implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
   
       PrioridadesBeans prioridadesBeans;
       TalleresBeans talleresBeans;
   ReservacionBeans reservacionBeans;
    private List<Talleres> tallereslist;
    private List<Reservacion> reservacionlist;
    int disponibles;

    /** Creates a new instance of AsignadorTalleresAutomaticos */
    public AsignadorTalleresAutomaticos() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();

        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
     
   
        prioridadesBeans = (PrioridadesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridadesBeans");
        reservacionBeans = (ReservacionBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "reservacionBeans");
        talleresBeans = (TalleresBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "talleresBeans");
        tallereslist = new ArrayList<Talleres>();
        reservacionlist = new ArrayList<Reservacion>();


    }

    public String AsignacionAutomatica() {

        try {

            CargarListaTalleres();

            for (int i = 0; i < tallereslist.size(); i++) {
                Talleres id = tallereslist.get(i);
//                tseleccion[id.getPrioridad()]++;
                disponibles = id.getCupos() - id.getTomados();
                // buscar prioridad
                CargarListaReservacion(id.getIdtaller());

                for (int m = 0; m < reservacionlist.size(); m++) {
                    if (disponibles > 0) {
                        //update talleres
                        Reservacion r = reservacionlist.get(m);
                        talleresBeans.ActualizarCuposTomados(r.getIdtaller(), mySessionBean.getIdfacultad());
                        disponibles--;
                        //update reservacion
                        reservacionBeans.ActualizarPrioridades(r.getIdtaller(), r.getCedula());
                    }
                }
            }
            JsfUtil.addSuccessMessage("Proceso de asignación terminado");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. AsignacionAutomatica()");
        }

        return null;

    }

    /*
     *
     * lista de estudiantes por talleres
     */
    public String CargarListaTalleres() {

        try {

            // ELContext elContext = FacesContext.getCurrentInstance().getELContext();
            // mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from talleres where idfacultad ='" + mySessionBean.getIdfacultad() + "' and abierto='si' and tomados < cupos";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();

            tallereslist.removeAll(tallereslist);

            while (rs.next()) {


                tallereslist.add(new Talleres(
                        rs.getString("idtaller"),
                        rs.getString("taller"),
                        rs.getInt("cupos"),
                        rs.getInt("tomados")));


            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();

            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarListaTalleres()");
        }

        return null;

    }

    public String CargarListaReservacion(String lidtaller) {

        try {

            // ELContext elContext = FacesContext.getCurrentInstance().getELContext();
            // mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");

            prioridadesBeans.ConsultarPrioridades();
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }


            String sqlquery = "select reservacion.cedula, reservacion.idtaller from reservacion "
                    + " where reservacion.idfacultad ='" + mySessionBean.getIdfacultad() + "' "
                    + " and reservacion.idtaller = '" + lidtaller + "'"
                    + " and reservacion.prioridad >" + prioridadesBeans.getMaximo_reserva()
                    + " and reservacion.prioridad <=" + prioridadesBeans.getMaximo_prioridad()
                    + " order by id";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();

            reservacionlist.removeAll(reservacionlist);

            while (rs.next()) {


                reservacionlist.add(new Reservacion(
                        rs.getString("cedula"),
                        rs.getString("idtaller")));


            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();

            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarListaReservacion()");
        }

        return null;

    }
}
