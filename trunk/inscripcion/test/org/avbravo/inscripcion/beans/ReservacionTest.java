/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans;

import java.sql.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class ReservacionTest {

    public ReservacionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getCedula method, of class Reservacion.
     */
    @Test
    public void testGetCedula() {
        System.out.println("getCedula");
        Reservacion instance = new Reservacion();
        String expResult = "";
        String result = instance.getCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCedula method, of class Reservacion.
     */
    @Test
    public void testSetCedula() {
        System.out.println("setCedula");
        String cedula = "";
        Reservacion instance = new Reservacion();
        instance.setCedula(cedula);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Reservacion.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Reservacion instance = new Reservacion();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Reservacion.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Reservacion instance = new Reservacion();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Reservacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Reservacion instance = new Reservacion();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Reservacion.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Reservacion instance = new Reservacion();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIdfacultad method, of class Reservacion.
     */
    @Test
    public void testGetIdfacultad() {
        System.out.println("getIdfacultad");
        Reservacion instance = new Reservacion();
        int expResult = 0;
        int result = instance.getIdfacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdfacultad method, of class Reservacion.
     */
    @Test
    public void testSetIdfacultad() {
        System.out.println("setIdfacultad");
        int idfacultad = 0;
        Reservacion instance = new Reservacion();
        instance.setIdfacultad(idfacultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIdtaller method, of class Reservacion.
     */
    @Test
    public void testGetIdtaller() {
        System.out.println("getIdtaller");
        Reservacion instance = new Reservacion();
        String expResult = "";
        String result = instance.getIdtaller();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdtaller method, of class Reservacion.
     */
    @Test
    public void testSetIdtaller() {
        System.out.println("setIdtaller");
        String idtaller = "";
        Reservacion instance = new Reservacion();
        instance.setIdtaller(idtaller);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridad method, of class Reservacion.
     */
    @Test
    public void testGetPrioridad() {
        System.out.println("getPrioridad");
        Reservacion instance = new Reservacion();
        int expResult = 0;
        int result = instance.getPrioridad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridad method, of class Reservacion.
     */
    @Test
    public void testSetPrioridad() {
        System.out.println("setPrioridad");
        int prioridad = 0;
        Reservacion instance = new Reservacion();
        instance.setPrioridad(prioridad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}