/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author avbravo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.avbravo.AvbravoSuite.class})
public class OrgSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

}