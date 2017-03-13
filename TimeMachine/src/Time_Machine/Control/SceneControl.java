/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Location;
import Time_Machine.Model.Personage;
import Time_Machine.Model.Scene;

/**
 *
 * @author Group 7
 */
public class SceneControl {
    public static boolean setPersonageInScene (Game game, Personage personage, String name){
        for (int i=0; i<game.getMap().getLocations().size(); i++){
            Location location = (Location) game.getMap().getLocations().get(i);
            for (int a=0; a<location.getSceneLocation().size(); a++){
               Scene scene = (Scene) location.getSceneLocation().get(a);
               if(scene.getSceneName().toUpperCase().contains(name.toUpperCase())){
                   scene.setPersonage(personage);
                   return true;
               }
            }     
        }    
    return false;           
    }
    
    public static void getScenesAndPersonages(Game game){
            System.out.println("Places Available in the " +game.getLocation().getLocationName().toLowerCase()+":\n");
            if(game.getLocation().getSceneLocation().size()<1){
                System.out.println("No places available!");
            } else {
                for (int i=0; i<game.getLocation().getSceneLocation().size(); i++){
                    Scene scene = (Scene) game.getLocation().getSceneLocation().get(i);
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
}
