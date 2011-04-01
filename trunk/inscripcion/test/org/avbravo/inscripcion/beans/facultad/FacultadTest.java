/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.facultad;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class FacultadTest {

    public FacultadTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getFacultad method, of class Facultad.
     */
    @Test
    public void testGetFacultad() {
        System.out.println("getFacultad");
        Facultad instance = new Facultad();
        String expResult = "";
        String result = instance.getFacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFacultad method, of class Facultad.
     */
    @Test
    public void testSetFacultad() {
        System.out.println("setFacultad");
        String facultad = "";
        Facultad instance = new Facultad();
        instance.setFacultad(facultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIdfacultad method, of class Facultad.
     */
    @Test
    public void testGetIdfacultad() {
        System.out.println("getIdfacultad");
        Facultad instance = new Facultad();
        int expResult = 0;
        int result = instance.getIdfacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdfacultad method, of class Facultad.
     */
    @Test
    public void testSetIdfacultad() {
        System.out.println("setIdfacultad");
        int idfacultad = 0;
        Facultad instance = new Facultad();
        instance.setIdfacultad(idfacultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getLogo method, of class Facultad.
     */
    @Test
    public void testGetLogo() {
        System.out.println("getLogo");
        Facultad instance = new Facultad();
        String expResult = "";
        String result = instance.getLogo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setLogo method, of class Facultad.
     */
    @Test
    public void testSetLogo() {
        System.out.println("setLogo");
        String logo = "";
        Facultad instance = new Facultad();
        instance.setLogo(logo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUrl method, of class Facultad.
     */
    @Test
    public void testGetUrl() {
        System.out.println("getUrl");
        Facultad instance = new Facultad();
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setUrl method, of class Facultad.
     */
    @Test
    public void testSetUrl() {
        System.out.println("setUrl");
        String url = "";
        Facultad instance = new Facultad();
        instance.setUrl(url);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}