/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.Main;
import Time_Machine.Control.MainMenuControl;
import Time_Machine.Model.Player;

/**
 *
 * Group 7
 */
public class HelpMenuView {
     private String helpMenu; 
    
     public HelpMenuView(){    
        this.helpMenu=
            "\n-------------------------------------------"+
            "\n|              Help Menu                  |"+    
            "\n-------------------------------------------\n"+    
            "G - What is the goal of the game?\n" +
            "T - How to talk with people?\n" +
            "I - How to collect items n the inventory\n" +
            "M - How to move to different places?\n" +
            "E - How to use items\n" + 
            "C - Clues to play the game\n" +
            "B - Back to Main Menu\n" + 
            "-------------------------------------------\n";
    }
    public String getHelpMenuOption(){
        System.out.println("Enter a option:");
        String option = GetInput.getString();
        return option;
    }
    public boolean helpMenuAction(String option){
        option = option.toUpperCase();
        switch (option){
            case "G"://create and start a new game
                this.goalGameView();
                break;
            case "T":// See saved games
                this.talkPeopleView();
                break;
            case "I":// Save current game
                this.collectItemView();
                break;
            case "M":
                this.movePlacesView();
                break;
            case "E":
                this.useItemsView();
                break;
            case "C":
                this.cluesView();
                break;    
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }
    public void displayHelpMenuView(){
        System.out.println(this.helpMenu);
        boolean done = false;
        do{
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("B")){
                return;
            }else{
            done = this.helpMenuAction(menuOption);
            }    
        } while(!done);
    }

    private void cluesView() {
        System.out.println("This is a test");
      }

    private void useItemsView() {
       }

    private void movePlacesView() {
       }

    private void collectItemView() {
       }

    private void talkPeopleView() {
       }

    private void goalGameView() {
       }
}
