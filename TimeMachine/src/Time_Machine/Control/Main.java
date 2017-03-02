/*
 * BYU - Idaho - CIT 260 - Winter 2017
 */
package Time_Machine.Control;

//import classes


import Time_Machine.Model.Game;
import Time_Machine.Model.Player;
import Time_Machine.View.MainMenuView;
import Time_Machine.View.StartProgramView;

/**
 * @author Group 7
 */

public class Main {
// Global variables to the current game
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        // Start the game and display the banner
        StartProgramView startProgramView = new StartProgramView();
        // Start a new player for the game and get his name
        Player mainPlayer = startProgramView.displayStartProgramView();
        //Store the player in the current Player variable
        Main.setPlayer(mainPlayer);
        //Create a Main Menu
        MainMenuView mainMenuView = new MainMenuView(mainPlayer);
        // Display the Main Menu and get value
        mainMenuView.displayMainMenuView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Main.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Main.player = player;
    }
    
}