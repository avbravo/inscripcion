/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String cedula;
    private String idtaller;
    private int prioridad;
    private int idfacultad;
    private Date fecha;

    /** Creates a new instance of Reservacion */
    public Reservacion() {
    }

    public Reservacion(int id, String cedula, String idtaller, int prioridad, int idfacultad, Date fecha) {
        this.id = id;
        this.cedula = cedula;
        this.idtaller = idtaller;
        this.prioridad = prioridad;
        this.idfacultad = idfacultad;
        this.fecha = fecha;
    }

    public Reservacion(String cedula, String idtaller) {
        this.cedula = cedula;
        this.idtaller = idtaller;
    }

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getIdtaller() {
        return idtaller;
    }

    public void setIdtaller(String idtaller) {
        this.idtaller = idtaller;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

   
}
