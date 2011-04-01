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
public class UsuariosRegistrosBeansTest {

    public UsuariosRegistrosBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of Agregar method, of class UsuariosRegistrosBeans.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        UsuariosRegistrosBeans instance = new UsuariosRegistrosBeans();
        String expResult = "";
        String result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class UsuariosRegistrosBeans.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        UsuariosRegistrosBeans instance = new UsuariosRegistrosBeans();
        String expResult = "";
        String result = instance.Limpiar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}