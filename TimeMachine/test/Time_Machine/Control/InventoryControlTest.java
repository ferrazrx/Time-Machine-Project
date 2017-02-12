/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Inventory;
import Time_Machine.Model.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rxfer_000
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of addInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testAddInventoryItem() {
        System.out.println("addInventoryItem");
        Inventory playerInventory = new Inventory();
        Item testItem = new Item();
        InventoryControl.addInventoryItem(playerInventory, testItem);
        assertEquals(1, playerInventory.getAmountItems(), 0.0);
    }

    /**
     * Test of dropInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testDropInventoryItem() {
        System.out.println("dropInventoryItem");
        Inventory playerInventory = new Inventory();
        Item testItem1 = new Item();
        Item testItem2 = new Item();
        testItem2.setName("testItem2");
        InventoryControl.addInventoryItem(playerInventory, testItem1);
        InventoryControl.addInventoryItem(playerInventory, testItem2);
        InventoryControl.dropInventoryItem(playerInventory, "testItem2");
        assertEquals(1, playerInventory.getAmountItems(), 0.0);
    }
    
}
