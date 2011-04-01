/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.usuarios;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class UsuariosBeansTest {

    public UsuariosBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getSelectedUsuarios method, of class UsuariosBeans.
     */
    @Test
    public void testGetSelectedUsuarios() {
        System.out.println("getSelectedUsuarios");
        UsuariosBeans instance = new UsuariosBeans();
        Usuarios expResult = null;
        Usuarios result = instance.getSelectedUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedUsuarios method, of class UsuariosBeans.
     */
    @Test
    public void testSetSelectedUsuarios() {
        System.out.println("setSelectedUsuarios");
        Usuarios selectedUsuarios = null;
        UsuariosBeans instance = new UsuariosBeans();
        instance.setSelectedUsuarios(selectedUsuarios);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioslist method, of class UsuariosBeans.
     */
    @Test
    public void testGetUsuarioslist() {
        System.out.println("getUsuarioslist");
        UsuariosBeans instance = new UsuariosBeans();
        List expResult = null;
        List result = instance.getUsuarioslist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarioslist method, of class UsuariosBeans.
     */
    @Test
    public void testSetUsuarioslist() {
        System.out.println("setUsuarioslist");
        List<Usuarios> usuarioslist = null;
        UsuariosBeans instance = new UsuariosBeans();
        instance.setUsuarioslist(usuarioslist);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isLogeado method, of class UsuariosBeans.
     */
    @Test
    public void testIsLogeado() {
        System.out.println("isLogeado");
        UsuariosBeans instance = new UsuariosBeans();
        boolean expResult = false;
        boolean result = instance.isLogeado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setLogeado method, of class UsuariosBeans.
     */
    @Test
    public void testSetLogeado() {
        System.out.println("setLogeado");
        boolean logeado = false;
        UsuariosBeans instance = new UsuariosBeans();
        instance.setLogeado(logeado);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIniciarSistema method, of class UsuariosBeans.
     */
    @Test
    public void testGetIniciarSistema() {
        System.out.println("getIniciarSistema");
        UsuariosBeans instance = new UsuariosBeans();
        String expResult = "";
        String result = instance.getIniciarSistema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarLogin method, of class UsuariosBeans.
     */
    @Test
    public void testVerificarLogin() {
        System.out.println("VerificarLogin");
        UsuariosBeans instance = new UsuariosBeans();
        String expResult = "";
        String result = instance.VerificarLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class UsuariosBeans.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        UsuariosBeans instance = new UsuariosBeans();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class UsuariosBeans.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        UsuariosBeans instance = new UsuariosBeans();
        String expResult = "";
        String result = instance.Limpiar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarLista method, of class UsuariosBeans.
     */
    @Test
    public void testCargarLista() {
        System.out.println("CargarLista");
        UsuariosBeans instance = new UsuariosBeans();
        String expResult = "";
        String result = instance.CargarLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}