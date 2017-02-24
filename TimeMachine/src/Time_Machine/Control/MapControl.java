/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Location;
import Time_Machine.Model.Player;

/**
 *
 * @author Group 7
 */
public class MapControl {
    
    public static void playerPlaceInMap(Player player){
        Location currentLocation = player.getCurrentLocation();
        System.out.println("Your current localization:");
        System.out.println(
                "__________________________________\n"
              + "--"+currentLocation.getLocationName()+"--\n"
              + "\tDescription: "+ currentLocation.getLocationDescription());
        if(currentLocation.getLocationVisited()==true){
            System.out.println("\tLocation Visited.");    
        }else{
            System.out.println("\tNew Location.");            
        }
    
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    // Volume Of Tetrahedron
    private static double volume;
    
    public double calcVolumeOfTetrahedron (double sideLength) {
        if(sideLength < 0) {
        System.out.println("Length is negative");
        return -1;
        }
        else {
        MapControl.volume = Math.round(Math.pow(sideLength, 3) / (6 * Math.sqrt(2)));
        System.out.println("Here is the volume of tetrahedron: " + MapControl.volume);
        return MapControl.volume;
        }

    }
    */
    

    
}
