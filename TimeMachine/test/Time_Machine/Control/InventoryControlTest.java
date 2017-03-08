/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

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
    // TEST 1
        System.out.println("addInventoryItem");
        Player player = new Player();
        Item testItem = new Item(1);
        testItem.setName("Shoe");
        InventoryControl.addInventoryItem(player, testItem);
        assertEquals(1, player.getInventory().getAmountItems(), 0.0);
    // TEST 2
        System.out.println("addInventoryItem");
        Item testItem1 = new Item(1);
        Item testItem2 = new Item(1);
        testItem1.setName("box");
        testItem2.setName("box");
        InventoryControl.addInventoryItem(player, testItem1);
        InventoryControl.addInventoryItem(player, testItem2);
        assertEquals(2, player.getInventory().getAmountItems(), 0.0);
    }
    
  
   
    /**
     * Test of dropInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testDropInventoryItem() {
        System.out.println("dropInventoryItem");
        Player player = new Player();
        Item testItem1 = new Item(1);
        Item testItem2 = new Item(1);
        String name = "test";
        String name2 = "test2";
        testItem1.setName(name);
        testItem2.setName(name2);
        InventoryControl.addInventoryItem(player, testItem1);
        InventoryControl.addInventoryItem(player, testItem2);
        InventoryControl.dropInventoryItem(player,"2");
        System.out.println(player.getInventory().getAmountItems());
        assertEquals(1, player.getInventory().getAmountItems(), 0.0);
    }
    
}
