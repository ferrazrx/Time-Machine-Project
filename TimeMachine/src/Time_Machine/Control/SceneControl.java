/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Location;
import Time_Machine.Model.Personage;
import Time_Machine.Model.Player;
import Time_Machine.Model.Scene;

/**
 *
 * @author Group 7
 */
public class SceneControl {
    public static boolean setPersonageInScene (Player player, Personage personage, String name){
        for (int i=0; i<player.getMap().getLocations().size(); i++){
            Location location = (Location) player.getMap().getLocations().get(i);
            for (int a=0; a<location.getScene().size(); a++){
               Scene scene = (Scene) location.getScene().get(a);
               if(scene.getSceneName().toUpperCase().contains(name.toUpperCase())){
                   scene.setPersonage(personage);
                   return true;
               }
            }     
        }    
    return false;           
    }
}
