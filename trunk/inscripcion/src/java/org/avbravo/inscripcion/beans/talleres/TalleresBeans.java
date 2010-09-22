/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.talleres;

import org.avbravo.inscripcion.beans.talleres.Talleres;
import org.avbravo.inscripcion.beans.prioridades.PrioridadesBeans;
import org.avbravo.inscripcion.beans.estudiantes.Estudiantes;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.avbravo.inscripcion.JsfUtil;
import org.avbravo.inscripcion.beans.MySessionBean;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class TalleresBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    Talleres talleres;
    PrioridadesBeans prioridadesBeans;
    private List<Talleres> tallereslist;
    private List<Estudiantes> talleresEstudianteslist;
    private Talleres selectedTalleres;
    SelectItem[] talleresCombo;
    String opcionActual;

    public String prepararVista() {
        try {
            talleres.setIdtaller(selectedTalleres.getIdtaller());
            Consultar();

            return "/administrador/tallereseditar";
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, "Error  ");
        }
        return null;
    }

    /** Creates a new instance of EstudiantesBeans */
    public TalleresBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();

        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        talleres = (Talleres) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "talleres");
        prioridadesBeans = (PrioridadesBeans) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "prioridadesBeans");
        tallereslist = new ArrayList<Talleres>();
        talleresEstudianteslist = new ArrayList<Estudiantes>();
    }

    public List<Estudiantes> getTalleresEstudianteslist() {
        return talleresEstudianteslist;
    }

    public void setTalleresEstudianteslist(List<Estudiantes> talleresEstudianteslist) {
        this.talleresEstudianteslist = talleresEstudianteslist;
    }

    public String getOpcionActual() {
        return opcionActual;
    }

    public void setOpcionActual(String opcionActual) {
        this.opcionActual = opcionActual;
    }

    public SelectItem[] getTalleresCombo() {
        return talleresCombo;
    }

    public void setTalleresCombo(SelectItem[] talleresCombo) {
        this.talleresCombo = talleresCombo;
    }

    public Talleres getSelectedTalleres() {
        return selectedTalleres;
    }

    public void setSelectedTalleres(Talleres selectedTalleres) {
        this.selectedTalleres = selectedTalleres;
    }

    public List<Talleres> getTallereslist() {
        return tallereslist;
    }

    public void setTallereslist(List<Talleres> tallereslist) {
        this.tallereslist = tallereslist;
    }

    public String CargarLista() {

        try {



            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from talleres where idfacultad ='" + mySessionBean.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();

            tallereslist.removeAll(tallereslist);

            while (rs.next()) {


                tallereslist.add(new Talleres(
                        rs.getString("idtaller"),
                        rs.getString("taller"),
                        rs.getString("descripcion"),
                        rs.getString("fecha"),
                        rs.getString("horainicio"),
                        rs.getString("horaterminacion"),
                        rs.getString("lugar"),
                        rs.getInt("cupos"),
                        rs.getString("abierto"),
                        rs.getInt("tomados"),
                        rs.getString("expositor"),
                        rs.getString("url"),
                        rs.getString("foto"),
                        rs.getInt("idfacultad")));


            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return "null";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarLista()");
        }

        return null;

    }

    /*
     *
     * lista de estudiantes por talleres
     */
    public String CargarListaEstudiantesTalleres() {

        try {

            // ELContext elContext = FacesContext.getCurrentInstance().getELContext();

            // mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }


            String sqlquery = "select estudiantes.*, talleres.* "
                    + " from estudiantes,talleres,reservacion, prioridades  "
                    + " where talleres.idfacultad ='" + mySessionBean.getIdfacultad() + "' "
                    + " and estudiantes.cedula = reservacion.cedula "
                    + " and reservacion.idfacultad = talleres.idfacultad "
                    + " and reservacion.idtaller = '" + this.opcionActual + "'"
                    + " and talleres.idtaller = '" + this.opcionActual + "'"
                    + " and reservacion.prioridad <= prioridades.maximo_reserva "
                    + " and prioridades.idfacultad = talleres.idfacultad";




            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();

            talleresEstudianteslist.removeAll(talleresEstudianteslist);
            int i = 0;
            while (rs.next()) {
                if (i == 0) {
                    talleres.setIdtaller(rs.getString("idtaller"));
                    talleres.setTaller(rs.getString("taller"));
                    talleres.setExpositor(rs.getString("expositor"));
                    talleres.setCupos(rs.getInt("cupos"));
                    talleres.setFecha(rs.getString("fecha"));
                    talleres.setHorainicio(rs.getString("horainicio"));
                    talleres.setHoraterminacion(rs.getString("horaterminacion"));
                    talleres.setLugar(rs.getString("lugar"));
                    i++;
                }

                talleresEstudianteslist.add(new Estudiantes(
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getInt("idfacultad"),
                        rs.getString("telefono"),
                        rs.getString("email")));




            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();


            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarListaEstudiantesTalleres()");
        }

        return null;

    }

    public String CargarListaEstudiantesReservacion() {

        try {

            // ELContext elContext = FacesContext.getCurrentInstance().getELContext();

            // mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }


            String sqlquery = "select estudiantes.* "
                    + " from estudiantes,reservacion, prioridades  "
                    + " where reservacion.idfacultad ='" + mySessionBean.getIdfacultad() + "' "
                    + " and estudiantes.cedula = reservacion.cedula "
                    + " and reservacion.idtaller = '" + this.opcionActual + "'"
                    + " and reservacion.prioridad > prioridades.maximo_reserva "
                    + " and prioridades.idfacultad = reservacion.idfacultad"
                    + " order by reservacion.id     ";




            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();

            talleresEstudianteslist.removeAll(talleresEstudianteslist);

            while (rs.next()) {


                talleresEstudianteslist.add(new Estudiantes(
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getInt("idfacultad"),
                        rs.getString("telefono"),
                        rs.getString("email")));




            }
            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. CargarListaEstudiantesTalleres()");
        }

        return null;

    }

    public String CargarCombo() {
        try {
            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from talleres where idfacultad ='" + mySessionBean.getIdfacultad() + "'";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de talleres en esta facultad ");
                mySessionBean.con.close();
                return null;
            }
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            talleresCombo = new SelectItem[row];
            int c = 0;
            while (rs.next()) {


                talleresCombo[c] = new SelectItem(rs.getString("idtaller"), rs.getString("taller"));
                c++;

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

    public String Consultar() {

        try {


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from talleres where  idtaller = ? and idfacultad =?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setString(1, talleres.getIdtaller());
            psquery.setInt(2, mySessionBean.getIdfacultad());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existe talleres con ese codigo: " + talleres.getIdtaller());
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                Limpiar();
                return null;
            }

            Cargar(rs);


            rs.close();
            psquery.close();
            mySessionBean.con.close();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Consultar()");
        }

        return null;

    }

    private void Cargar(ResultSet rs) {
        try {
            talleres.setIdtaller(rs.getString("idtaller"));
            talleres.setTaller(rs.getString("taller"));
            talleres.setDescripcion(rs.getString("descripcion"));
            talleres.setFecha(rs.getString("fecha"));
            talleres.setHorainicio(rs.getString("horainicio"));
            talleres.setHoraterminacion(rs.getString("horaterminacion"));
            talleres.setLugar(rs.getString("lugar"));
            talleres.setCupos(rs.getInt("cupos"));
            talleres.setAbierto(rs.getString("abierto"));
            talleres.setTomados(rs.getInt("tomados"));
            talleres.setExpositor(rs.getString("expositor"));
            talleres.setUrl(rs.getString("url"));
            talleres.setFoto(rs.getString("foto"));
            talleres.setIdfacultad(rs.getInt("idfacultad"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Cargar()");
        }
    }

    public void Limpiar() {
        talleres.setIdtaller("");
        talleres.setTaller("");
        talleres.setDescripcion("");
        //talleres.setFecha();
        talleres.setHorainicio("");
        talleres.setHoraterminacion("");
        talleres.setLugar("");
        talleres.setCupos(0);
        talleres.setAbierto("");
        talleres.setTomados(0);
        talleres.setExpositor("");
        talleres.setUrl("");
        talleres.setFoto("");
        talleres.setIdfacultad(0);
    }

    public String Agregar() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "insert into talleres (idtaller,taller,descripcion,fecha, "
                    + "horainicio, horaterminacion, lugar, cupos, abierto, tomados,"
                    + "expositor, url,foto,idfacultad)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);

            psquery.setString(1, talleres.getIdtaller());
            psquery.setString(2, talleres.getTaller());
            psquery.setString(3, talleres.getDescripcion());
            psquery.setString(4, talleres.getFecha());
            psquery.setString(5, talleres.getHorainicio());
            psquery.setString(6, talleres.getHoraterminacion());
            psquery.setString(7, talleres.getLugar());
            psquery.setInt(8, talleres.getCupos());
            psquery.setString(9, talleres.getAbierto());
            psquery.setInt(10, talleres.getTomados());
            psquery.setString(11, talleres.getExpositor());
            psquery.setString(12, talleres.getUrl());
            psquery.setString(13, talleres.getFoto());
            psquery.setInt(14, mySessionBean.getIdfacultad());

            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo guardar el taller ");
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se guardo el taller ");
            Limpiar();
            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Agregar()");
        }

        return null;

    }

    public String Editar() {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update  talleres set taller=?,descripcion=?,fecha =?, "
                    + "horainicio=?, horaterminacion=?, lugar=?, cupos=?, abierto=?, tomados=?,"
                    + "expositor=?, url=?,foto=? where idtaller =? and idfacultad =?";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);


            psquery.setString(1, talleres.getTaller());
            psquery.setString(2, talleres.getDescripcion());
            psquery.setString(3, talleres.getFecha());
            psquery.setString(4, talleres.getHorainicio());
            psquery.setString(5, talleres.getHoraterminacion());
            psquery.setString(6, talleres.getLugar());
            psquery.setInt(7, talleres.getCupos());
            psquery.setString(8, talleres.getAbierto());
            psquery.setInt(9, talleres.getTomados());
            psquery.setString(10, talleres.getExpositor());
            psquery.setString(11, talleres.getUrl());
            psquery.setString(12, talleres.getFoto());
            psquery.setString(13, talleres.getIdtaller());
            psquery.setInt(14, mySessionBean.getIdfacultad());

            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizr el taller ");
                psquery.close();
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            JsfUtil.addSuccessMessage("Se actualizo el taller ");

            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. Actualizar()");
        }

        return null;

    }

    public String ActualizarCuposTomados(String lidtaller, int lidfacultad) {

        try {

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String sqlupdate = "update  talleres set tomados = tomados + 1 where idtaller =? and idfacultad =?";


            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlupdate);


            psquery.setString(1, lidtaller);
            psquery.setInt(2, lidfacultad);

            int count = psquery.executeUpdate();


            if (count == 0) {
                JsfUtil.addErrorMessage("No se pudo actualizar el cupo tomado ");
                psquery.close();
                mySessionBean.con.close();
                return null;
            }


            psquery.close();
            mySessionBean.con.close();
            //   JsfUtil.addErrorMessage("Se actualizo el taller ");

            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e.getLocalizedMessage().toString(), "Error. ActualizarCuposTomados()");
        }

        return null;

    }

    public String ImprimirEstudiantesTalleres() {
        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("idfacultad", String.valueOf(mySessionBean.getIdfacultad()));

            mySessionBean.imprimir();

//            mySessionBean.crearReportes("estudiantestalleres","estudiantestalleres",params);
        } catch (Exception ex) {
            JsfUtil.addErrorMessage(ex.getLocalizedMessage().toString(), "ImprimirEstudiantesTalleres()");
        }
        return null;

    }

    public void imprimir() {
        Document document = new Document(PageSize.LETTER);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(document, baos);
            //METADATA
            document.addTitle("estudiantes por talleres");
            document.addSubject("Listado de los estudiantes inscritos ");
            document.addKeywords("Metadata, iText, talleres, estudiantes");
            document.addCreator("My program using iText");
            document.addAuthor("inscripcion web applicacion");
            document.addHeader("Expires", "0");
                 //BaseFont bf_symbol = BaseFont.createFont(BaseFont.SYMBOL, "Cp1252", false);
           //HeaderFooter header = new HeaderFooter( new Phrase("This is a header without a page number", new Font(bf_symbol)), false);
            //header.setAlignment(Element.ALIGN_CENTER);
            //document.setHeader(header);
            document.open();

            document.add(new Paragraph("        ESTUDIANTES INSCRITOS"));
            document.add(new Paragraph("Taller: " + talleres.getTaller()));
            document.add(new Paragraph("Expositor: " + talleres.getExpositor()));
            document.add(new Paragraph("Fecha: " + talleres.getFecha()));
            document.add(new Paragraph("Hora Inicio: " + talleres.getHorainicio() + "   Hora Terminacion: " + talleres.getHoraterminacion()));
            document.add(new Paragraph("Lugar: " + talleres.getLugar()));
            document.add(new Paragraph("---------------------------------"));
            //document.add(new Paragraph(new java.util.Date().toString()));

            PdfPTable table = new PdfPTable(4);
            PdfPCell cell = new PdfPCell(new Paragraph("inscritros"));
            cell.setColspan(4);
            table.addCell(cell);
            table.addCell("Nombre");
            table.addCell("Cedula");
            table.addCell("Telefono");
            table.addCell("Email");

            for (int i = 0; i < talleresEstudianteslist.size(); i++) {
                Estudiantes id = talleresEstudianteslist.get(i);
//                tseleccion[id.getPrioridad()]++;
                table.addCell(id.getNombre());
                table.addCell(id.getCedula());
                table.addCell(id.getTelefono());
                table.addCell(id.getEmail());
                
                //   document.add(new Paragraph(id.getNombre() + " " + id.getCedula() + " " + id.getTelefono() + " " + id.getEmail()));
            }
            document.add(table);
        } catch (Exception ex) {
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
