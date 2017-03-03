/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.Main;
import Time_Machine.Control.MapControl;

/**
 *
 * Group 7
 */
class GameMenuView extends View {
    
    public GameMenuView(){
    super(  "\n-------------------------------------------"+
            "\n|              Game Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "V - View Map of Bozeman\n" +
            "I - View Inventory Ttems\n" +
            "A - View list of People in Town\n" +
            "S - View the Time Machine status\n" +
            "P - Back to Barn\n" +
            "X - Try to turn on the Time Machine\n" +
            "L - Look around for clues, stuff and food\n" +
            "E - Talk with John\n" +
            "T - Use tools available\n" +
            "B - Back to Main Menu\n" + 
            "-------------------------------------------\n");
    }
    
    public boolean action(String menuOption) {
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
                this.seeTimeMachineStatus();
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
        MapView mapView = new MapView();
        mapView.displayMenu();
        System.out.println(this.menu);
    }

    private void seeInventoryItems() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayMenu();
        System.out.println(this.menu);     
    }

    private void seeTimeMachineStatus() {
        TimeMachineView timeMachineView = new TimeMachineView();
        timeMachineView.displayMenu();
        System.out.println(this.menu);  
    }
    
}
