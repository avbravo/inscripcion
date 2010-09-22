/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.facultad;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class Facultad implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idfacultad;
    private String facultad;
    private String logo;
    private String url;

    /** Creates a new instance of Facultad */
    public Facultad() {
    }

    public Facultad(int idfacultad, String facultad, String logo, String url) {
        this.idfacultad = idfacultad;
        this.facultad = facultad;
        this.logo = logo;
        this.url = url;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
}
