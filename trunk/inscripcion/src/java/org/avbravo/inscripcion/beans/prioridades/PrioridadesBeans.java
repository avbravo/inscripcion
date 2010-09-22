/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.prioridades;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.avbravo.inscripcion.JsfUtil;
import org.avbravo.inscripcion.beans.MySessionBean;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class PrioridadesBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    Prioridades prioridades;
    
    private List<Prioridades> prioridadeslist;
    private Prioridades selectedPrioridades;
    SelectItem[] prioridadesCombo;
    private String mensajeReservacion1;
    private String mensajeReservacion2;
    private int maximo_prioridad;
    private int maximo_reserva;
    private int idfacultad;

    public String prepararVista() {
        try {
            prioridades.setIdfacultad(selectedPrioridades.getIdfacultad());
            Consultar();

            return "/administrador/prioridadeseditar";
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, "Error  ");
        }
        return null;
    }

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    /** Creates a new instance of EstudiantesBeans */
    public PrioridadesBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        prioridades = (Prioridades) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridades");
        prioridadeslist = new ArrayList<Prioridades>();

    }

    public int getMaximo_prioridad() {
        return maximo_prioridad;
    }

    public void setMaximo_prioridad(int maximo_prioridad) {
        this.maximo_prioridad = maximo_prioridad;
    }

    public int getMaximo_reserva() {
        return maximo_reserva;
    }

    public void setMaximo_reserva(int maximo_reserva) {
        this.maximo_reserva = maximo_reserva;
    }

    public SelectItem[] getPrioridadesCombo() {

        return prioridadesCombo;
    }

    public String getMensajeReservacion1() {
        return mensajeReservacion1;
    }

    public void setMensajeReservacion1(String mensajeReservacion1) {

        this.mensajeReservacion1 = mensajeReservacion1;
    }

    public String getMensajeReservacion2() {
        return mensajeReservacion2;
    }

    public void setMensajeReservacion2(String mensajeReservacion2) {
        this.mensajeReservacion2 = mensajeReservacion2;
    }

    public void setPrioridadesCombo(SelectItem[] prioridadesCombo) {
        this.prioridadesCombo = prioridadesCombo;
    }

    public Prioridades getPrioridades() {
        return prioridades;
    }

    public void setPrioridades(Prioridades prioridades) {
        this.prioridades = prioridades;
    }

    public List<Prioridades> getPrioridadeslist() {
        return prioridadeslist;
    }

    public void setPrioridadeslist(List<Prioridades> prioridadeslist) {
        this.prioridadeslist = prioridadeslist;
    }

    public Prioridades getSelectedPrioridades() {
        return selectedPrioridades;
    }

    public void setSelectedPrioridades(Prioridades selectedPrioridades) {
        this.selectedPrioridades = selectedPrioridades;
    }

    public String ConsultarPrioridades() {
        try {
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlquery = "select * from prioridades where idfacultad ='" + mySessionBean.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de prioridades en esta facultad ");
                mySessionBean.con.close();
                return null;
            }

            rs.beforeFirst();
            maximo_prioridad = 0;
            maximo_reserva = 0;
            while (rs.next()) {
                maximo_prioridad = rs.getInt("maximo_prioridad");
                maximo_reserva = rs.getInt("maximo_reserva");
            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            if (maximo_reserva == 1) {
                mensajeReservacion1 = "Los talleres con prioridad 1 se reservara el cupo ";
                mensajeReservacion2 = "Prioridad 2 a " + String.valueOf(maximo_prioridad) + " seran asignados en un proceso automatico basado en cupos disponibles.";
            } else {
                mensajeReservacion1 = "Los talleres con prioridad 1 a " + String.valueOf(maximo_reserva) + " se reservara el cupo. ";
                mensajeReservacion2 = "Prioridad  " + String.valueOf(maximo_reserva + 1) + " a  " + String.valueOf(maximo_prioridad) + " seran asignados en un proceso automatico basado en cupos disponibles.";
            }
            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ConsultarPrioridade()");
        }
        return null;
    }

    public String CargarCombo() {
        try {
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from prioridades where idfacultad ='" + mySessionBean.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de prioridades en esta facultad ");
                mySessionBean.con.close();
                return null;
            }

            rs.beforeFirst();
            maximo_prioridad = 0;
            maximo_reserva = 0;
            while (rs.next()) {

                maximo_prioridad = rs.getInt("maximo_prioridad");
                maximo_reserva = rs.getInt("maximo_reserva");

            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            //  prioridadesCombo[ind] = new SelectItem(rs.getString("idtaller"), rs.getString("taller"));
            if (maximo_reserva == 1) {
                mensajeReservacion1 = "Los talleres con prioridad 1 se reservara el cupo ";
                mensajeReservacion2 = "Prioridad 2 a " + String.valueOf(maximo_prioridad) + " seran asignados en un proceso automatico basado en cupos disponibles.";

            } else {
                mensajeReservacion1 = "Los talleres con prioridad 1 a " + String.valueOf(maximo_reserva) + " se reservara el cupo. ";
                mensajeReservacion2 = "Prioridad  " + String.valueOf(maximo_reserva + 1) + " a  " + String.valueOf(maximo_prioridad) + " seran asignados en un proceso automatico basado en cupos disponibles.";
            }

            prioridadesCombo = new SelectItem[maximo_prioridad + 1];
            for (int i = 0; i <= maximo_prioridad; i++) {
                prioridadesCombo[i] = new SelectItem(String.valueOf(i), String.valueOf(i));
            }


            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarCombo()");
        }

        return null;
    }

    public String CargarLista() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlquery = "select * from prioridades where idfacultad ='" + mySessionBean.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de prioridades en esta facultad ");
                mySessionBean.con.close();
                return null;
            }
            rs.beforeFirst();
            prioridadeslist.removeAll(prioridadeslist);
                       while (rs.next()) {
                prioridadeslist.add(new Prioridades(
                        rs.getInt("maximo_prioridad"),
                        rs.getInt("maximo_reserva"),
                        rs.getInt("idfacultad")));

                
            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarLista()");
        }

        return null;

    }

    public String Consultar() {

        try {


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from prioridades where idfacultad =?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setInt(1, mySessionBean.getIdfacultad());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existe prioridades en esa facultad");
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                Limpiar();
                return null;
            }

            Cargar(rs);


            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Consultar()");
        }

        return null;

    }

    private void Cargar(ResultSet rs) {
        try {
            prioridades.setMaximo_prioridad(rs.getInt("maximo_prioridad"));
            prioridades.setMaximo_reserva(rs.getInt("maximo_reserva"));
            prioridades.setIdfacultad(rs.getInt("idfacultad"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Cargar()");
        }
    }

    public void Limpiar() {
        prioridades.setMaximo_prioridad(0);
        prioridades.setMaximo_reserva(0);
        prioridades.setIdfacultad(0);
    }

    public String Agregar() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "insert into prioridades (maximo_prioridad,maximo_reserva, idfacultad)"
                    + "values(?,?,?)";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setInt(1, prioridades.getMaximo_prioridad());
            psquery.setInt(2, prioridades.getMaximo_reserva());
            psquery.setInt(3, mySessionBean.getIdfacultad());

            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo guardar la prioridad ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se guardo la prioridad ");
            Limpiar();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Agregar()");
        }

        return null;

    }

    public String Editar() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update  prioridades set maximo_prioridad=?,maximo_reserva=?"
                    + " where idfacultad =?";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);


            psquery.setInt(1, prioridades.getMaximo_prioridad());
            psquery.setInt(2, prioridades.getMaximo_reserva());
            psquery.setInt(3, mySessionBean.getIdfacultad());

            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizr el taller ");
                psquery.close();
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se actualizo el taller ");

            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Actualizar()");
        }

        return null;

    }
}
