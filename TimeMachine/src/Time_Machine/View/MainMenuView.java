/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GameControl;
import Time_Machine.Control.Main;
import Time_Machine.exceptions.SceneControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Group 7
 */
public class MainMenuView extends View {
   
    
    // Function that display the Main Menu
    public MainMenuView(){    
        
        super(
            "\n\t***  Welcome "+Main.getPlayer().getName().substring(0,1).toUpperCase()+ Main.getPlayer().getName().substring(1).toLowerCase()+"!  ***"+
            "\n-------------------------------------------"+
            "\n|              Main Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "N - Start the a New Game\n" +
            "G - Get and Start a Saved Game\n" +
            "S - Save Current Game\n" +
            "H - Get Help on How to Play the Game\n" +
            "E - Exit\n\n" + 
            "---------------------------------------------\n");
    }
    @Override
    public boolean action(String option){
        option = option.toUpperCase();
        switch (option){
            case "N"://create and start a new game
                this.startNewGame();
                break;
            case "G":// See saved games
                this.startExistingGame();
                break;
            case "S":// Save current game
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }


    private void startNewGame(){
        try {
            GameControl.createNewGame(Main.getPlayer());
            GameDetailView.displayIntroduction(Main.getPlayer());
            // Display the Game Menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        } catch (Exception ex) {
                ErrorView.display(this.getClass().getCanonicalName(), ex.getMessage());        
        }
        // Display the story introduction    
    }   

    private void startExistingGame() {
       this.console.println("\n\n\tEnter the file path for file where the game is to be saved:");
        String filePath = this.getInput();
        
        try{
            //save the game to specific file
            GameControl.startSavedGame(filePath);
            this.console.println("\n\t*** Game on " + filePath +" ***");
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
       
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\n\tEnter the file path for file where the game is to be saved:");
        String filePath = this.getInput();
        
        try{
            //save the game to specific file
            GameControl.saveGame(Main.getCurrentGame(), filePath);
            this.console.println("\n\t*** Game saved at " + filePath +" ***");
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    
    
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }    
}
