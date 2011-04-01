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
public class ReservacionBeansTest {

    public ReservacionBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of ActualizarPrioridades method, of class ReservacionBeans.
     */
    @Test
    public void testActualizarPrioridades() {
        System.out.println("ActualizarPrioridades");
        String lidtaller = "";
        String lcedula = "";
        ReservacionBeans instance = new ReservacionBeans();
        String expResult = "";
        String result = instance.ActualizarPrioridades(lidtaller, lcedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}