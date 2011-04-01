/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.avbravo.inscripcion;

import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author avbravo
 */
public class JsfUtilTest {

    public JsfUtilTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of getSelectItems method, of class JsfUtil.
     */
    @Test
    public void testGetSelectItems() {
        System.out.println("getSelectItems");
        List<?> entities = null;
        boolean selectOne = false;
        SelectItem[] expResult = null;
        SelectItem[] result = JsfUtil.getSelectItems(entities, selectOne);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addErrorMessage method, of class JsfUtil.
     */
    @Test
    public void testAddErrorMessage_Exception_String() {
        System.out.println("addErrorMessage");
        Exception ex = null;
        String defaultMsg = "";
        JsfUtil.addErrorMessage(ex, defaultMsg);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addErrorMessages method, of class JsfUtil.
     */
    @Test
    public void testAddErrorMessages() {
        System.out.println("addErrorMessages");
        List<String> messages = null;
        JsfUtil.addErrorMessages(messages);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addErrorMessage method, of class JsfUtil.
     */
    @Test
    public void testAddErrorMessage_String_String() {
        System.out.println("addErrorMessage");
        String msg = "";
        String titulo = "";
        JsfUtil.addErrorMessage(msg, titulo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addErrorMessage method, of class JsfUtil.
     */
    @Test
    public void testAddErrorMessage_String() {
        System.out.println("addErrorMessage");
        String msg = "";
        JsfUtil.addErrorMessage(msg);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addSuccessMessage method, of class JsfUtil.
     */
    @Test
    public void testAddSuccessMessage() {
        System.out.println("addSuccessMessage");
        String msg = "";
        JsfUtil.addSuccessMessage(msg);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestParameter method, of class JsfUtil.
     */
    @Test
    public void testGetRequestParameter() {
        System.out.println("getRequestParameter");
        String key = "";
        String expResult = "";
        String result = JsfUtil.getRequestParameter(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectFromRequestParameter method, of class JsfUtil.
     */
    @Test
    public void testGetObjectFromRequestParameter() {
        System.out.println("getObjectFromRequestParameter");
        String requestParameterName = "";
        Converter converter = null;
        UIComponent component = null;
        Object expResult = null;
        Object result = JsfUtil.getObjectFromRequestParameter(requestParameterName, converter, component);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

}