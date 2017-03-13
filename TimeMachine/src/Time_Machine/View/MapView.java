/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.Main;
import Time_Machine.Control.MapControl;

/**
 *
 * @author Group 7
 */
public class MapView extends View {
   
   
   public MapView(){
       super(
            "\n-------------------------------------------"+
            "\n|              Map Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "C - Current Location\n"
          + "M - Move to Another Location\n" +
            "B - Back to Game Menu\n" + 
            "-------------------------------------------\n");
   }
   
   @Override
    public boolean action(String option){
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
    
    private void currentLocation() {
        MapControl.playerPlaceInMap(Main.getCurrentGame());
        MapControl.listLocations(Main.getCurrentGame());
    }

    private void movePlayerToAnotherLocation() {
        System.out.println("Enter a place(it can be part of the name) to move:");
        String placeOption = this.getInputValue();
        MapControl.movePlayerLocation(Main.getCurrentGame(), placeOption);
    }
}
