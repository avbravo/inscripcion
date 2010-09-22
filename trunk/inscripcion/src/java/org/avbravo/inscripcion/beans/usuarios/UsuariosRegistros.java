/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.usuarios;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class UsuariosRegistros implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
private String nombre;
private String grupo="administrador";
private String password;
private String activo="si";
private int    idfacultad;
private String passwordRepetido;
    /** Creates a new instance of UsuariosRegistros */
    public UsuariosRegistros() {
    }

    public UsuariosRegistros(String username, String nombre, String grupo, String password, String activo, int idfacultad) {
        this.username = username;
        this.nombre = nombre;
        this.grupo = grupo;
        this.password = password;
        this.activo = activo;
        this.idfacultad = idfacultad;
    }

    public String getPasswordRepetido() {
        return passwordRepetido;
    }

    public void setPasswordRepetido(String passwordRepetido) {
        this.passwordRepetido = passwordRepetido;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
}
