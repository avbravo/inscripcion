    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans;

import org.avbravo.inscripcion.beans.prioridades.PrioridadesBeans;
import java.io.Serializable;
import java.sql.PreparedStatement;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.avbravo.inscripcion.JsfUtil;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class ReservacionBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
   
    PrioridadesBeans prioridadesBeans;

    /** Creates a new instance of ReservacionBeans */
    public ReservacionBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();

        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
       
        prioridadesBeans = (PrioridadesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridadesBeans");
    }

    /*
     * Actualiza las prioridades
     *
     */
    public String ActualizarPrioridades(String lidtaller, String lcedula) {

        try {
            prioridadesBeans.ConsultarPrioridades();
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }


            String sqlupdate = " update reservacion  set prioridad = '" + prioridadesBeans.getMaximo_reserva() + "'"
                    + " where reservacion.cedula ='" + lcedula + "'"
                    + " and reservacion.idfacultad=" + mySessionBean.getIdfacultad() + ""
                    + " and reservacion.idtaller='" + lidtaller + "'";

            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);
            int count = psquery.executeUpdate();
            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el cupo tomado ");
                psquery.close();
                mySessionBean.con.close();
                return null;
            }

            psquery.close();
            mySessionBean.con.close();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e.getLocalizedMessage().toString(), "Error. ActualizarPrioridades()");
        }

        return null;

    }
}
