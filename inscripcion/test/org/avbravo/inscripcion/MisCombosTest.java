/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion;

import javax.faces.model.SelectItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class MisCombosTest {

    public MisCombosTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getActivoCombo method, of class MisCombos.
     */
    @Test
    public void testGetActivoCombo() {
        System.out.println("getActivoCombo");
        MisCombos instance = new MisCombos();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getActivoCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setActivoCombo method, of class MisCombos.
     */
    @Test
    public void testSetActivoCombo() {
        System.out.println("setActivoCombo");
        SelectItem[] activoCombo = null;
        MisCombos instance = new MisCombos();
        instance.setActivoCombo(activoCombo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcionActual method, of class MisCombos.
     */
    @Test
    public void testGetOpcionActual() {
        System.out.println("getOpcionActual");
        MisCombos instance = new MisCombos();
        String expResult = "";
        String result = instance.getOpcionActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcionActual method, of class MisCombos.
     */
    @Test
    public void testSetOpcionActual() {
        System.out.println("setOpcionActual");
        String opcionActual = "";
        MisCombos instance = new MisCombos();
        instance.setOpcionActual(opcionActual);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}