/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 7
 */
public class GetInputTest {
    
    public GetInputTest() {
    }

    /**
     * Test of getString method, of class GetInput.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        String expResult = "";
        String result = GetInput.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInt method, of class GetInput.
     */
    @Test
    public void testGetInt() {
        System.out.println("getInt");
        int expResult = 0;
        int result = GetInput.getInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDouble method, of class GetInput.
     */
    @Test
    public void testGetDouble() {
        System.out.println("getDouble");
        double expResult = 0.0;
        double result = GetInput.getDouble();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
