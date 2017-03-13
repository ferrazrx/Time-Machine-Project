/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Location;
import Time_Machine.Model.Map;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class MapControl {
    
    //Print current player's location on map 
    public static Location playerCurrentLocation(Game game){
        Location currentLocation = game.getPlayer().getCurrentLocation();
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
        return game.getPlayer().getCurrentLocation();
    }
    
    //Print all locations available on Map
    public static void listLocations(Game game){
        System.out.println("\tOther Locations:");
        for(int i=0;i<game.getMap().getLocations().size();i++){
            Location location = (Location) game.getMap().getLocations().get(i);
            String locationName = location.getLocationName().substring(0, 1).toUpperCase()+location.getLocationName().substring(1).toLowerCase();
            System.out.println(
                    " - " + locationName + " - " + (location.getLocationVisited()== true? "Visited" : "Not Visited")  + ";"
            );
        }
     }    
    
    public static void movePlayerLocation(Game game, String place) {
        boolean found = false;
        if(game.getPlayer().getCurrentLocation().getLocationName().toUpperCase().contains(place.toUpperCase())){
            System.out.println("You're already at "+game.getPlayer().getCurrentLocation().getLocationName().substring(0,1).toUpperCase()+game.getPlayer().getCurrentLocation().getLocationName().substring(1).toLowerCase()+".");
        }else{
            for(int i=0;i<game.getMap().getLocations().size();i++){
                Location location = (Location) game.getMap().getLocations().get(i);
                if(location.getLocationName().toUpperCase().contains(place.toUpperCase())){
                    found = true;
                    game.getPlayer().setCurrentLocation(location);
                     System.out.println("*** Now you're at "+ game.getPlayer().getCurrentLocation().getLocationName()+" ***");
                     game.getPlayer().getCurrentLocation().setLocationVisited(true);
                }
            }
            if(found == false){
                System.out.println("Place not found!");
            }
        }   
    }
    
    //Create a new Map and set initial location;
    public static Map createMap(){
        //Create Map
        Map map = new Map();
        
         //Start Locations
        Location barn = new Location("BARN",false,"Old build full of livestock");
        Location cityHall = new Location("CITY HALL",false,"The administration building of the municipal government.");
        Location policeDepartment = new Location("POLICE STATION",false,"A police force is a constituted body of persons\n empowered by the state to enforce the law, protect\n property, and limit civil disorder.");
        Location parentsHouse = new Location("PARENT'S HOUSE",false,"Where your father lives! Remember he is a kid now!");
        Location bakery = new Location("BAKERY",false,"Establishment that produces and sells flour-based food baked in an oven such as bread, cookies, cakes.");
        Location fireStation = new Location("FIRE STATION",false,"Area set aside for storage of firefighting apparatus\n such as fire engines and related vehicles,\n personal protective equipment.");
        
        //Add locations on Map
        ArrayList locations;        
        locations = new ArrayList(){{
        add(barn);
        add(cityHall);
        add(policeDepartment);
        add(parentsHouse);
        add(bakery);
        add(fireStation);
        }};
        map.setLocation(locations);
        
        //return Map
        return map;
    }

    public static void setPlayerStartLocation(Game game) {
        Location location = (Location) game.getMap().getLocations().get(0);
        game.getPlayer().setCurrentLocation(location);
        game.getPlayer().getCurrentLocation().setLocationVisited(true);
    }
}
