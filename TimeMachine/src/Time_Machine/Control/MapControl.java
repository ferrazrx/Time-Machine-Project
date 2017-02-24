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
        System.out.println("__________________________________\n");
    
        
    
    }
      
     public static void listLocations(Player player){
        System.out.println("\tOther Locations:");
        for(int i=0;i<player.getMap().getLocations().size();i++){
            Location location = (Location) player.getMap().getLocations().get(i);
            String locationName = location.getLocationName().substring(0, 1).toUpperCase()+location.getLocationName().substring(1).toLowerCase();
            System.out.println(
                    " - " + locationName + " - " + (location.getLocationVisited()== true? "Visited" : "Not Visited")  + ";"
            );
        }
     }    
    
    public static void movePlayerLocation(Player player, String place) {
        place = place.toUpperCase();
        if(player.getMap().getLocationByString(place)== null){
            System.out.println("*** Location not found! Try again! ***");
        } else {
            Location location = player.getMap().getLocationByString(place);
            System.out.println(location.toString());
            player.setCurrentLocation(location);
            System.out.println("*** Now you're at "+ player.getCurrentLocation().getLocationName()+" ***");
            playerPlaceInMap(player);
            player.getMap().getLocationByString(place).setLocationVisited(true);
        }
        
        
    }    
}
