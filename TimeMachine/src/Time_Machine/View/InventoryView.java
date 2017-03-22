/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.Main;
import Time_Machine.Model.Item;
import Time_Machine.exceptions.InventoryControlException;
import java.util.ArrayList;

/**
 * @author Group 7
 */
public class InventoryView extends View {
   
   public InventoryView(){
       super(   "\n-------------------------------------------"+
                "\n|              Invetory Menu                  |"+    
                "\n-------------------------------------------\n"+    
                "S - See inventory items\n" +
                "D - Drop Item\n" +
                "U - Use Item\n" +
                "B - Back to Game Menu\n" + 
                "-------------------------------------------\n");
   }

   @Override
    public boolean action(String option){
        option = option.toUpperCase();
        switch (option){
            case "S":
                this.seeInventoryItems();
                break;
            case "D":
                this.dropItem();
                break;
            case "U":
                this.useItem();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }
 
    private void dropItem(){
        Item deleted = null;
        String itemOption = null;
        while (deleted == null){
            this.console.println("Enter the item's name to drop or enter \"Back\" to back to game menu:");
            itemOption = this.getInput().toUpperCase();
            if("BACK".equals(itemOption)){
                return;
            }else{
                try {
                    deleted = InventoryControl.dropInventoryItem(Main.getCurrentGame(), itemOption);
                    if(deleted != null){
                        this.console.println("*** Item \""+ deleted.getName() +"\" deleted ***");
                    }
                } catch (InventoryControlException ex) {
                    this.console.println(ex.getMessage());
                }
            }    
        }
    }    
    private void useItem() {
        this.console.println("In constrution! It will be available soon!");
   }

    private void seeInventoryItems() {
        this.console.println("Inventory Items:");
        try {
           ArrayList<Item> items = InventoryControl.listInventoryItems(Main.getCurrentGame());
           for(Item item : items){
                this.console.println("\nYour inventory has:\n");
                this.console.println("_____________________________________________");
                this.console.println("Name: "+ item.getName()+";");
                this.console.println("\tDescription: " + item.getDescription() +".\n" + "\tAmount: "+ item.getAmount() +".");
            }
       } catch (InventoryControlException ex) {
           ErrorView.display(this.getClass().getName(), ex.getMessage() );
       }
        
                
        
    }
    
}