/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class MenuTest {

    public MenuTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of RegresarMenuAdministrador method, of class Menu.
     */
    @Test
    public void testRegresarMenuAdministrador() {
        System.out.println("RegresarMenuAdministrador");
        Menu instance = new Menu();
        String expResult = "/administrador/administradormenu";
        String result = instance.RegresarMenuAdministrador();
        System.out.println("Aris " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of RegistrarPago method, of class Menu.
     */
    @Test
    public void testRegistrarPago() {
        System.out.println("RegistrarPago");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.RegistrarPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of AdministradorLogin method, of class Menu.
     */
    @Test
    public void testAdministradorLogin() {
        System.out.println("AdministradorLogin");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.AdministradorLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of EditarInscripcion method, of class Menu.
     */
    @Test
    public void testEditarInscripcion() {
        System.out.println("EditarInscripcion");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.EditarInscripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Reportes method, of class Menu.
     */
    @Test
    public void testReportes() {
        System.out.println("Reportes");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.Reportes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ListadoUsuarios method, of class Menu.
     */
    @Test
    public void testListadoUsuarios() {
        System.out.println("ListadoUsuarios");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.ListadoUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of UsuariosAgregar method, of class Menu.
     */
    @Test
    public void testUsuariosAgregar() {
        System.out.println("UsuariosAgregar");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.UsuariosAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of EstudiantesLogin method, of class Menu.
     */
    @Test
    public void testEstudiantesLogin() {
        System.out.println("EstudiantesLogin");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.EstudiantesLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ListadoEstudiantes method, of class Menu.
     */
    @Test
    public void testListadoEstudiantes() {
        System.out.println("ListadoEstudiantes");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.ListadoEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarEstudiantes method, of class Menu.
     */
    @Test
    public void testAgregarEstudiantes() {
        System.out.println("AgregarEstudiantes");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.AgregarEstudiantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ListadoTalleres method, of class Menu.
     */
    @Test
    public void testListadoTalleres() {
        System.out.println("ListadoTalleres");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.ListadoTalleres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ListadoEstudiantesTalleres method, of class Menu.
     */
    @Test
    public void testListadoEstudiantesTalleres() {
        System.out.println("ListadoEstudiantesTalleres");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.ListadoEstudiantesTalleres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ListadoEstudiantesSoloReservacion method, of class Menu.
     */
    @Test
    public void testListadoEstudiantesSoloReservacion() {
        System.out.println("ListadoEstudiantesSoloReservacion");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.ListadoEstudiantesSoloReservacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of TalleresAgregar method, of class Menu.
     */
    @Test
    public void testTalleresAgregar() {
        System.out.println("TalleresAgregar");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.TalleresAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of TallerAsignarAutomaticamente method, of class Menu.
     */
    @Test
    public void testTallerAsignarAutomaticamente() {
        System.out.println("TallerAsignarAutomaticamente");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.TallerAsignarAutomaticamente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ListadoPrioridades method, of class Menu.
     */
    @Test
    public void testListadoPrioridades() {
        System.out.println("ListadoPrioridades");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.ListadoPrioridades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of PrioridadesAgregar method, of class Menu.
     */
    @Test
    public void testPrioridadesAgregar() {
        System.out.println("PrioridadesAgregar");
        Menu instance = new Menu();
        String expResult = "";
        String result = instance.PrioridadesAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}