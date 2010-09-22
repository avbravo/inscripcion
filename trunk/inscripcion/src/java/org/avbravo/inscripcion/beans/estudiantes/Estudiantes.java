/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.estudiantes;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cedula;
    private String nombre;
    private int idfacultad;
    private String carrera;
    private String telefono;
    private String direccion;
    private String email;
    private String grupo;
    private String registrado;
    private String recibopago;

    /** Creates a new instance of Estudiantes */
    public Estudiantes() {
    }

    public Estudiantes(String cedula, String nombre, int idfacultad, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.idfacultad = idfacultad;
        this.telefono = telefono;
        this.email = email;
    }

    
    public Estudiantes(String cedula, String nombre, int idfacultad, String carrera, String telefono, String direccion, String email, String grupo, String registrado, String recibopago) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.idfacultad = idfacultad;
        this.carrera = carrera;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.grupo = grupo;
        this.registrado = registrado;
        this.recibopago = recibopago;
    }


    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


    public String getRecibopago() {
        return recibopago;
    }

    public void setRecibopago(String recibopago) {
        this.recibopago = recibopago;
    }

  

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getRegistrado() {
        return registrado;
    }

    public void setRegistrado(String registrado) {
        this.registrado = registrado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String Limpiar(){
          this.cedula = "";
        this.nombre = "";

        this.carrera = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.grupo = "";
        this.registrado = "";
        this.recibopago = "";
        return null;

    }
}
