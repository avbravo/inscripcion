/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.prioridades;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class Prioridades implements Serializable {

    private static final long serialVersionUID = 1L;
private int maximo_prioridad;
private int maximo_reserva;
private int idfacultad;

    /** Creates a new instance of Prioridades */
    public Prioridades() {
    }

    public Prioridades(int maximo_prioridad, int maximo_reserva, int idfacultad) {
        this.maximo_prioridad = maximo_prioridad;
        this.maximo_reserva = maximo_reserva;
        this.idfacultad = idfacultad;
    }


    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
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
    

}
