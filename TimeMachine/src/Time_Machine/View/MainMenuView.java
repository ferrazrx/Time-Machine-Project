/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.Main;
import Time_Machine.Control.PeopleTownControl;

/**
 *
 * @author Group 7
 */
public class MainMenuView extends View {
   
    
    // Function that display the Main Menu
    public MainMenuView(){    
        
        super(
            "\tWelcome "+Main.getPlayer().getName().substring(0,1).toUpperCase()+ Main.getPlayer().getName().substring(1).toLowerCase()+"!"+
            "\n-------------------------------------------"+
            "\n|              Main Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "N - Start the a New Game\n" +
            "G - Saved Games\n" +
            "S - Save Current Game\n" +
            "H - Get Help on How to Play the Game\n" +
            "E - Exit\n\n" + 
            "---------------------------------------------\n");
    }
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
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }


    private void startNewGame(){
        // Start the inventory Items
        InventoryControl.setInitialItems(Main.getPlayer());
        // Start the people in the city
        PeopleTownControl.setInitialPeople();
        // Display the story introduction
        GameDetailView.displayIntroduction(Main.getPlayer());
        // Display the Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        System.out.println(this.menu);
    }

    private void startExistingGame() {
        System.out.println("In contruction");  
    }

    private void saveGame() {
        System.out.println("In construction.");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        System.out.println(this.menu);
    }    
}
