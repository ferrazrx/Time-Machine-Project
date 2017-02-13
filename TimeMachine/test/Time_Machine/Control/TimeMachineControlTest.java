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
 * @author sinitsyndmitriy
 */
public class TimeMachineControlTest {
    
    public TimeMachineControlTest() {
    }

    /**
     * Test of calcAreaOfTriangle method, of class TimeMachineControl.
     */
    @Test
    public void testCalcAreaOfTriangle() {
        System.out.println("calcAreaOfTriangle");
        
//        test1
        
        int height = 10;
        int base = 10;
        TimeMachineControl instance = new TimeMachineControl();
        int expResult = 50;
        int result = instance.calcAreaOfTriangle(height, base);
        assertEquals(expResult, result, 0.0);
        
        
        //        test2
        
        height = 10;
        base = -10;   
        expResult = -1;
        result = instance.calcAreaOfTriangle(height, base);
        assertEquals(expResult, result, 0.0);
        
                //        test3
        
        height = -10;
        base = 10;   
        expResult = -1;
        result = instance.calcAreaOfTriangle(height, base);
        assertEquals(expResult, result, 0.0);
        
                //        test4
        
        height = 10;
        base = 0;   
        expResult = -1;
        result = instance.calcAreaOfTriangle(height, base);
        assertEquals(expResult, result, 0.0);
        
                //        test5
        
        height = 0;
        base = 10;   
        expResult = -1;
        result = instance.calcAreaOfTriangle(height, base);
        assertEquals(expResult, result, 0.0);
        
        }
    
}
