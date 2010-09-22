/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.avbravo.inscripcion.JsfUtil;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class MySessionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    // @ManagedProperty(value = "")
    private String version = "Version:0.0.12";
    private java.sql.Date fechaSesion;
    private String iniciarSistema;
    static String server = "localhost:3306";
    static String databaseDB = "congreso";
    static String puertoDB = "3306";
    static String userDB = "root";
    static String passwordDB = "denver";
    String driver = "org.gjt.mm.mysql.Driver";
    public Connection con = null;
    private int idfacultad;
    private String ruta = "recursos/reportes/";

    /** Creates a new instance of MySessionBean */
    public MySessionBean() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getFechaSesion() {
        java.util.Calendar ca = java.util.Calendar.getInstance();
        fechaSesion = new java.sql.Date(ca.getTimeInMillis());

        return fechaSesion;
    }

    public void setFechaSesion(Date fechaSesion) {
        this.fechaSesion = fechaSesion;
    }

    public String englishAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(Locale.ENGLISH);


        return null;
    }

    public String spanishAction() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(new Locale("es"));
        return null;
    }

    public boolean Conectar() {
        try {

            Context ctx = new InitialContext();
            if (ctx == null) {
                JsfUtil.addSuccessMessage("No initial context");
                return false;
            }
            DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/congreso");
            if (ds == null) {
                JsfUtil.addSuccessMessage("No data source");
                return false;
            }

            con = ds.getConnection();

            if (con == null) {
                System.out.println("No se pudo establecer la conexion ");
                return false;
            }
            return true;

        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, "Error");
            // System.exit(1);
        }
        return false;
    }

    public String getDir() {
        return ((ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext()).getRealPath("/");
    }



    public void imprimir() {
        Document document = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(document, baos);
            document.open();
            String msg = "Esto va a ser una buena prueba";
            document.add(new Paragraph("hola mundo"));
            document.add(new Paragraph("aristides villarreal bravo"));
            document.add(new Paragraph(new java.util.Date().toString()));
        } catch (DocumentException ex) {
            JsfUtil.addErrorMessage("Error en generación de documento paraimprimir");
        }
        document.close();
        FacesContext context = FacesContext.getCurrentInstance();
        Object response = context.getExternalContext().getResponse();

        if (response instanceof HttpServletResponse) {

            HttpServletResponse hsr = (HttpServletResponse) response;

            hsr.setContentType("application/pdf");
            hsr.setHeader("Content-disposition", "attachment");
            hsr.setContentLength(baos.size());

            try {
                ServletOutputStream out = hsr.getOutputStream();
                baos.writeTo(out);
                out.flush();
            } catch (IOException ex) {
                JsfUtil.addErrorMessage("Error en generación de documento para imprimir");
            }

            //Tell JSF to skip the remaining phases of the lifecycle
            context.responseComplete();
        }
    }
}
