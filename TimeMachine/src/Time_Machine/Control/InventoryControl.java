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
    public static void addInventoryItem(Player player, Item newItem){
        player.getInventory().setItem(newItem);
        System.out.println("Item Added to your inventory!"
                + "\nNow your inventory has:\n");
        for (int i=0;i<player.getInventory().getAmountItems();i++){
            System.out.println("\t * "+ player.getInventory().getItemInformations(i));
        }
    
    }
    public static void dropInventoryItem(Player player,String removeItem){
        String name = removeItem.substring(0, 1).toUpperCase() + removeItem.substring(1);
        for (int i=0;i<player.getInventory().getAmountItems();i++){
            if(name.equals(player.getInventory().getItemName(i))){
               player.getInventory().removeItem(i);
               System.out.println("Item deleted!\n"
                + "Now Your Inventory has");
                for (i=0;i<player.getInventory().getAmountItems();i++){
                System.out.println("\t * "+ player.getInventory().getItemInformations(i));
                }
            }    
        }
        
    }
    public static void getInventoryItems(Player player){
        System.out.println("Inventory Items:");
        if(player.getInventory().getAmountItems()<1){
            System.out.println("Your inventory is empty");
        }else{
            for (int i=0;i<player.getInventory().getAmountItems();i++){
                System.out.println("\t * "+ player.getInventory().getItemInformations(i));
            }
        }   
    }
}
