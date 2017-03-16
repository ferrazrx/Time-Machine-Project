/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Control.Enum.SceneType;
import Time_Machine.Model.Game;
import Time_Machine.Model.Location;
import Time_Machine.Model.Personage;
import Time_Machine.Model.Scene;
import Time_Machine.exceptions.SceneControlException;

/**
 *
 * @author Group 7
 */
public class SceneControl {
    
    //Function used to set personages in a specific scene
    public static void setPersonageInScene (Game game, Personage personage, String name) throws SceneControlException{
        if(name == null || name.equals("")){
            throw new SceneControlException("The personage's name cannot be empty. Try Again.");
        }
        boolean found = false;
        for (int i=0; i<game.getMap().getLocations().size(); i++){
            Location location = (Location) game.getMap().getLocations().get(i);
            for (int a=0; a<location.getSceneLocation().size(); a++){
               Scene scene = (Scene) location.getSceneLocation().get(a);
               if(scene.getSceneName().toUpperCase().contains(name.toUpperCase())){
                   found = true;
                   scene.setPersonage(personage);
               }
            }     
        }    
        if(found == false){
            throw new SceneControlException("Scene not found. Try again.");
        }
    }
    
    //Function used to get personages from a specific scene
    public static void getScenesAndPersonages(Game game){
            System.out.println("Places Available in the " +game.getPlayer().getCurrentLocation().getLocationName().toLowerCase()+":\n");
            if(game.getPlayer().getCurrentLocation().getSceneLocation().size()<1){
                System.out.println("No places available!");
            } else {
                for (int i=0; i<game.getPlayer().getCurrentLocation().getSceneLocation().size(); i++){
                    Scene scene = (Scene) game.getPlayer().getCurrentLocation().getSceneLocation().get(i);
                    System.out.println(scene.getSceneName().substring(0, 1).toUpperCase()+scene.getSceneName().substring(1).toLowerCase()+":");
                    System.out.println("_____________________________________________\n");
                    System.out.println("\tPeople available to talk in "+scene.getSceneName().substring(0, 1).toUpperCase()+scene.getSceneName().substring(1).toLowerCase()+":");
                    if(scene.getPersonages().size()<1){
                        System.out.println("There is no one available in this place!");
                    }else{
                        for (int a=0;a<scene.getPersonages().size();a++){
                            Personage personage = (Personage) scene.getPersonages().get(a);
                            System.out.println("\t"+a+" - "+personage.getName());
                        }
                    }    
                }
            }    
    }
    
    //Create inicial scenes
    public static Scene[] createScene(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        //Scene stable
        Scene stable = new Scene("STABLE","An old place without any horses.");
        stable.setBlocked(false);
        scenes[SceneType.stable.ordinal()] = stable;
        
        
        //Scene major Office
        Scene majorOffice = new Scene("MAJOR OFFICE", "Office where the major works.");
        majorOffice.setBlocked(true);
        scenes[SceneType.majorOffice.ordinal()] = majorOffice;
        
        //Scene police office
        Scene policeOffice = new Scene("POLICE OFFICE", "An office with a table and a chair.");
        policeOffice.setBlocked(true);
        scenes[SceneType.policeOffice.ordinal()] = policeOffice;
        
        //Scene liveroom
        Scene liveroom = new Scene("LIVEROOM", "The liveroom of your grandparent's house.");
        liveroom.setBlocked(false);
        scenes[SceneType.liveroom.ordinal()] = liveroom;
        
        //Scene vehicles yard
        Scene vehiclesYard = new Scene("VEHICLES YARD", "Place where the fire trucks are parked.");
        vehiclesYard.setBlocked(false);
        scenes[SceneType.vehiclesYard.ordinal()] = vehiclesYard;
        
        //Scene kitchen
        Scene kitchen = new Scene("KITCHEN", "The place where the breads are produced.");
        kitchen.setBlocked(true);
        scenes[SceneType.kitchen.ordinal()] = kitchen;
                
        return scenes;
    
    }
}
