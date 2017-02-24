/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Inventory;
import Time_Machine.Model.Item;
import Time_Machine.Model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 7
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
        Player player = new Player();
        Item testItem = new Item();
        InventoryControl.addInventoryItem(player, testItem);
        assertEquals(1, player.getInventory().getAmountItems(), 0.0);
    }

    /**
     * Test of dropInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testDropInventoryItem() {
        System.out.println("dropInventoryItem");
       Player player = new Player();
        Item testItem1 = new Item();
        Item testItem2 = new Item();
        testItem2.setName("testItem2");
        InventoryControl.addInventoryItem(player, testItem1);
        InventoryControl.addInventoryItem(player, testItem2);
        InventoryControl.dropInventoryItem(player, "testItem2");
        assertEquals(1, player.getInventory().getAmountItems(), 0.0);
    }
    
}
