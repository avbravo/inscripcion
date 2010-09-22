/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.usuarios;

import org.avbravo.inscripcion.beans.usuarios.UsuariosRegistros;
import java.io.Serializable;
import java.sql.PreparedStatement;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.avbravo.inscripcion.JsfUtil;
import org.avbravo.inscripcion.beans.MySessionBean;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class UsuariosRegistrosBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    UsuariosRegistros usuariosRegistros;

    /** Creates a new instance of UsuariosRegistrosBeans */
    public UsuariosRegistrosBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();

        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        usuariosRegistros = (UsuariosRegistros) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "usuariosRegistros");

    }

    public String Agregar() {

        try {

            if (!usuariosRegistros.getPassword().equals(usuariosRegistros.getPasswordRepetido())) {
                JsfUtil.addErrorMessage("El password no coinciden");
                return null;
            }
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "insert into usuarios (username,password,nombre,grupo,activo, idfacultad)"
                    + "values(?,?,?,?,?,?)";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, usuariosRegistros.getUsername());
            psquery.setString(2, usuariosRegistros.getPassword());
            psquery.setString(3, usuariosRegistros.getNombre());
            psquery.setString(4, usuariosRegistros.getGrupo());
            psquery.setString(5, usuariosRegistros.getActivo());
            psquery.setInt(6, usuariosRegistros.getIdfacultad());

            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo guardar el usuario ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se guardo el usuario ");
            Limpiar();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Agregar()");
        }

        return null;

    }

    public String Limpiar() {

        usuariosRegistros.setNombre("");
        usuariosRegistros.setUsername("");
        usuariosRegistros.setPassword("");
        usuariosRegistros.setPasswordRepetido("");
        usuariosRegistros.setGrupo("administrador");



        return null;
    }
}
