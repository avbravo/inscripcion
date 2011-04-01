/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.usuarios;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class UsuariosTest {

    public UsuariosTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getIdfacultad method, of class Usuarios.
     */
    @Test
    public void testGetIdfacultad() {
        System.out.println("getIdfacultad");
        Usuarios instance = new Usuarios();
        int expResult = 0;
        int result = instance.getIdfacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdfacultad method, of class Usuarios.
     */
    @Test
    public void testSetIdfacultad() {
        System.out.println("setIdfacultad");
        int idfacultad = 0;
        Usuarios instance = new Usuarios();
        instance.setIdfacultad(idfacultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class Usuarios.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setActivo method, of class Usuarios.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        String activo = "";
        Usuarios instance = new Usuarios();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class Usuarios.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class Usuarios.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        String grupo = "";
        Usuarios instance = new Usuarios();
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuarios.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuarios.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuarios instance = new Usuarios();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Usuarios.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Usuarios.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuarios instance = new Usuarios();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Usuarios.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Usuarios.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Usuarios instance = new Usuarios();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}