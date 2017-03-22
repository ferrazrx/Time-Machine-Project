/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Item;
import Time_Machine.Model.Player;
import Time_Machine.exceptions.InventoryControlException;
import Time_Machine.exceptions.SceneControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Game game = null;
        try {
            game = GameControl.createNewGame(player);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Item testItem = new Item(1);
        testItem.setName("Shoe");
        int amount = game.getInventory().getAmountItems();
        InventoryControl.addInventoryItem(game, testItem);
        assertEquals(amount+1, game.getInventory().getAmountItems(), 0.0);
    // TEST 2
        System.out.println("addInventoryItem");
        Item testItem1 = new Item(1);
        Item testItem2 = new Item(1);
        testItem1.setName("box");
        testItem2.setName("box");
        amount = game.getInventory().getAmountItems();
        InventoryControl.addInventoryItem(game, testItem1);
        InventoryControl.addInventoryItem( game, testItem2);
        assertEquals(amount+1, game.getInventory().getAmountItems(), 0.0);
    }
    
  
   
    /**
     * Test of dropInventoryItem method, of class InventoryControl.
     */
    @Test
    public void testDropInventoryItem() {
        System.out.println("dropInventoryItem");
        Player player = new Player();
        Game game = null;
        try {
            game = GameControl.createNewGame(player);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Item testItem1 = new Item(1);
        Item testItem2 = new Item(1);
        String name = "test";
        String name2 = "test2";
        testItem1.setName(name);
        testItem2.setName(name2);
        int amount = game.getInventory().getAmountItems();
        InventoryControl.addInventoryItem(game, testItem1);
        InventoryControl.addInventoryItem(game, testItem2);
        try {
            InventoryControl.dropInventoryItem(game,"2");
        } catch (InventoryControlException ex) {
            Logger.getLogger(InventoryControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(game.getInventory().getAmountItems());
        assertEquals(amount+1, game.getInventory().getAmountItems(), 0.0);
    }
    
}
