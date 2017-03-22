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
        this.console.println("In contruction");  
    }

    private void saveGame() {
        this.console.println("In construction.");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }    
}
