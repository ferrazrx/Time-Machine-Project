/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Player;

/**
 *
 * @author ? 
 */
public class PlayerControl {
    public static Player startNewPlayer(String playerName){
        if(playerName.equals("") || playerName == null || playerName.length()<2){
            return null;
        } else{
            Player newPlayer = new Player();
            newPlayer.setName(playerName);
            return newPlayer;
        }
    }
    
}
