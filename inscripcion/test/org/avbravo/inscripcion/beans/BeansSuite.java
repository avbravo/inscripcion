/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author avbravo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.avbravo.inscripcion.beans.usuarios.UsuariosSuite.class,org.avbravo.inscripcion.beans.InscripcionBeansTest.class,org.avbravo.inscripcion.beans.estudiantes.EstudiantesSuite.class,org.avbravo.inscripcion.beans.ReservacionTest.class,org.avbravo.inscripcion.beans.ReservacionBeansTest.class,org.avbravo.inscripcion.beans.MySessionBeanTest.class,org.avbravo.inscripcion.beans.facultad.FacultadSuite.class,org.avbravo.inscripcion.beans.AsignadorTalleresAutomaticosTest.class,org.avbravo.inscripcion.beans.talleres.TalleresSuite.class,org.avbravo.inscripcion.beans.InscripcionTest.class,org.avbravo.inscripcion.beans.prioridades.PrioridadesSuite.class})
public class BeansSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

}