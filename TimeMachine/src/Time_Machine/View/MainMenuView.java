/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.MainMenuControl;
import Time_Machine.Control.GetInput;
import Time_Machine.Control.Main;
import Time_Machine.Model.Player;

/**
 *
 * @author Group 7
 */
public class MainMenuView {
    private String menu;
    
    // Function that display the Main Menu
    public MainMenuView(Player player){    
        this.menu =
            "\tWelcome "+player.getName()+"!"+
            "\n-------------------------------------------"+
            "\n|              Main Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "N - Start the a New Game\n" +
            "G - Saved Games\n" +
            "S - Save Current cGame\n" +
            "H - Get Help on How to Play the Game\n" +
            "E - Exit\n\n" + 
            "-------------------------------------------\n";
    }
    public String getMainMenuOption(){
        System.out.println("Enter a option:");
        String option = GetInput.getString();
        return option;
    }
    public boolean MainMenuAction(String option){
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
    public void displayMainMenuView(){
        System.out.println(this.menu);
        boolean done = false;
        do{
            String menuOption = this.getMainMenuOption();
            if (menuOption.toUpperCase().equals("E")){
                return;
            }else{
            done = this.MainMenuAction(menuOption);
            }    
        } while(!done);
    }

    private void startNewGame() {
        // Create a new game
        MainMenuControl.startNewGame(Main.getPlayer());
        // Display the story introduction
        GameDetailView.displayIntroduction(Main.getPlayer());
        // Display the Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
        System.out.println(this.menu);
       
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
        System.out.println(this.menu);
    }    
}
