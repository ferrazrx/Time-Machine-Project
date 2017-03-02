/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Inventory;
import Time_Machine.Model.Item;
import Time_Machine.Model.Player;
import java.util.List;

/**
 *
 * @author Group 7
 */
public class InventoryControl {
    public static void listInventoryItems(Player player){
        System.out.println("Inventory Items:");
        if(player.getInventory().getAmountItems()<1){
            System.out.println("*** Your inventory is empty ***");
        }else{
            System.out.println("\nYour inventory has:\n");
            for (int i=0;i<player.getInventory().getAmountItems();i++){
                Item item;
                item = player.getInventory().getItemByIndex(i);
                System.out.println(
                    "\t_________________________________________________\n"
                  +  "\tItem's Name: " + item.getName()+".\n"
                  + "\tDescription: " + item.getDescription() +".\n"
                  + "\tAmount: "+ item.getAmount() +".");    
            }
        }    
    }
    
    public static void addInventoryItem(Player player, Item newItem){
        // Add items on inventory
        player.getInventory().setItem(newItem);
        System.out.println("*** Item Added to your inventory! ***");
        listInventoryItems(player);
    }
    public static void dropInventoryItem(Player player,String removeItem){
        // Drop items from inventory
        boolean found = false;
        for (int i=0;i<player.getInventory().getAmountItems();i++){
            if(player.getInventory().getItemName(i).toUpperCase().contains(removeItem.toUpperCase())){
               found = true; 
               player.getInventory().removeItem(i);
               System.out.println("*** Item deleted! ***\n");
               listInventoryItems(player);
            }    
        }
        if(found==false){
            System.out.println("*** Item not found in your inventory ***");
        }    
    }
    
    public static void setInitialItems (Player player){
        //Start some items in the Inventory
        Item bubbleGum = new Item();
        bubbleGum.setName("Bubble gum");
        bubbleGum.setDescription("1 Bubble Gum in your pocket.");
        bubbleGum.setAmount(1);
        player.getInventory().setItem(bubbleGum);
        
        Item pencil = new Item();
        pencil.setName("Pencil");
        pencil.setDescription("A black pencil very used.");
        pencil.setAmount(1);
        player.getInventory().setItem(pencil);
    }
}
