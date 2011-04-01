/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.prioridades;

import java.util.List;
import javax.faces.model.SelectItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class PrioridadesBeansTest {

    public PrioridadesBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of prepararVista method, of class PrioridadesBeans.
     */
    @Test
    public void testPrepararVista() {
        System.out.println("prepararVista");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.prepararVista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIdfacultad method, of class PrioridadesBeans.
     */
    @Test
    public void testGetIdfacultad() {
        System.out.println("getIdfacultad");
        PrioridadesBeans instance = new PrioridadesBeans();
        int expResult = 0;
        int result = instance.getIdfacultad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdfacultad method, of class PrioridadesBeans.
     */
    @Test
    public void testSetIdfacultad() {
        System.out.println("setIdfacultad");
        int idfacultad = 0;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setIdfacultad(idfacultad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo_prioridad method, of class PrioridadesBeans.
     */
    @Test
    public void testGetMaximo_prioridad() {
        System.out.println("getMaximo_prioridad");
        PrioridadesBeans instance = new PrioridadesBeans();
        int expResult = 0;
        int result = instance.getMaximo_prioridad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximo_prioridad method, of class PrioridadesBeans.
     */
    @Test
    public void testSetMaximo_prioridad() {
        System.out.println("setMaximo_prioridad");
        int maximo_prioridad = 0;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setMaximo_prioridad(maximo_prioridad);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximo_reserva method, of class PrioridadesBeans.
     */
    @Test
    public void testGetMaximo_reserva() {
        System.out.println("getMaximo_reserva");
        PrioridadesBeans instance = new PrioridadesBeans();
        int expResult = 0;
        int result = instance.getMaximo_reserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximo_reserva method, of class PrioridadesBeans.
     */
    @Test
    public void testSetMaximo_reserva() {
        System.out.println("setMaximo_reserva");
        int maximo_reserva = 0;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setMaximo_reserva(maximo_reserva);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridadesCombo method, of class PrioridadesBeans.
     */
    @Test
    public void testGetPrioridadesCombo() {
        System.out.println("getPrioridadesCombo");
        PrioridadesBeans instance = new PrioridadesBeans();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getPrioridadesCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeReservacion1 method, of class PrioridadesBeans.
     */
    @Test
    public void testGetMensajeReservacion1() {
        System.out.println("getMensajeReservacion1");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.getMensajeReservacion1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMensajeReservacion1 method, of class PrioridadesBeans.
     */
    @Test
    public void testSetMensajeReservacion1() {
        System.out.println("setMensajeReservacion1");
        String mensajeReservacion1 = "";
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setMensajeReservacion1(mensajeReservacion1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeReservacion2 method, of class PrioridadesBeans.
     */
    @Test
    public void testGetMensajeReservacion2() {
        System.out.println("getMensajeReservacion2");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.getMensajeReservacion2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMensajeReservacion2 method, of class PrioridadesBeans.
     */
    @Test
    public void testSetMensajeReservacion2() {
        System.out.println("setMensajeReservacion2");
        String mensajeReservacion2 = "";
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setMensajeReservacion2(mensajeReservacion2);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridadesCombo method, of class PrioridadesBeans.
     */
    @Test
    public void testSetPrioridadesCombo() {
        System.out.println("setPrioridadesCombo");
        SelectItem[] prioridadesCombo = null;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setPrioridadesCombo(prioridadesCombo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridades method, of class PrioridadesBeans.
     */
    @Test
    public void testGetPrioridades() {
        System.out.println("getPrioridades");
        PrioridadesBeans instance = new PrioridadesBeans();
        Prioridades expResult = null;
        Prioridades result = instance.getPrioridades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridades method, of class PrioridadesBeans.
     */
    @Test
    public void testSetPrioridades() {
        System.out.println("setPrioridades");
        Prioridades prioridades = null;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setPrioridades(prioridades);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridadeslist method, of class PrioridadesBeans.
     */
    @Test
    public void testGetPrioridadeslist() {
        System.out.println("getPrioridadeslist");
        PrioridadesBeans instance = new PrioridadesBeans();
        List expResult = null;
        List result = instance.getPrioridadeslist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridadeslist method, of class PrioridadesBeans.
     */
    @Test
    public void testSetPrioridadeslist() {
        System.out.println("setPrioridadeslist");
        List<Prioridades> prioridadeslist = null;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setPrioridadeslist(prioridadeslist);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedPrioridades method, of class PrioridadesBeans.
     */
    @Test
    public void testGetSelectedPrioridades() {
        System.out.println("getSelectedPrioridades");
        PrioridadesBeans instance = new PrioridadesBeans();
        Prioridades expResult = null;
        Prioridades result = instance.getSelectedPrioridades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedPrioridades method, of class PrioridadesBeans.
     */
    @Test
    public void testSetSelectedPrioridades() {
        System.out.println("setSelectedPrioridades");
        Prioridades selectedPrioridades = null;
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.setSelectedPrioridades(selectedPrioridades);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarPrioridades method, of class PrioridadesBeans.
     */
    @Test
    public void testConsultarPrioridades() {
        System.out.println("ConsultarPrioridades");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.ConsultarPrioridades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarCombo method, of class PrioridadesBeans.
     */
    @Test
    public void testCargarCombo() {
        System.out.println("CargarCombo");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.CargarCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarLista method, of class PrioridadesBeans.
     */
    @Test
    public void testCargarLista() {
        System.out.println("CargarLista");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.CargarLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Consultar method, of class PrioridadesBeans.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.Consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class PrioridadesBeans.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        PrioridadesBeans instance = new PrioridadesBeans();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class PrioridadesBeans.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class PrioridadesBeans.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        PrioridadesBeans instance = new PrioridadesBeans();
        String expResult = "";
        String result = instance.Editar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}