/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Inventory;
import Time_Machine.Model.Map;
import Time_Machine.Model.Personage;
import Time_Machine.Model.Player;
import Time_Machine.Model.Scene;
import Time_Machine.Model.TimeMachine;
import Time_Machine.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class GameControl  {// Class that set a new game
    
    //Create a new Game
    public static Game createNewGame(Player player) throws Exception {
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
    //Move player to start location
    MapControl.setPlayerStartLocation(game);
    game.setMap(map);
    
    //Create a new Time Machine
    TimeMachine timeMachine = TimeMachineControl.createTimeMachine();
    game.setTimeMachine(timeMachine);
    
    //Create new personages
    ArrayList personages = PersonageControl.createPersonages();
    game.setPersonages(personages);
    
    //Create new Scenes
    Scene[] scenes = SceneControl.createScene();
    LocationControl.assignScenesToLocations(map, scenes);
    SceneControl.setPersonageInScene(game, (Personage) personages.get(0),"liveroom");

    return game;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream (fops);
            output.writeObject(currentGame);
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    }

    public static void startSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream (filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        Main.setCurrentGame(game);
    }
}
