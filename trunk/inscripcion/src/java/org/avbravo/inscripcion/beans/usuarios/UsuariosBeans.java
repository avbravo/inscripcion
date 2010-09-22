/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.inscripcion.beans.usuarios;

import org.avbravo.inscripcion.beans.usuarios.Usuarios;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.avbravo.inscripcion.JsfUtil;
import org.avbravo.inscripcion.beans.MySessionBean;

/**
 *
 * @author avbravo
 */
@ManagedBean
@SessionScoped
public class UsuariosBeans implements Serializable {

    private static final long serialVersionUID = 1L;
    MySessionBean mySessionBean;
    Usuarios usuarios;
    boolean logeado = false;
    private String iniciarSistema;
    private int idfacultad;
    private List<Usuarios> usuarioslist;
    private Usuarios selectedUsuarios;

    /** Creates a new instance of UsuariosBeans */
    public UsuariosBeans() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();

        mySessionBean = (MySessionBean) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "mySessionBean");
        usuarios = (Usuarios) FacesContext.getCurrentInstance().getApplication().getELResolver().getValue(elContext, null, "usuarios");
        usuarioslist = new ArrayList<Usuarios>();
    }

    public Usuarios getSelectedUsuarios() {
        return selectedUsuarios;
    }

    public void setSelectedUsuarios(Usuarios selectedUsuarios) {
        this.selectedUsuarios = selectedUsuarios;
    }

    public List<Usuarios> getUsuarioslist() {
        return usuarioslist;
    }

    public void setUsuarioslist(List<Usuarios> usuarioslist) {
        this.usuarioslist = usuarioslist;
    }

    

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public String getIniciarSistema() {
        Limpiar();
        setLogeado(false);
        return null;

    }

    public String VerificarLogin() {

        try {
            // JsfUtil.addErrorMessage("logeado...");
            setLogeado(false);

            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }
            String password = usuarios.getPassword();
            String sqlquery = "select * from usuarios where  username = ?";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);
            psquery.setString(1, usuarios.getUsername());
            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existe un usuario con ese username");
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                return null;
            }
            Cargar(rs);
            rs.close();
            psquery.close();

            mySessionBean.con.close();

            if (usuarios.getActivo().toLowerCase().equals("no")) {
                JsfUtil.addErrorMessage("Este usuario no esta activo");
                return null;
            }
            if (!usuarios.getPassword().toLowerCase().equals(password.toLowerCase())) {
                JsfUtil.addErrorMessage("El password no es correcto. Verifiquelo..");
                return null;
            }
            JsfUtil.addSuccessMessage("Bienvenido " + usuarios.getNombre());
            setLogeado(true);
            mySessionBean.setIdfacultad(usuarios.getIdfacultad());
            return "/administrador/administradormenu";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Error. VerificarLogin()");
        }

        return null;

    }

    private void Cargar(ResultSet rs) {
        try {
            usuarios.setUsername(rs.getString("username"));
            usuarios.setNombre(rs.getString("nombre"));
            usuarios.setGrupo(rs.getString("grupo"));
            usuarios.setPassword(rs.getString("password"));
            usuarios.setActivo(rs.getString("activo"));
            usuarios.setIdfacultad(rs.getInt("idfacultad"));
        } catch (Exception ex) {
        }
    }

    public String logout() {

        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "/administrador";
    }

    public String Limpiar() {
        /*
        usuarios.setActivo("no");
        usuarios.setGrupo("");
        usuarios.setIdfacultad(0);
        usuarios.setNombre("");
        usuarios.setPassword("");
        usuarios.setUsername("");
         */
        return null;
    }

    public String CargarLista() {

        try {


            if (mySessionBean.Conectar() == false) {
                JsfUtil.addErrorMessage("No se pudo conectar a la base de datos");
                return null;
            }

            String sqlquery = "select * from usuarios";
            PreparedStatement psquery = mySessionBean.con.prepareStatement(sqlquery);

            ResultSet rs = psquery.executeQuery();
            rs.next();
            int x = rs.getRow();
            if (x == 0) {
                JsfUtil.addErrorMessage("No existen registros de usuarios");
                rs.close();
                psquery.close();
                mySessionBean.con.close();
                return null;
            }

            rs.beforeFirst();
            usuarioslist.removeAll(usuarioslist);
            while (rs.next()) {

                usuarioslist.add(new Usuarios(
                        rs.getString("username"),
                        rs.getString("nombre"),
                        rs.getString("grupo"),
                        rs.getString("password"),
                        rs.getString("activo"),
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
}
