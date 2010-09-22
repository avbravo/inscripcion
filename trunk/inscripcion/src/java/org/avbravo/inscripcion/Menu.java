/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion;

import org.avbravo.inscripcion.beans.talleres.TalleresBeans;
import org.avbravo.inscripcion.beans.estudiantes.EstudiantesBeans;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.avbravo.inscripcion.beans.facultad.FacultadBeans;
import org.avbravo.inscripcion.beans.prioridades.PrioridadesBeans;
import org.avbravo.inscripcion.beans.usuarios.UsuariosBeans;

/**
 *
 * @author avbravo
 */
@ManagedBean
@RequestScoped
public class Menu {

    EstudiantesBeans estudiantesBeans;
    FacultadBeans facultadBeans;
    TalleresBeans talleresBeans;
    PrioridadesBeans prioridadesBeans;
    UsuariosBeans usuariosBeans;

    /** Creates a new instance of Menu */
    public Menu() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        estudiantesBeans = (EstudiantesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "estudiantesBeans");
        facultadBeans = (FacultadBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "facultadBeans");
        talleresBeans = (TalleresBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "talleresBeans");
        prioridadesBeans = (PrioridadesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridadesBeans");
        usuariosBeans = (UsuariosBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "usuariosBeans");
    }

    /*
     * Regresar
     * 
     */
    public String RegresarMenuAdministrador() {
        return "/administrador/administradormenu";
    }
    /*
     * 
     * adminitrador
     */

    public String RegistrarPago() {
        return "/administrador/registrarpago";
    }

    public String AdministradorLogin() {
        return "/administrador";
    }

    public String EditarInscripcion() {
        return "/administrador/editarinscripcion";
    }

    public String Reportes() {
        return "/administrador/reportesestudiantestalleres";
    }

    public String ListadoUsuarios() {
        usuariosBeans.CargarLista();
        return "/administrador/listadousuarios";
    }

    public String UsuariosAgregar() {
        facultadBeans.CargarCombo();
        return "/administrador/usuariosagregar";
    }
    /*
     *
     * Estudiantes
     */

    public String EstudiantesLogin() {
        return "inicio";
    }

    public String ListadoEstudiantes() {
        estudiantesBeans.CargarLista();
        return "/administrador/listadoestudiantes";
    }

    public String AgregarEstudiantes() {
        estudiantesBeans.Limpiar();

        return "/administrador/estudiantesagregar";
    }

    /*
     * Talleres
     *
     */
    public String ListadoTalleres() {

        talleresBeans.CargarLista();
        return "/administrador/listadotalleres";
    }

    public String ListadoEstudiantesTalleres() {

        talleresBeans.CargarCombo();
        return "/administrador/listadoestudiantestalleres";
    }

    public String ListadoEstudiantesSoloReservacion() {
        talleresBeans.CargarCombo();
        return "/administrador/listadoestudiantessoloreservacion";
    }

    public String TalleresAgregar() {
        return "/administrador/talleresagregar";
    }

    public String TallerAsignarAutomaticamente() {
        return "/administrador/talleresasignarautomaticamente";
    }

    /*
     * Prioridades
     *
     */
    public String ListadoPrioridades() {

        prioridadesBeans.CargarLista();
        return "/administrador/listadoprioridades";
    }

    public String PrioridadesAgregar() {
        return "/administrador/prioridadesagregar";
    }
}
