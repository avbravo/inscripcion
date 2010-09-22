/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.talleres;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class Talleres implements Serializable {

    private static final long serialVersionUID = 1L;
private String idtaller;
private String taller;
private String descripcion;
private String fecha;
private String horainicio;
private String horaterminacion;
private String lugar;
private int cupos;
private String abierto;
private int tomados;
private String expositor;
private String url;
private String foto;
private int idfacultad;

    public Talleres() {
    }

    public Talleres(String idtaller, String taller, String descripcion, String fecha, String horainicio, String horaterminacion, String lugar, int cupos, String abierto, int tomados, String expositor, String url, String foto, int idfacultad) {
        this.idtaller = idtaller;
        this.taller = taller;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horaterminacion = horaterminacion;
        this.lugar = lugar;
        this.cupos = cupos;
        this.abierto = abierto;
        this.tomados = tomados;
        this.expositor = expositor;
        this.url = url;
        this.foto = foto;
        this.idfacultad = idfacultad;
    }

    public Talleres(String idtaller, String taller, int cupos, int tomados) {
        this.idtaller = idtaller;
        this.taller = taller;
        this.cupos = cupos;
        this.tomados = tomados;
    }


    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    


   


    public String getAbierto() {
        return abierto;
    }

    public void setAbierto(String abierto) {
        this.abierto = abierto;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExpositor() {
        return expositor;
    }

    public void setExpositor(String expositor) {
        this.expositor = expositor;
    }

   

    public String getFoto() {
            return foto;
        }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHoraterminacion() {
        return horaterminacion;
    }

    public void setHoraterminacion(String horaterminacion) {
        this.horaterminacion = horaterminacion;
    }

    public String getIdtaller() {
        return idtaller;
    }

    public void setIdtaller(String idtaller) {
        this.idtaller = idtaller;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public int getTomados() {
        return tomados;
    }

    public void setTomados(int tomados) {
        this.tomados = tomados;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    /** Creates a new instance of Talleres */
    

}
