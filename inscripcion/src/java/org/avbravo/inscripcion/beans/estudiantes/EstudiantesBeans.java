/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.estudiantes;

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
import javax.servlet.http.HttpSession;
import org.avbravo.inscripcion.JsfUtil;
import org.avbravo.inscripcion.beans.InscripcionBeans;
import org.avbravo.inscripcion.beans.MySessionBean;
import org.avbravo.inscripcion.beans.prioridades.PrioridadesBeans;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class EstudiantesBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    Estudiantes estudiantes;
    InscripcionBeans inscripcionBeans;
    PrioridadesBeans prioridadesBeans;
    private List<Estudiantes> estudianteslist;
    private Estudiantes selectedEstudiantes;
    boolean logeado = false;
    private String iniciarSistema;
    private boolean tieneRegistrosInscripcion = false;

    public String prepararVista() {
        try {
            estudiantes.setCedula(selectedEstudiantes.getCedula());
            Consultar();

            return "/administrador/registrarpago";
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, "Error  ");
        }
        return null;
    }

    public String prepararEditar() {
        try {
            estudiantes.setCedula(selectedEstudiantes.getCedula());
            Consultar();

            return "/administrador/estudianteseditar";
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, "Error  ");
        }
        return null;
    }

    public boolean isTieneRegistrosInscripcion() {
        return tieneRegistrosInscripcion;
    }

    public void setTieneRegistrosInscripcion(boolean tieneRegistrosInscripcion) {
        this.tieneRegistrosInscripcion = tieneRegistrosInscripcion;
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public String getIniciarSistema() {
        Limpiar();
        setLogeado(false);
        return null;

    }

    public void setIniciarSistema(String iniciarSistema) {
        this.iniciarSistema = iniciarSistema;

    }

    /** Creates a new instance of EstudiantesBeans */
    public EstudiantesBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        estudiantes = (Estudiantes) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "estudiantes");
        prioridadesBeans = (PrioridadesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridadesBeans");
        inscripcionBeans = (InscripcionBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "inscripcionBeans");
        estudianteslist = new ArrayList<Estudiantes>();

    }

    public List<Estudiantes> getEstudianteslist() {
        return estudianteslist;
    }

    public void setEstudianteslist(List<Estudiantes> estudianteslist) {
        this.estudianteslist = estudianteslist;
    }

    public Estudiantes getSelectedEstudiantes() {
        return selectedEstudiantes;
    }

    public void setSelectedEstudiantes(Estudiantes selectedEstudiantes) {
        this.selectedEstudiantes = selectedEstudiantes;
    }

    public String VerificarLogin() {

        try {

            String recibopago = estudiantes.getRecibopago();
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from estudiantes where  cedula = ?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setString(1, estudiantes.getCedula());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existe estudiante con esa cedula: " + estudiantes.getCedula());
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                return null;
            }

            Cargar(rs);
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            if (estudiantes.getRecibopago().equals("") || estudiantes.getRecibopago().equals(null) || estudiantes.getRecibopago().equals("0")) {
                JsfUtil.addErrorMessage("Este estudiante no ha cancelado su boleto.");
                return null;
            }
            if (!estudiantes.getRecibopago().equals(recibopago)) {
                JsfUtil.addErrorMessage("Este recibo de pago no pertenece a este estudiante");
                return null;
            }
            if (estudiantes.getRegistrado().toLowerCase().equals("si")) {
                //   JsfUtil.addErrorMessage("Usted esta debidamente inscrito en los talleres.");
                setLogeado(true);
                mySessionBean.setIdfacultad(estudiantes.getIdfacultad());
                inscripcionBeans.CargarListaInscripcionConsulta(estudiantes.getCedula(), estudiantes.getIdfacultad());
                return "inscripcionconsulta";
            }
            JsfUtil.addSuccessMessage("Bienvenido " + estudiantes.getNombre());
            setLogeado(true);
            mySessionBean.setIdfacultad(estudiantes.getIdfacultad());
            rs.close();
            psquery.close();
            mySessionBean.con.close();


            inscripcionBeans.CargarListaInscripcion();


            prioridadesBeans.CargarCombo();
            return "inscripcion";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. VerificarLogin()");
        }

        return null;

    }

    public String Consultar() {

        try {
            String recibopago = estudiantes.getRecibopago();
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from estudiantes where  cedula = ?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setString(1, estudiantes.getCedula());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existe estudiante con esa cedula: " + estudiantes.getCedula());
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
            estudiantes.setCedula(rs.getString("cedula"));
            estudiantes.setCarrera(rs.getString("carrera"));
            estudiantes.setDireccion(rs.getString("direccion"));
            estudiantes.setEmail(rs.getString("email"));
            estudiantes.setIdfacultad(rs.getInt("idfacultad"));
            estudiantes.setNombre(rs.getString("nombre"));
            estudiantes.setRegistrado(rs.getString("registrado"));
            estudiantes.setTelefono(rs.getString("telefono"));
            if (rs.getString("recibopago") == null) {
                estudiantes.setRecibopago("");
            } else {
                estudiantes.setRecibopago(rs.getString("recibopago"));
            }


        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. VerificarLogin()");
        }
    }

    public String ActualizarRecibo() {

        try {
            if (estudiantes.getRecibopago() == null || estudiantes.getRecibopago().equals("")) {

                JsfUtil.addErrorMessage("Por favor ingrese el numero de recibo");
                return null;
            }

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update estudiantes set recibopago =? where cedula =?";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, estudiantes.getRecibopago());
            psquery.setString(2, estudiantes.getCedula());
            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el numero de recibo ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se actualizo el recibo de pago ");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ActualizarRecibo()");
        }

        return null;

    }

    public String Eliminar() {

        try {

            if (ConsultarSiTieneReservacion()) {
                JsfUtil.addErrorMessage("El estudiante tiene una reservación. No se puede eliminar");
                return null;
            }
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "delete from estudiantes  where cedula =?";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, estudiantes.getCedula());
            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo eliminar el numero de recibo ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se elimino el estudiante ");
            return "/administrador/listadoestudiantes";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ActualizarRecibo()");
        }

        return null;

    }

    public String Agregar() {

        try {


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "insert into  estudiantes (cedula,nombre,idfacultad,carrera,telefono,direccion,email,grupo,registrado,recibopago)"
                    + " values(?,?,?,?,?,?,?,?,?,?)";



            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, estudiantes.getCedula());
            psquery.setString(2, estudiantes.getNombre());
            psquery.setInt(3, mySessionBean.getIdfacultad());
            psquery.setString(4, estudiantes.getCarrera());
            psquery.setString(5, estudiantes.getTelefono());
            psquery.setString(6, estudiantes.getDireccion());
            psquery.setString(7, estudiantes.getEmail());
            psquery.setString(8, estudiantes.getGrupo());
            psquery.setString(9, "no");
            psquery.setString(10, estudiantes.getRecibopago());
            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo agregar el estudiantes ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se agrego el estudiante... ");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Agregar()");
        }

        return null;

    }

    public String Actualizar() {

        try {


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update  estudiantes set nombre =?,idfacultad=?,carrera=?,telefono=?,direccion=?,email=?,grupo=?,registrado=?,recibopago=?"
                    + " where cedula =?";

            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);


            psquery.setString(1, estudiantes.getNombre());
            psquery.setInt(2, mySessionBean.getIdfacultad());
            psquery.setString(3, estudiantes.getCarrera());
            psquery.setString(4, estudiantes.getTelefono());
            psquery.setString(5, estudiantes.getDireccion());
            psquery.setString(6, estudiantes.getEmail());
            psquery.setString(7, estudiantes.getGrupo());
            psquery.setString(8, "no");
            psquery.setString(9, estudiantes.getRecibopago());
            psquery.setString(10, estudiantes.getCedula());
            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el estudiantes ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se actualizo el estudiante... ");
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Agregar()");
        }

        return null;

    }

    public String Limpiar() {
//estudiantes.setCedula("");
        estudiantes.setCarrera("");
        estudiantes.setDireccion("");
        estudiantes.setEmail("");
        estudiantes.setIdfacultad(0);
        estudiantes.setNombre("");
        estudiantes.setRegistrado("");
        estudiantes.setTelefono("");
        estudiantes.setRecibopago("");
        return null;
    }

    public String CargarLista() {

        try {


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from estudiantes where idfacultad ='" + mySessionBean.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de estudiantes en esta facultad " + mySessionBean.getIdfacultad());
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                return null;
            }

            rs.beforeFirst();
            estudianteslist.removeAll(estudianteslist);
            while (rs.next()) {


                estudianteslist.add(new Estudiantes(
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getInt("idfacultad"),
                        rs.getString("carrera"),
                        rs.getString("telefono"),
                        rs.getString("direccion"),
                        rs.getString("email"),
                        rs.getString("grupo"),
                        rs.getString("registrado"),
                        rs.getString("recibopago")));


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

    public String ConsultarInscripcion() {

        try {
            tieneRegistrosInscripcion = false;
            // String recibopago = estudiantes.getRecibopago();
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from estudiantes where  cedula = ?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setString(1, estudiantes.getCedula());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existe estudiante con esa cedula: " + estudiantes.getCedula());
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                return null;
            }

            Cargar(rs);
            rs.close();
            psquery.close();
            mySessionBean.con.close();


            if (estudiantes.getRegistrado().toLowerCase().equals("si")) {
                //   JsfUtil.addErrorMessage("Usted esta debidamente inscrito en los talleres.");
                prioridadesBeans.CargarCombo();
                mySessionBean.setIdfacultad(estudiantes.getIdfacultad());
                inscripcionBeans.CargarListaInscripcionConsulta(estudiantes.getCedula(), estudiantes.getIdfacultad());
                tieneRegistrosInscripcion = true;
                return null;
            } else {
                JsfUtil.addSuccessMessage("No tiene registrada ninguna inscripción...");
                tieneRegistrosInscripcion = false;
            }

            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. VerificarLogin()");
        }

        return null;

    }

    public boolean ConsultarSiTieneReservacion() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return false;
            }

            String sqlquery = "select * from reservacion where  cedula = ?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setString(1, estudiantes.getCedula());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            rs.close();
            psquery.close();

            mySessionBean.con.close();
            if (x == 0) {

                return false;
            }



            return true;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. ConsultarSiTieneReservacion()");
        }

        return false;

    }

    public String logout() {

        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "/inicio";
    }
}
