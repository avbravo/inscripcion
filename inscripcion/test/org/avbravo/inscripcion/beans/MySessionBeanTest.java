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
public class MySessionBeanTest {

    public MySessionBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getRuta method, of class MySessionBean.
     */
    @Test
    public void testGetRuta() {
        System.out.println("getRuta");
        MySessionBean instance = new MySessionBean();
        String expResult = "";
        String result = instance.getRuta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setRuta method, of class MySessionBean.
     */
    @Test
    public void testSetRuta() {
        System.out.println("setRuta");
        String ruta = "";
        MySessionBean instance = new MySessionBean();
        instance.setRuta(ruta);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIdfacultad method, of class MySessionBean.
     */
    @Test
    public void testGetIdfacultad() {
        System.out.println("getIdfacultad");
        MySessionBean instance = new MySessionBean();
        int expResult = 0;
        int result = instance.getIdfacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdfacultad method, of class MySessionBean.
     */
    @Test
    public void testSetIdfacultad() {
        System.out.println("setIdfacultad");
        int idfacultad = 0;
        MySessionBean instance = new MySessionBean();
        instance.setIdfacultad(idfacultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class MySessionBean.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        MySessionBean instance = new MySessionBean();
        String expResult = "";
        String result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setVersion method, of class MySessionBean.
     */
    @Test
    public void testSetVersion() {
        System.out.println("setVersion");
        String version = "";
        MySessionBean instance = new MySessionBean();
        instance.setVersion(version);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSesion method, of class MySessionBean.
     */
    @Test
    public void testGetFechaSesion() {
        System.out.println("getFechaSesion");
        MySessionBean instance = new MySessionBean();
        Date expResult = null;
        Date result = instance.getFechaSesion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaSesion method, of class MySessionBean.
     */
    @Test
    public void testSetFechaSesion() {
        System.out.println("setFechaSesion");
        Date fechaSesion = null;
        MySessionBean instance = new MySessionBean();
        instance.setFechaSesion(fechaSesion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of englishAction method, of class MySessionBean.
     */
    @Test
    public void testEnglishAction() {
        System.out.println("englishAction");
        MySessionBean instance = new MySessionBean();
        String expResult = "";
        String result = instance.englishAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of spanishAction method, of class MySessionBean.
     */
    @Test
    public void testSpanishAction() {
        System.out.println("spanishAction");
        MySessionBean instance = new MySessionBean();
        String expResult = "";
        String result = instance.spanishAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Conectar method, of class MySessionBean.
     */
    @Test
    public void testConectar() {
        System.out.println("Conectar");
        MySessionBean instance = new MySessionBean();
        boolean expResult = false;
        boolean result = instance.Conectar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDir method, of class MySessionBean.
     */
    @Test
    public void testGetDir() {
        System.out.println("getDir");
        MySessionBean instance = new MySessionBean();
        String expResult = "";
        String result = instance.getDir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class MySessionBean.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        MySessionBean instance = new MySessionBean();
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}