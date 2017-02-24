/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.Main;
import Time_Machine.Model.Inventory;

/**
 * @author Group 7
 */
public class InventoryView {
   private String inventoryMenu;
   
   public InventoryView(){
       this.inventoryMenu =
            "\n-------------------------------------------"+
            "\n|              Invetory Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "D - Drop Item\n" +
            "U - Use Item\n" +
            "B - Back to Game Menu\n" + 
            "-------------------------------------------\n";
   }
   public String getInventoryOption(){
        String option = GetInput.getString();
        return option;
    }
    public boolean helpMenuAction(String option){
        option = option.toUpperCase();
        switch (option){
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
    public void displayInventoryView(){
        InventoryControl.listInventoryItems(Main.getPlayer());
        System.out.println(this.inventoryMenu);
        boolean done = false;
        do{
            System.out.println("Enter a option:");
            String menuOption = this.getInventoryOption();
            if (menuOption.toUpperCase().equals("B")){
                return;
            }else{
            done = this.helpMenuAction(menuOption);
            }    
        } while(!done);
    }



    private void dropItem(){
        System.out.println("Enter the item's name to drop:");
        String itemOption = this.getInventoryOption();
        InventoryControl.dropInventoryItem(Main.getPlayer(), itemOption);
       
    }

    private void useItem() {
        
   }
    
}