/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class MisCombos implements Serializable {

    private static final long serialVersionUID = 1L;

private String opcionActual;
private SelectItem[] activoCombo = new SelectItem[]{
  new SelectItem("si","si") ,
  new SelectItem("no","no")
};


    /** Creates a new instance of MisCombos */
    public MisCombos() {
      
    }

    public SelectItem[] getActivoCombo() {
        return activoCombo;
    }

    public void setActivoCombo(SelectItem[] activoCombo) {
        this.activoCombo = activoCombo;
    }

    public String getOpcionActual() {
        return opcionActual;
    }

    public void setOpcionActual(String opcionActual) {
        this.opcionActual = opcionActual;
    }

   
    

    

}
