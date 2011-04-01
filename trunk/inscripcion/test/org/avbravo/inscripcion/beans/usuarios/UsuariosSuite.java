/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion.beans.usuarios;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author avbravo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.avbravo.inscripcion.beans.usuarios.UsuariosRegistrosBeansTest.class,org.avbravo.inscripcion.beans.usuarios.UsuariosBeansTest.class,org.avbravo.inscripcion.beans.usuarios.UsuariosRegistrosTest.class,org.avbravo.inscripcion.beans.usuarios.UsuariosTest.class})
public class UsuariosSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

}