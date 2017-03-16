/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.Main;
import Time_Machine.exceptions.InventoryControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }
 
    private void dropItem(){
        System.out.println("Enter the item's name to drop:");
        String itemOption = this.getInputValue();
       try {
           InventoryControl.dropInventoryItem(Main.getCurrentGame(), itemOption);
       } catch (InventoryControlException ex) {
           System.out.println(ex.getMessage());
       }
    }

    private void useItem() {
        System.out.println("In constrution! It will be available soon!");
   }

    private void seeInventoryItems() {
        InventoryControl.listInventoryItems(Main.getCurrentGame());
    }
    
}