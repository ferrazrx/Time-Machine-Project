/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Control.Enum.SceneType;
import Time_Machine.Model.Map;
import Time_Machine.Model.Scene;

/**
 *
 * @author Group 7
 */
public class LocationControl {
    public static void assignScenesToLocations (Map map, Scene[] scenes){
        map.getLocationByString("BARN").setSceneLocation(scenes[SceneType.stable.ordinal()]);
        map.getLocationByString("CITY").setSceneLocation(scenes[SceneType.majorOffice.ordinal()]);
        map.getLocationByString("BAKERY").setSceneLocation(scenes[SceneType.kitchen.ordinal()]);
        map.getLocationByString("POLICE").setSceneLocation(scenes[SceneType.policeOffice.ordinal()]);
        map.getLocationByString("HOUSE").setSceneLocation(scenes[SceneType.liveroom.ordinal()]);
        map.getLocationByString("FIRE").setSceneLocation(scenes[SceneType.vehiclesYard.ordinal()]);
    }
    
}
