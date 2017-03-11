/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Inventory;
import Time_Machine.Model.Item;
/**
 *
 * @author Group 7
 */
public class InventoryControl {
    
    public static void listInventoryItems(Game game){
        System.out.println("Inventory Items:");
        if(game.getInventory().getAmountItems()<1){
            System.out.println("*** Your inventory is empty ***");
        }else{
            System.out.println("\nYour inventory has:\n");
            for (int i=0;i<game.getInventory().getAmountItems();i++){
                Item item = game.getInventory().getItemByIndex(i);
                if(item.getAmount()>1){
                System.out.println(
                    "\t_________________________________________________\n"
                  +  "\tItem's Name: " + item.getName()+".\n"
                  + "\tDescription: " + item.getDescription() +".\n"
                  + "\tAmount: "+ item.getAmount() +".");
                }
            }
        }    
    }
    
    public static void addInventoryItem(Game game, Item newItem){
        // Add items on inventory
        boolean found = false;
        for (int i=0;i<game.getInventory().getAmountItems();i++){
            Item item = (Item) game.getInventory().getItems().get(i);
            if(item.getName().toUpperCase().equals(newItem.getName().toUpperCase())){
                item.AddAmount();
                System.out.println("** Now you have "+item.getAmount()+" " + item.getName()+ " ***");
                found = true;
                listInventoryItems(game);
            }
        }
        if(found == false){
                game.getInventory().setItem(newItem);
                System.out.println("*** Item Added to your inventory! ***");
                listInventoryItems(game);
        }
    }
    public static void dropInventoryItem(Game game,String removeItem){
        // Drop items from inventory
        boolean found = false;
        for (int i=0;i<game.getInventory().getAmountItems();i++){
            Item item = (Item) game.getInventory().getItems().get(i);
            if(item.getName().toUpperCase().contains(removeItem.toUpperCase())){
               found = true; 
               game.getInventory().removeItem(i);
               System.out.println("*** Item deleted! ***\n");
               listInventoryItems(game);
            }    
        }
        if(found==false){
            System.out.println("*** Item not found in your inventory ***");
        }    
    }
    
    public static Inventory createInventoryItems (){// Create a new inventory and set initial item 
        //Create a new inventory
        Inventory inventory = new Inventory();
        
        //Start some items in the Inventory
        Item bubbleGum = new Item(1);
        bubbleGum.setRequiredAmount(2);
        bubbleGum.setName("Bubble gum");
        bubbleGum.setDescription("1 Bubble Gum in your pocket.");
        //Add bubbleGum in the inventory
        inventory.setItemById(ItemEnum.bubbleGum.ordinal(),bubbleGum);
        
        //Start some items in the Inventory
        Item pencil = new Item(1);
        pencil.setRequiredAmount(0);
        pencil.setName("Pencil");
        pencil.setDescription("A black pencil very used.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.pencil.ordinal(),pencil);
        
        //Start some items in the Inventory
        Item capacitor = new Item(0);
        capacitor.setRequiredAmount(1);
        capacitor.setName("New Flux capacitor");
        capacitor.setDescription("A big part of the machine");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.fluxCapacitor.ordinal(),capacitor);
        
        //Start some items in the Inventory
        Item wire = new Item(0);
        wire.setRequiredAmount(1);
        wire.setName("High voltage wire");
        wire.setDescription("A essential part of the time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.wire.ordinal(),wire);
        
        //Start some items in the Inventory
        Item pliers = new Item(0);
        pliers.setRequiredAmount(1);
        pliers.setName("Pliers");
        pliers.setDescription("Util to fix the time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.pliers.ordinal(),pliers);

        //Start some items in the Inventory
        Item coil = new Item(0);
        coil.setRequiredAmount(2);
        coil.setName("Pliers");
        coil.setDescription("Util to fix the time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.coil.ordinal(),coil);
        
        
        //Start some items in the Inventory
        Item capacitor1 = new Item(0);
        capacitor1.setRequiredAmount(3);
        capacitor1.setName("Pliers");
        capacitor1.setDescription("Util to fix the time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.capacitor.ordinal(),capacitor1);
        //return Inventory
        return inventory;
    }
}
