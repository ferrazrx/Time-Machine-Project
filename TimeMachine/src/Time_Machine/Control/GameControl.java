/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Inventory;
import Time_Machine.Model.Map;
import Time_Machine.Model.Player;
import Time_Machine.Model.TimeMachine;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class GameControl {// Class that set a new game
    
    //Create a new Game
    public static int createNewGame(Player player) {
    Game game = new Game(); // create new game
    Main.setCurrentGame(game);// save in Main
    
    //set player created in the main class
    game.setPlayer(player);
    
    //Create the inventory list and save in the game
    Inventory inventory = InventoryControl.createInventoryItems();
    //Set inventory on the game
    game.setInventory(inventory);
    
    //Create a new Map
    Map map = MapControl.createMap();
    //Set map on the game
    game.setMap(map);
    //Move actor to start location
    MapControl.setPlayerStartLocation(game);
    game.setMap(map);
    
    //Create a new Time Machine
    TimeMachine timeMachine = TimeMachineControl.createTimeMachine();
    game.setTimeMachine(timeMachine);
    
    //Create new personages
    ArrayList personages = PeopleTownControl.createPersonages();
    game.setPersonages(personages);
    
    return 1;
    //Create array of scenes
    
    
    }
}
