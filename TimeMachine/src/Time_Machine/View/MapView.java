/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.Main;
import Time_Machine.Control.MapControl;

/**
 *
 * @author Group 7
 */
public class MapView {
   private String mapMenu;
   
   public MapView(){
       this.mapMenu =
            "\n-------------------------------------------"+
            "\n|              Map Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "C - Current Location\n"
          + "M - Move to Another Location\n" +
            "B - Back to Game Menu\n" + 
            "-------------------------------------------\n";
   }
   public String getMapOption(){
        String option = GetInput.getString();
        return option;
    }
    public boolean mapAction(String option){
        option = option.toUpperCase();
        switch (option){
            case "C":
                this.currentLocation();
                break;
            case "M":
                this.movePlayerToAnotherLocation();
                break;
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }
    public void displayMapView(){
        System.out.println(this.mapMenu);
        boolean done = false;
        do{
            System.out.println("Enter a option:");
            String menuOption = this.getMapOption();
            if (menuOption.toUpperCase().equals("B")){
                return;
            }else{
            done = this.mapAction(menuOption);
            }    
        } while(!done);
    }

    private void currentLocation() {
        MapControl.playerPlaceInMap(Main.getPlayer());
        MapControl.listLocations(Main.getPlayer());
    }

    private void movePlayerToAnotherLocation() {
        System.out.println("Enter a place(it can be part of the name) to move:");
        String placeOption = this.getMapOption();
        MapControl.movePlayerLocation(Main.getPlayer(), placeOption);
        System.out.println(this.mapMenu);
    }
}
