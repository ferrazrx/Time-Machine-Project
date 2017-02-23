/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.InventoryControl;
import Time_Machine.Model.Inventory;

/**
 * @author Group 7
 */
public class InventoryView {
   private String inventoryMenu;
   private Inventory playerInventory;
   
   public InventoryView(Inventory playerInventory){
       this.playerInventory = playerInventory;
       this.inventoryMenu =
            "\n-------------------------------------------"+
            "\n|              Invetory Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "E - See Item details\n" +
            "D - Drop Item\n" +
            "U - Use Item\n" +
            "B - Back to Game Menu\n" + 
            "-------------------------------------------\n";
 ;
   }
   public String getInventoryOption(){
        System.out.println("Enter a option:");
        String option = GetInput.getString();
        return option;
    }
    public boolean helpMenuAction(String option){
        option = option.toUpperCase();
        switch (option){
            case "E":
                this.seeItemDetail();
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
    public void displayInventoryView(){
        InventoryControl.getInventoryItems(this.playerInventory);
        System.out.println(this.inventoryMenu);
        boolean done = false;
        do{
            String menuOption = this.getInventoryOption();
            if (menuOption.toUpperCase().equals("B")){
                return;
            }else{
            done = this.helpMenuAction(menuOption);
            }    
        } while(!done);
    }

    private void seeItemDetail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void dropItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void useItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}