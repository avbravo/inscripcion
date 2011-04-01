/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.talleres;

import java.util.List;
import javax.faces.model.SelectItem;
import org.avbravo.inscripcion.beans.estudiantes.Estudiantes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class TalleresBeansTest {

    public TalleresBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of prepararVista method, of class TalleresBeans.
     */
    @Test
    public void testPrepararVista() {
        System.out.println("prepararVista");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.prepararVista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTalleresEstudianteslist method, of class TalleresBeans.
     */
    @Test
    public void testGetTalleresEstudianteslist() {
        System.out.println("getTalleresEstudianteslist");
        TalleresBeans instance = new TalleresBeans();
        List expResult = null;
        List result = instance.getTalleresEstudianteslist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTalleresEstudianteslist method, of class TalleresBeans.
     */
    @Test
    public void testSetTalleresEstudianteslist() {
        System.out.println("setTalleresEstudianteslist");
        List<Estudiantes> talleresEstudianteslist = null;
        TalleresBeans instance = new TalleresBeans();
        instance.setTalleresEstudianteslist(talleresEstudianteslist);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getOpcionActual method, of class TalleresBeans.
     */
    @Test
    public void testGetOpcionActual() {
        System.out.println("getOpcionActual");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.getOpcionActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setOpcionActual method, of class TalleresBeans.
     */
    @Test
    public void testSetOpcionActual() {
        System.out.println("setOpcionActual");
        String opcionActual = "";
        TalleresBeans instance = new TalleresBeans();
        instance.setOpcionActual(opcionActual);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTalleresCombo method, of class TalleresBeans.
     */
    @Test
    public void testGetTalleresCombo() {
        System.out.println("getTalleresCombo");
        TalleresBeans instance = new TalleresBeans();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getTalleresCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTalleresCombo method, of class TalleresBeans.
     */
    @Test
    public void testSetTalleresCombo() {
        System.out.println("setTalleresCombo");
        SelectItem[] talleresCombo = null;
        TalleresBeans instance = new TalleresBeans();
        instance.setTalleresCombo(talleresCombo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedTalleres method, of class TalleresBeans.
     */
    @Test
    public void testGetSelectedTalleres() {
        System.out.println("getSelectedTalleres");
        TalleresBeans instance = new TalleresBeans();
        Talleres expResult = null;
        Talleres result = instance.getSelectedTalleres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedTalleres method, of class TalleresBeans.
     */
    @Test
    public void testSetSelectedTalleres() {
        System.out.println("setSelectedTalleres");
        Talleres selectedTalleres = null;
        TalleresBeans instance = new TalleresBeans();
        instance.setSelectedTalleres(selectedTalleres);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTallereslist method, of class TalleresBeans.
     */
    @Test
    public void testGetTallereslist() {
        System.out.println("getTallereslist");
        TalleresBeans instance = new TalleresBeans();
        List expResult = null;
        List result = instance.getTallereslist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTallereslist method, of class TalleresBeans.
     */
    @Test
    public void testSetTallereslist() {
        System.out.println("setTallereslist");
        List<Talleres> tallereslist = null;
        TalleresBeans instance = new TalleresBeans();
        instance.setTallereslist(tallereslist);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarLista method, of class TalleresBeans.
     */
    @Test
    public void testCargarLista() {
        System.out.println("CargarLista");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.CargarLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarListaEstudiantesTalleres method, of class TalleresBeans.
     */
    @Test
    public void testCargarListaEstudiantesTalleres() {
        System.out.println("CargarListaEstudiantesTalleres");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.CargarListaEstudiantesTalleres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarListaEstudiantesReservacion method, of class TalleresBeans.
     */
    @Test
    public void testCargarListaEstudiantesReservacion() {
        System.out.println("CargarListaEstudiantesReservacion");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.CargarListaEstudiantesReservacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarCombo method, of class TalleresBeans.
     */
    @Test
    public void testCargarCombo() {
        System.out.println("CargarCombo");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.CargarCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Consultar method, of class TalleresBeans.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.Consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class TalleresBeans.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        TalleresBeans instance = new TalleresBeans();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class TalleresBeans.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Editar method, of class TalleresBeans.
     */
    @Test
    public void testEditar() {
        System.out.println("Editar");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.Editar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarCuposTomados method, of class TalleresBeans.
     */
    @Test
    public void testActualizarCuposTomados() {
        System.out.println("ActualizarCuposTomados");
        String lidtaller = "";
        int lidfacultad = 0;
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.ActualizarCuposTomados(lidtaller, lidfacultad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ImprimirEstudiantesTalleres method, of class TalleresBeans.
     */
    @Test
    public void testImprimirEstudiantesTalleres() {
        System.out.println("ImprimirEstudiantesTalleres");
        TalleresBeans instance = new TalleresBeans();
        String expResult = "";
        String result = instance.ImprimirEstudiantesTalleres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class TalleresBeans.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        TalleresBeans instance = new TalleresBeans();
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}