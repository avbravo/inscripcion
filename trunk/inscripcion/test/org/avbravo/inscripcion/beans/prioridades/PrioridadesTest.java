/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.prioridades;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class PrioridadesTest {

    public PrioridadesTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getIdfacultad method, of class Prioridades.
     */
    @Test
    public void testGetIdfacultad() {
        System.out.println("getIdfacultad");
        Prioridades instance = new Prioridades();
        int expResult = 0;
        int result = instance.getIdfacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdfacultad method, of class Prioridades.
     */
    @Test
    public void testSetIdfacultad() {
        System.out.println("setIdfacultad");
        int idfacultad = 0;
        Prioridades instance = new Prioridades();
        instance.setIdfacultad(idfacultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo_prioridad method, of class Prioridades.
     */
    @Test
    public void testGetMaximo_prioridad() {
        System.out.println("getMaximo_prioridad");
        Prioridades instance = new Prioridades();
        int expResult = 0;
        int result = instance.getMaximo_prioridad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximo_prioridad method, of class Prioridades.
     */
    @Test
    public void testSetMaximo_prioridad() {
        System.out.println("setMaximo_prioridad");
        int maximo_prioridad = 0;
        Prioridades instance = new Prioridades();
        instance.setMaximo_prioridad(maximo_prioridad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo_reserva method, of class Prioridades.
     */
    @Test
    public void testGetMaximo_reserva() {
        System.out.println("getMaximo_reserva");
        Prioridades instance = new Prioridades();
        int expResult = 0;
        int result = instance.getMaximo_reserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximo_reserva method, of class Prioridades.
     */
    @Test
    public void testSetMaximo_reserva() {
        System.out.println("setMaximo_reserva");
        int maximo_reserva = 0;
        Prioridades instance = new Prioridades();
        instance.setMaximo_reserva(maximo_reserva);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}