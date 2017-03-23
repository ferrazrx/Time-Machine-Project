/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Control.Enum.ItemEnum;
import Time_Machine.Model.Game;
import Time_Machine.Model.Inventory;
import Time_Machine.Model.Item;
import Time_Machine.exceptions.InventoryControlException;
import java.util.ArrayList;
/**
 *
 * @author Group 7
 */
public class InventoryControl {
    
    //Display all item in player's inventory
    public static ArrayList<Item> listInventoryItems(Game game) throws InventoryControlException{
        boolean found = false;
        ArrayList<Item> items = new ArrayList<>();
        for(Item item : game.getInventory().getItems()){
            if(item.getAmount()>0){
                found =true;
                items.add(item);
            }
        }
        if(found == false){
           throw new InventoryControlException("***   Your Inventory is empty!   ***");
        }
        return items;
    }
    
    //Add a new item into player's inventory
    public static Item addInventoryItem(Game game, Item newItem){
        // Add items on inventory
        boolean found = false;
        Item addedItem = null; 
        for(Item item : game.getInventory().getItems()){
            if(item.getName().toUpperCase().equals(newItem.getName().toUpperCase())){
                found = true;
                item.AddAmount();
                addedItem = item;
                
            }
        }
        if(found == false){
                game.getInventory().setItem(newItem);
        }
        return addedItem;
    }
    
    //Drop item from player's inventory
    public static Item dropInventoryItem(Game game,String removeItem) throws InventoryControlException{
        if(removeItem == null || removeItem.equals("")){
            throw new InventoryControlException("Item's name cannot be empty. Try again.");
        }
        // Drop items from inventory
        boolean found = false;
        Item item = null;
        for (int i=0;i<game.getInventory().getAmountItems();i++){
            item = (Item) game.getInventory().getItems().get(i);
            if(item.getName().toUpperCase().contains(removeItem.toUpperCase())){
               found = true; 
               game.getInventory().removeItem(i);
               return item;
            }    
        }
        if(found==false){
            throw new InventoryControlException("*** Item not found in your inventory ***");
        }
        return item;
    }
    
    //Create initial item to the new inventory
    public static Inventory createInventoryItems (){// Create a new inventory and set initial item 
        //Create a new inventory
        Inventory inventory = new Inventory();
        
        //Start some items in the Inventory
        Item bubbleGum = new Item(1);
        bubbleGum.setRequiredAmount(2);
        bubbleGum.setName("Bubble gum");
        bubbleGum.setDescription("A Bubble Gum in your pocket.");
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
        Item capacitor = new Item(1);
        capacitor.setRequiredAmount(1);
        capacitor.setName("New Flux capacitor");
        capacitor.setDescription("A big part of the machine");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.fluxCapacitor.ordinal(),capacitor);
        
        //Start some items in the Inventory
        Item wire = new Item(0);
        wire.setRequiredAmount(1);
        wire.setName("High Voltage Wire");
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
        Item coil = new Item(1);
        coil.setRequiredAmount(2);
        coil.setName("Air Core Wire Coils");
        coil.setDescription("Util to fix the time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.coil.ordinal(),coil);
        
        //Start some items in the Inventory
        Item capacitor1 = new Item(0);
        capacitor1.setRequiredAmount(3);
        capacitor1.setName("Capacitor of 1500uf 25V");
        capacitor1.setDescription("Util to fix the time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.capacitor.ordinal(),capacitor1);
        
        Item apple = new Item(0);
        apple.setRequiredAmount(0);
        apple.setName("Apple");
        apple.setDescription("A good fruit to eat.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.apple.ordinal(),apple);
        
        Item bread = new Item(0);
        bread.setRequiredAmount(0);
        bread.setName("Bread");
        bread.setDescription("A half chunk of bread.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.bread.ordinal(),bread);
        
        Item newspaper = new Item(0);
        newspaper.setRequiredAmount(0);
        newspaper.setName("Bread");
        newspaper.setDescription("An important news paper that bring a news about a scientist that said he was building a time machine.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.apple.ordinal(),newspaper);
        
        Item bottle = new Item(0);
        bottle.setRequiredAmount(0);
        bottle.setName("Bottle of Water");
        bottle.setDescription("Just water.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.bottle.ordinal(),bottle);
        
        Item metalnails = new Item(0);
        metalnails.setRequiredAmount(0);
        metalnails.setName("Metal Nails");
        metalnails.setDescription("A bunck of nails.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.metalnails.ordinal(),metalnails);
        
        Item crowbar = new Item(0);
        crowbar.setRequiredAmount(0);
        crowbar.setName("Crowbar");
        crowbar.setDescription("A metal bar.");
        //Add pencil in the inventory
        inventory.setItemById(ItemEnum.metalnails.ordinal(),crowbar);
        //return Inventory
        return inventory;
    }
}
