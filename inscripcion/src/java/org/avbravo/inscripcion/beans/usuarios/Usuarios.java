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
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
private String username;
private String nombre;
private String grupo;
private String password;
private String activo;
private int    idfacultad;

private boolean logeado;

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    /** Creates a new instance of Usuarios */
    public Usuarios() {
    }

    public Usuarios(String username, String nombre, String grupo, String password, String activo, int idfacultad) {
        this.username = username;
        this.nombre = nombre;
        this.grupo = grupo;
        this.password = password;
        this.activo = activo;
        this.idfacultad = idfacultad;
    }
    

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
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
