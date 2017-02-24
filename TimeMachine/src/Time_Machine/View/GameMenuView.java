/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.Main;

/**
 *
 * Group 7
 */
class GameMenuView {
    private String menu;
    
    public GameMenuView(){
    this.menu = 
            "\n-------------------------------------------"+
            "\n|              Game Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "V - View map of Bozeman\n" +
            "I - View inventory items\n" +
            "A - View list of People in Town\n" +
            "S - View/Fix the time machine status\n" +
            "P - Back to Barn\n" +
            "X - Try to turn on the Time Machine\n" +
            "M - Move to new location in Bozeman\n" +
            "L - Look around for clues, stuff and food\n" +
            "E - Talk with John\n" +
            "T - Use tools available\n" +
            "B - Back to Main Menu\n" + 
            "-------------------------------------------\n";
    }
    public String getGameMenuOption(){
        System.out.println("Enter a option:");
        String option = GetInput.getString();
        return option;
    }
    public void displayGameMenuView(){
        System.out.println(this.menu);
        boolean done = false;
        do{
            String menuOption = this.getGameMenuOption();
            if(menuOption.toUpperCase().equals("B")){
                return;
            }else{
                done= this.gameMenuAction(menuOption);
            }
        }while(!done);
    }

    private boolean gameMenuAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "V":
                this.viewBozemanMap();
                break;
            case "I":
                this.seeInventoryItems();
                break;
            case "A":
                break;
            case "S":
                break;
            case "P":
                break;    
            case "X":
                break;
            case "M":
                break;    
            case "L":
                break;    
            case "E":
                break;    
            case "T":
                break;    
            case "B":
                break;
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    }

    private void viewBozemanMap() {
        GameDetailView.displayBozemanMap();
    }

    private void seeInventoryItems() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
        System.out.println(this.menu);
        
    }
    
}
