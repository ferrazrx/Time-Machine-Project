/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.exceptions.ItemControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
  * @author Group 7
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }
    /**
     * Test of CalculatePowerDissipationInResistor method, of class ItemControl.
     */
    @Test
    public void testCalculatePowerDissipationInResistor() throws ItemControlException {
        /**********************************
                 * Test case #1
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        int voltage = 150;
        int resistor = 120;
        double expResult = 187.50;
        double result = 0;
        try {
            ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #2
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        voltage = 200;
        resistor = 100;
        expResult = -1;
        try {
            ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #3
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        voltage = 60;
        resistor = 50;
        expResult = -1;
        try {
            ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #4
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        voltage = 10;
        resistor = 0;
        expResult = -1;
        try {
            ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
             result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #5
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        voltage = -20;
        resistor = 30;
        expResult = -1;
        try {
            ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
             result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #6
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        voltage = 100;
        resistor = -40;
        expResult = -1;
        try {
            ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
             result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #7
        **********************************/
        System.out.println("CalculatePowerDissipationInResistor");
        voltage = 1;
        resistor = 1;
        expResult = -1;
        ItemControl.CalculatePowerDissipationInCapacitor(voltage, resistor);
        result = ItemControl.getPowerDissipation();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateAirCoreWireCoilDistance method, of class ItemControl.
     */
    @Test
    public void testCalculateAirCoreWireCoilDistance() {
        /**********************************
                 * Test case #1
        **********************************/
        System.out.println("calculateAirCoreWireCoilDistance");
        double acceleration = 100.0;
        double time = 10.0;
        double expResult = 5000.0;
        double result = 0;
        try {
             ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
             result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #2
        **********************************/
        System.out.println("calculateAirCoreWireCoilDistance");
        acceleration = 99.0;
        time = 10.0;
        expResult = -1;
        try {
            ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #3
        **********************************/
        System.out.println("calculateAirCoreWireCoilDistance");
        acceleration = 101.0;
        time = 10.0;
        expResult = -1;
        try {
            ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #4
        **********************************/
        System.out.println("calculateAirCoreWireCoilDistance");
        acceleration = -1;
        time = 10.0;
        expResult = -1;
        try {
            ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
        /**********************************
                 * Test case #5
        **********************************/
        System.out.println("calculateAirCoreWireCoilDistance");
        acceleration = 10.0;
        time = -1;
        expResult = -1;
        try {
            ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
             result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
         /**********************************
                 * Test case #6
        **********************************/
        System.out.println("calculateAirCoreWireCoilDistance");
        acceleration = 1.0;
        time = 1.0;
        expResult = -1;
        try {
            ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
            result = ItemControl.getPowerDissipation();
        } catch (ItemControlException ex) {
            Logger.getLogger(ItemControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(expResult, result, 0.0);
        
    }
    
}
