/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.facultad;

import org.avbravo.inscripcion.beans.facultad.Facultad;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.avbravo.inscripcion.JsfUtil;
import org.avbravo.inscripcion.beans.MySessionBean;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class FacultadBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    Facultad facultad;
    SelectItem[] facultadesCombo;

    /** Creates a new instance of FacultadBeans */
    public FacultadBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        facultad = (Facultad) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "facultad");


    }

    public SelectItem[] getFacultadesCombo() {
        return facultadesCombo;
    }

    public void setFacultadesCombo(SelectItem[] facultadesCombo) {
        this.facultadesCombo = facultadesCombo;
    }

    public String CargarCombo() {
        try {
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select  * from facultad ";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de facultades ");
                mySessionBean.con.close();
                return null;
            }
            rs.last();
            int n = rs.getRow();
            facultadesCombo = new SelectItem[n];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                facultadesCombo[contador] = new SelectItem(String.valueOf(rs.getInt("idfacultad")), rs.getString("facultad"));
                contador++;

            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();

            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarCombo()");
        }

        return null;
    }
}
