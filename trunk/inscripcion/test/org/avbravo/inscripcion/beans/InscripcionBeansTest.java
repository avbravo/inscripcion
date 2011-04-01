/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class InscripcionBeansTest {

    public InscripcionBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getSelectedInscripcion method, of class InscripcionBeans.
     */
    @Test
    public void testGetSelectedInscripcion() {
        System.out.println("getSelectedInscripcion");
        InscripcionBeans instance = new InscripcionBeans();
        Inscripcion expResult = null;
        Inscripcion result = instance.getSelectedInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedInscripcion method, of class InscripcionBeans.
     */
    @Test
    public void testSetSelectedInscripcion() {
        System.out.println("setSelectedInscripcion");
        Inscripcion selectedInscripcion = null;
        InscripcionBeans instance = new InscripcionBeans();
        instance.setSelectedInscripcion(selectedInscripcion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getInscripcion method, of class InscripcionBeans.
     */
    @Test
    public void testGetInscripcion() {
        System.out.println("getInscripcion");
        InscripcionBeans instance = new InscripcionBeans();
        Inscripcion expResult = null;
        Inscripcion result = instance.getInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setInscripcion method, of class InscripcionBeans.
     */
    @Test
    public void testSetInscripcion() {
        System.out.println("setInscripcion");
        Inscripcion inscripcion = null;
        InscripcionBeans instance = new InscripcionBeans();
        instance.setInscripcion(inscripcion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getInscripcionlist method, of class InscripcionBeans.
     */
    @Test
    public void testGetInscripcionlist() {
        System.out.println("getInscripcionlist");
        InscripcionBeans instance = new InscripcionBeans();
        List expResult = null;
        List result = instance.getInscripcionlist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setInscripcionlist method, of class InscripcionBeans.
     */
    @Test
    public void testSetInscripcionlist() {
        System.out.println("setInscripcionlist");
        List<Inscripcion> inscripcionlist = null;
        InscripcionBeans instance = new InscripcionBeans();
        instance.setInscripcionlist(inscripcionlist);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarListaInscripcion method, of class InscripcionBeans.
     */
    @Test
    public void testCargarListaInscripcion() {
        System.out.println("CargarListaInscripcion");
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.CargarListaInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarListaInscripcionConsulta method, of class InscripcionBeans.
     */
    @Test
    public void testCargarListaInscripcionConsulta() {
        System.out.println("CargarListaInscripcionConsulta");
        String lcedula = "";
        int lidfacultad = 0;
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.CargarListaInscripcionConsulta(lcedula, lidfacultad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class InscripcionBeans.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarInscrito method, of class InscripcionBeans.
     */
    @Test
    public void testActualizarInscrito() {
        System.out.println("ActualizarInscrito");
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.ActualizarInscrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarInscripcion method, of class InscripcionBeans.
     */
    @Test
    public void testEliminarInscripcion() {
        System.out.println("EliminarInscripcion");
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.EliminarInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class InscripcionBeans.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        InscripcionBeans instance = new InscripcionBeans();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarNoInscrito method, of class InscripcionBeans.
     */
    @Test
    public void testActualizarNoInscrito() {
        System.out.println("ActualizarNoInscrito");
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.ActualizarNoInscrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarRegistroReservacion method, of class InscripcionBeans.
     */
    @Test
    public void testEliminarRegistroReservacion() {
        System.out.println("EliminarRegistroReservacion");
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.EliminarRegistroReservacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarCupos method, of class InscripcionBeans.
     */
    @Test
    public void testActualizarCupos() {
        System.out.println("ActualizarCupos");
        String lidtaller = "";
        InscripcionBeans instance = new InscripcionBeans();
        String expResult = "";
        String result = instance.ActualizarCupos(lidtaller);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}