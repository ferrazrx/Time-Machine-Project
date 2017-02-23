/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Inventory;
import Time_Machine.Model.Item;
import java.util.List;

/**
 *
 * @author Group 7
 */
public class InventoryControl {
    public static void addInventoryItem(Inventory playerInventory, Item newItem){
        playerInventory.setItem(newItem);
        System.out.println("Item Added to your inventory!"
                + "\nNow your inventory has:\n");
        for (int i=0;i<playerInventory.getAmountItems();i++){
            System.out.println("\t * "+ playerInventory.getItemInformations(i));
        }
    
    }
    public static void dropInventoryItem(Inventory playerInventory,String removeItem){
        String name = removeItem.substring(0, 1).toUpperCase() + removeItem.substring(1);
        for (int i=0;i<playerInventory.getAmountItems();i++){
            if(name.equals(playerInventory.getItemName(i))){
               playerInventory.removeItem(i);
               System.out.println("Item deleted!\n"
                + "Now Your Inventory has");
                for (i=0;i<playerInventory.getAmountItems();i++){
                System.out.println("\t * "+ playerInventory.getItemInformations(i));
                }
            }    
        }
        
    }
    public static void getInventoryItems(Inventory playerInventory){
        System.out.println("Inventory Items:");
        if(playerInventory.getAmountItems()<1){
            System.out.println("Your inventory is empty");
        }else{
            for (int i=0;i<playerInventory.getAmountItems();i++){
                System.out.println("\t * "+ playerInventory.getItemInformations(i));
            }
        }   
    }
}
