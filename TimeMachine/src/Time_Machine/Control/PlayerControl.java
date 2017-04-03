/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Player;
import Time_Machine.exceptions.PlayerControlException;

/**
 *
 * @author Group 7
 */
public class PlayerControl {
    public static Player startNewPlayer(String playerName) throws PlayerControlException{
        if(playerName.equals("") || playerName == null || playerName.split(" ").length>1 || playerName.split("").length==1){
            throw new PlayerControlException(
                    "********************************\n"+
                    "*  Your name cannot be empty,  *\n" +
                    "*  just one letter or greater  *\n"+
                    "*  than one name. Try Again!   *\n" +
                    "********************************\n");
        } else{
            Player newPlayer = new Player(playerName, 100, 1968);
            return newPlayer;
        }
    }
    
    public static void spendEnergyToMove(){
        int energy = Main.getCurrentGame().getPlayer().getStatusBar() - 10;
        Main.getCurrentGame().getPlayer().setStatusBar(energy);
    }
    
    public static void gainEnergyEating(){
        int energy = Main.getCurrentGame().getPlayer().getStatusBar() + 6;
        Main.getCurrentGame().getPlayer().setStatusBar(energy);
    }
}
