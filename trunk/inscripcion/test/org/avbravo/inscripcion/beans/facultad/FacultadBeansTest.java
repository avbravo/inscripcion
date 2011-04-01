/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.facultad;

import javax.faces.model.SelectItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class FacultadBeansTest {

    public FacultadBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getFacultadesCombo method, of class FacultadBeans.
     */
    @Test
    public void testGetFacultadesCombo() {
        System.out.println("getFacultadesCombo");
        FacultadBeans instance = new FacultadBeans();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getFacultadesCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFacultadesCombo method, of class FacultadBeans.
     */
    @Test
    public void testSetFacultadesCombo() {
        System.out.println("setFacultadesCombo");
        SelectItem[] facultadesCombo = null;
        FacultadBeans instance = new FacultadBeans();
        instance.setFacultadesCombo(facultadesCombo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarCombo method, of class FacultadBeans.
     */
    @Test
    public void testCargarCombo() {
        System.out.println("CargarCombo");
        FacultadBeans instance = new FacultadBeans();
        String expResult = "";
        String result = instance.CargarCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}