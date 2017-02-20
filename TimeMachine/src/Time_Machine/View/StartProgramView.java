/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;
import Time_Machine.Control.PlayerControl;
import Time_Machine.Model.Player;

/*
 * @author Group 7
 */
public class StartProgramView {

    public StartProgramView() {
    GameDetailView.displayGameBanner();
    }
    
    //Function that get the player's name
    public Player displayStartProgramView (){
        Player newPlayer;
        do{
            System.out.println("\n\tPlease, enter your first name:");
            String playerName = GetInput.getString();
            newPlayer = PlayerControl.startNewPlayer(playerName);
            if(newPlayer == null){
                System.out.println("You entered an invalid name. Your name must be greater then 1 characters in length.");
            }
        }while(newPlayer == null);
        return newPlayer;
    }
    
    public String playerOptions(){
        System.out.println("Choose a action:"
                + "\n\t S - Save Game"
                + "\n\t M - Move to another location on the map"
                + "\n\t L - See current Location"
                + "\n\t I - See inventory items"
                + "\n\t T - Time Machine Options"
                + "\n\t E - Main Menu");
        String option = GetInput.getString();
        return option;
    } 
    public String TimeMachineOptions(){
        System.out.println("Choose a Time Machine option:"
                + "\n\t F - Try to fix the Time Machine"
                + "\n\t I - Try to combine items with the Time Machine"
                + "\n\t R - Try to turn the Time Machine on"
                + "\n\t B - Back to Game Manu ");
        String option = GetInput.getString();
        return option;
    }
}

