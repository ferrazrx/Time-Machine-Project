/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.PlayerControl;
import Time_Machine.Model.Player;
import Time_Machine.exceptions.PlayerControlException;

/*
 * @author Group 7
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super(GameDetailView.displayGameBanner());
    }
    //Function that get the player's name
    public Player displayStartProgramView (){
        System.out.println(menu);
        Player newPlayer = null;
        do{
            System.out.println("\n\tPlease, enter your first name:");
            String playerName = this.getInput();
            try{
                newPlayer = PlayerControl.startNewPlayer(playerName);
            }
            catch(PlayerControlException ex){
                System.out.println(ex.getMessage());
            }
        }while(newPlayer == null);
        return newPlayer;
    }

    @Override
    public boolean action(String value) {
        return true;
    }
}
    



