    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans;

import org.avbravo.inscripcion.beans.talleres.TalleresBeans;
import org.avbravo.inscripcion.beans.Inscripcion;
import org.avbravo.inscripcion.beans.estudiantes.Estudiantes;
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
import org.avbravo.inscripcion.beans.prioridades.PrioridadesBeans;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class InscripcionBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    Inscripcion inscripcion;
    Estudiantes estudiantes;
    TalleresBeans talleresBeans;
    PrioridadesBeans prioridadesBeans;
    private List<Inscripcion> inscripcionlist;
    private Inscripcion selectedInscripcion;


    /** Creates a new instance of InscripcionBeans */
    public InscripcionBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();

        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        inscripcion = (Inscripcion) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "inscripcion");
        estudiantes = (Estudiantes) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "estudiantes");
        talleresBeans = (TalleresBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "talleresBeans");
        prioridadesBeans = (PrioridadesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridadesBeans");
        inscripcionlist = new ArrayList<Inscripcion>();

    }

   

    public Inscripcion getSelectedInscripcion() {
        return selectedInscripcion;
    }

    public void setSelectedInscripcion(Inscripcion selectedInscripcion) {
        this.selectedInscripcion = selectedInscripcion;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public List<Inscripcion> getInscripcionlist() {
        return inscripcionlist;
    }

    public void setInscripcionlist(List<Inscripcion> inscripcionlist) {
        this.inscripcionlist = inscripcionlist;
    }

    public String CargarListaInscripcion() {

        try {

            ELContext elContext = FacesContext.getCurrentInstance().getELContext();

            mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from talleres where tomados < cupos and abierto='si' and  idfacultad ='" + estudiantes.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de talleres en esta facultad ");
                mySessionBean.con.close();
                return null;
            }

            rs.beforeFirst();
            inscripcionlist.removeAll(inscripcionlist);

            while (rs.next()) {


                inscripcionlist.add(new Inscripcion(
                        rs.getString("idtaller"),
                        rs.getString("taller"),
                        rs.getString("descripcion"),
                        rs.getString("fecha"),
                        rs.getString("horainicio"),
                        rs.getString("horaterminacion"),
                        rs.getString("lugar"),
                        rs.getInt("cupos"),
                        rs.getString("abierto"),
                        rs.getInt("tomados"),
                        rs.getString("expositor"),
                        rs.getString("url"),
                        rs.getString("foto"),
                        rs.getInt("idfacultad"),
                        0));


            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarListaInscripcion()");
        }

        return null;

    }

    /*
     * muestra al estudiante la reservacion que el hizo
     *
     */
    public String CargarListaInscripcionConsulta(String lcedula, int lidfacultad) {


        try {

            prioridadesBeans.ConsultarPrioridades();


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }


            String sqlquery = "select talleres.*,reservacion.prioridad from talleres,reservacion "
                    + " where abierto ='si' and talleres.idtaller= reservacion.idtaller "
                    + " and talleres.idfacultad ='" + lidfacultad + "' "
                    + " and talleres.idfacultad = reservacion.idfacultad "
                    + " and reservacion.cedula='" + lcedula + "' "
                    + " order by prioridad";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de talleres en esta facultad ");
                mySessionBean.con.close();
                return null;
            }

            rs.beforeFirst();

            inscripcionlist.removeAll(inscripcionlist);
            while (rs.next()) {


                inscripcionlist.add(new Inscripcion(
                        rs.getString("idtaller"),
                        rs.getString("taller"),
                        rs.getString("descripcion"),
                        rs.getString("fecha"),
                        rs.getString("horainicio"),
                        rs.getString("horaterminacion"),
                        rs.getString("lugar"),
                        rs.getInt("cupos"),
                        rs.getString("abierto"),
                        rs.getInt("tomados"),
                        rs.getString("expositor"),
                        rs.getString("url"),
                        rs.getString("foto"),
                        rs.getInt("idfacultad"),
                        rs.getInt("prioridad")));


            }

            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarListaInscripcion()");
        }

        return null;

    }

    public String Agregar() {

        try {
            /*
             * recorremos el list
             */
            if (inscripcionlist == null) {
                JsfUtil.addErrorMessage("No hay registros para procesar");
                return null;
            }

            int tseleccion[] = new int[prioridadesBeans.getMaximo_prioridad() + 1];

            for (int i = 0; i < inscripcionlist.size(); i++) {
                Inscripcion id = inscripcionlist.get(i);
                tseleccion[id.getPrioridad()]++;

            }
//se toma 1 porque 0 se asume que no es prioridad
            boolean selecciono = false;
            for (int i = 1; i <= prioridadesBeans.getMaximo_prioridad(); i++) {

                if (tseleccion[i] > 1) {
                    JsfUtil.addErrorMessage("Solo debe seleccionar una prioridad " + String.valueOf(i));
                    return null;
                }
                if (tseleccion[i] == 1) {
                    selecciono = true;
                }

            }
            if (selecciono == false) {
                JsfUtil.addErrorMessage("Debe seleccionar por lo menos un taller");
                return null;
            }
            String sqlinsert = "insert into reservacion (cedula,idtaller,prioridad,"
                    + "idfacultad,fecha)"
                    + "values(?,?,?,?,?)";
            for (int i = 0; i < inscripcionlist.size(); i++) {
                Inscripcion id = inscripcionlist.get(i);
                if (id.getPrioridad() > 0) {
                    GuardarRegistro(sqlinsert, id.getIdtaller(), id.getPrioridad());
                    if (id.getPrioridad() <= prioridadesBeans.getMaximo_reserva()) {
                        //actualizo el taller con los inscritos prioridad 1
                        talleresBeans.ActualizarCuposTomados(id.getIdtaller(), estudiantes.getIdfacultad());
                    }

                }
            }




            ActualizarInscrito();


            CargarListaInscripcionConsulta(estudiantes.getCedula(), estudiantes.getIdfacultad());
            JsfUtil.addSuccessMessage("Se guardo exitosamente la inscripcion ");
            Limpiar();

            return "inscripcionconsulta";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Agregar()");
        }

        return null;

    }

    private void GuardarRegistro(String sqlinsert, String idtaller, int prioridad) {
        try {
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return;
            }
            java.util.Calendar ca = java.util.Calendar.getInstance();
            java.sql.Date mydate = new java.sql.Date(ca.getTimeInMillis());

            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlinsert);
            psquery.setString(1, estudiantes.getCedula());
            psquery.setString(2, idtaller);
            psquery.setInt(3, prioridad);
            psquery.setInt(4, estudiantes.getIdfacultad());
            psquery.setDate(5, mydate);


            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo guardar la inscripcion ");
                mySessionBean.con.close();
                return;
            }

            psquery.close();
            mySessionBean.con.close();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. GuardarRegistro()");
        }


    }

    
     public String ActualizarInscrito() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update estudiantes set registrado ='si' where cedula =?";

            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, estudiantes.getCedula());
            int count = psquery.executeUpdate();

            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el registro de estudiantes ");
                mySessionBean.con.close();
                return null;
            }
            psquery.close();
            mySessionBean.con.close();
            
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ActualizarInscrito()");
        }

        return null;

    }
     
    public String EliminarInscripcion() {

        try {
            /*
             * recorremos el list
             */
            if (inscripcionlist == null) {
                JsfUtil.addErrorMessage("No hay registros para procesar");
                return null;
            }

            prioridadesBeans.ConsultarPrioridades();

            for (int i = 0; i < inscripcionlist.size(); i++) {
                Inscripcion id = inscripcionlist.get(i);
                if (id.getPrioridad() > 0 && id.getPrioridad() <= prioridadesBeans.getMaximo_reserva()) {
                    // reducir el cupo
                    ActualizarCupos(id.getIdtaller());
                }

            }

//se toma 1 porque 0 se asume que no es prioridad


            ActualizarNoInscrito();
            EliminarRegistroReservacion();

            JsfUtil.addSuccessMessage("Se elimino la inscripcion de los talleres");
            return "/administrador/administradormenu";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. EliminarInscripcion()");
        }

        return null;

    }

    public void Limpiar() {
        inscripcion.setIdtaller("");
        inscripcion.setTaller("");
        inscripcion.setDescripcion("");
        //inscripcion.setFecha();
        inscripcion.setHorainicio("");
        inscripcion.setHoraterminacion("");
        inscripcion.setLugar("");
        inscripcion.setCupos(0);
        inscripcion.setAbierto("");
        inscripcion.setTomados(0);
        inscripcion.setExpositor("");
        inscripcion.setUrl("");
        inscripcion.setFoto("");
        inscripcion.setIdfacultad(0);
        inscripcion.setPrioridad(0);
    }

   

    public String ActualizarNoInscrito() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update estudiantes set registrado ='no' where cedula =?";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);


            psquery.setString(1, estudiantes.getCedula());
            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el registro de estudiantes ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            // JsfUtil.addSuccessMessage("Se actualizo el recibo de pago ");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ActualizarNoInscrito()");
        }

        return null;

    }

    public String EliminarRegistroReservacion() {
        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlupdate = "delete from reservacion where cedula =?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, estudiantes.getCedula());
            int count = psquery.executeUpdate();

            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo eliminar la reservacion ");
                mySessionBean.con.close();
                return null;
            }

            psquery.close();
            mySessionBean.con.close();
           
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. EliminarRegistroReservacion()");
        }

        return null;

    }
     public String ActualizarCupos(String lidtaller) {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update talleres set tomados =tomados - 1 where  idtaller =? and idfacultad =?";

            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);


            psquery.setString(1, lidtaller);
            psquery.setInt(2, mySessionBean.getIdfacultad());
            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el registro de estudiantes ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            // JsfUtil.addSuccessMessage("Se actualizo el recibo de pago ");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ActualizarCupos()");
        }

        return null;

    }
}
