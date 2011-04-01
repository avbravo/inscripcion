/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class AsignadorTalleresAutomaticosTest {

    public AsignadorTalleresAutomaticosTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of AsignacionAutomatica method, of class AsignadorTalleresAutomaticos.
     */
    @Test
    public void testAsignacionAutomatica() {
        System.out.println("AsignacionAutomatica");
        AsignadorTalleresAutomaticos instance = new AsignadorTalleresAutomaticos();
        String expResult = "";
        String result = instance.AsignacionAutomatica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarListaTalleres method, of class AsignadorTalleresAutomaticos.
     */
    @Test
    public void testCargarListaTalleres() {
        System.out.println("CargarListaTalleres");
        AsignadorTalleresAutomaticos instance = new AsignadorTalleresAutomaticos();
        String expResult = "";
        String result = instance.CargarListaTalleres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarListaReservacion method, of class AsignadorTalleresAutomaticos.
     */
    @Test
    public void testCargarListaReservacion() {
        System.out.println("CargarListaReservacion");
        String lidtaller = "";
        AsignadorTalleresAutomaticos instance = new AsignadorTalleresAutomaticos();
        String expResult = "";
        String result = instance.CargarListaReservacion(lidtaller);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}