/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.estudiantes;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class EstudiantesBeansTest {

    public EstudiantesBeansTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of prepararVista method, of class EstudiantesBeans.
     */
    @Test
    public void testPrepararVista() {
        System.out.println("prepararVista");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.prepararVista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of prepararEditar method, of class EstudiantesBeans.
     */
    @Test
    public void testPrepararEditar() {
        System.out.println("prepararEditar");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.prepararEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isTieneRegistrosInscripcion method, of class EstudiantesBeans.
     */
    @Test
    public void testIsTieneRegistrosInscripcion() {
        System.out.println("isTieneRegistrosInscripcion");
        EstudiantesBeans instance = new EstudiantesBeans();
        boolean expResult = false;
        boolean result = instance.isTieneRegistrosInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTieneRegistrosInscripcion method, of class EstudiantesBeans.
     */
    @Test
    public void testSetTieneRegistrosInscripcion() {
        System.out.println("setTieneRegistrosInscripcion");
        boolean tieneRegistrosInscripcion = false;
        EstudiantesBeans instance = new EstudiantesBeans();
        instance.setTieneRegistrosInscripcion(tieneRegistrosInscripcion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isLogeado method, of class EstudiantesBeans.
     */
    @Test
    public void testIsLogeado() {
        System.out.println("isLogeado");
        EstudiantesBeans instance = new EstudiantesBeans();
        boolean expResult = false;
        boolean result = instance.isLogeado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setLogeado method, of class EstudiantesBeans.
     */
    @Test
    public void testSetLogeado() {
        System.out.println("setLogeado");
        boolean logeado = false;
        EstudiantesBeans instance = new EstudiantesBeans();
        instance.setLogeado(logeado);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getIniciarSistema method, of class EstudiantesBeans.
     */
    @Test
    public void testGetIniciarSistema() {
        System.out.println("getIniciarSistema");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.getIniciarSistema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setIniciarSistema method, of class EstudiantesBeans.
     */
    @Test
    public void testSetIniciarSistema() {
        System.out.println("setIniciarSistema");
        String iniciarSistema = "";
        EstudiantesBeans instance = new EstudiantesBeans();
        instance.setIniciarSistema(iniciarSistema);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getEstudianteslist method, of class EstudiantesBeans.
     */
    @Test
    public void testGetEstudianteslist() {
        System.out.println("getEstudianteslist");
        EstudiantesBeans instance = new EstudiantesBeans();
        List expResult = null;
        List result = instance.getEstudianteslist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEstudianteslist method, of class EstudiantesBeans.
     */
    @Test
    public void testSetEstudianteslist() {
        System.out.println("setEstudianteslist");
        List<Estudiantes> estudianteslist = null;
        EstudiantesBeans instance = new EstudiantesBeans();
        instance.setEstudianteslist(estudianteslist);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedEstudiantes method, of class EstudiantesBeans.
     */
    @Test
    public void testGetSelectedEstudiantes() {
        System.out.println("getSelectedEstudiantes");
        EstudiantesBeans instance = new EstudiantesBeans();
        Estudiantes expResult = null;
        Estudiantes result = instance.getSelectedEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedEstudiantes method, of class EstudiantesBeans.
     */
    @Test
    public void testSetSelectedEstudiantes() {
        System.out.println("setSelectedEstudiantes");
        Estudiantes selectedEstudiantes = null;
        EstudiantesBeans instance = new EstudiantesBeans();
        instance.setSelectedEstudiantes(selectedEstudiantes);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarLogin method, of class EstudiantesBeans.
     */
    @Test
    public void testVerificarLogin() {
        System.out.println("VerificarLogin");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.VerificarLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Consultar method, of class EstudiantesBeans.
     */
    @Test
    public void testConsultar() {
        System.out.println("Consultar");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.Consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarRecibo method, of class EstudiantesBeans.
     */
    @Test
    public void testActualizarRecibo() {
        System.out.println("ActualizarRecibo");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.ActualizarRecibo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class EstudiantesBeans.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.Eliminar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class EstudiantesBeans.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.Agregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class EstudiantesBeans.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.Actualizar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class EstudiantesBeans.
     */
    @Test
    public void testLimpiar() {
        System.out.println("Limpiar");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.Limpiar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CargarLista method, of class EstudiantesBeans.
     */
    @Test
    public void testCargarLista() {
        System.out.println("CargarLista");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.CargarLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarInscripcion method, of class EstudiantesBeans.
     */
    @Test
    public void testConsultarInscripcion() {
        System.out.println("ConsultarInscripcion");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.ConsultarInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarSiTieneReservacion method, of class EstudiantesBeans.
     */
    @Test
    public void testConsultarSiTieneReservacion() {
        System.out.println("ConsultarSiTieneReservacion");
        EstudiantesBeans instance = new EstudiantesBeans();
        boolean expResult = false;
        boolean result = instance.ConsultarSiTieneReservacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class EstudiantesBeans.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        EstudiantesBeans instance = new EstudiantesBeans();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}