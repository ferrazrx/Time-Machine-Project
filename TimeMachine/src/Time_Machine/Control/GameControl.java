/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Control.Enum.PersonageEnum;
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
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
    SceneControl.setPersonageInScene(game, (Personage) personages.get(PersonageEnum.father.ordinal()), "liveroom");
    SceneControl.setPersonageInScene(game, (Personage) personages.get(PersonageEnum.mother.ordinal()), "liveroom");
    
    
    return game;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        if(filePath.equals("") || filePath == null){
            throw new GameControlException("Your file path cannot be empty. Try again!");
        }else{
            try(FileOutputStream fops = new FileOutputStream(filePath)){
                ObjectOutputStream output = new ObjectOutputStream (fops);
                output.writeObject(currentGame);
            }
            catch(Exception e){
                throw new GameControlException(e.getMessage());
            }
        }    
    }

    public static void startSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        if(filePath.equals("") || filePath == null){
            throw new GameControlException("Your file path cannot be empty. Try again!");
        }else{
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

    public static void printReport(Game currentGame, String filePath) throws GameControlException {
        if(filePath.equals("") || filePath == null){
            throw new GameControlException("Your file path cannot be empty. Try again!");
        }else{
            try(PrintWriter outFile = new PrintWriter(filePath)){
                outFile.println("\t\tTIME MACHINE GAME");
                outFile.printf("%n%n%-1s","Player's Name: " + currentGame.getPlayer().getName()+".");
                outFile.printf("%n%-1s","Player's Location: " + currentGame.getPlayer().getCurrentLocation().getLocationName()+".");
                outFile.printf("%n%n%30s","List of Inventory Items");
                outFile.printf("%n%-25s%8s%12s", "Name", "Required", "Amount", "Description" );
                outFile.printf("%n%-25s%8s%12s", "----", "--------", "------", "-----------" );
                currentGame.getInventory().getItems().forEach((item) -> {
                    outFile.printf("%n%-25s%8d%12d", item.getName(), item.getRequiredAmount(), item.getAmount());
                });
                outFile.printf("%n%n%n%25s","List of Personages");
                outFile.printf("%n%n%-20s", "Name");
                outFile.printf("%n%-25s", "----");
                currentGame.getPersonages().forEach((personage) -> {
                    outFile.printf("%n%-20s", personage.getName().substring(0,1).toUpperCase()+personage.getName().substring(1).toLowerCase());
                });
                outFile.printf("%n%n%n%40s","List of Locations Available on Map ");
                outFile.printf("%n%n%-14s%15s", "Name", "Place Visited?");
                outFile.printf("%n%-14s%15s", "----", "--------------");
                currentGame.getMap().getLocations().forEach((location) -> {
                    outFile.printf("%n%-14s%15s", location.getLocationName(), location.getLocationVisited());
                });
            }
            catch(IOException ex){
                throw new GameControlException(ex.getMessage());
            }
        }
    }
}
