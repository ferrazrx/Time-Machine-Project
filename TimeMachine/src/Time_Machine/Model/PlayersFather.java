/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;
import java.io.Serializable;
import java.util.Arrays;
/**
 *
 * @author sinitcyna-elena
 */
public class PlayersFather extends Person implements Serializable{
    private String[] playersFatherMessage;

    public PlayersFather() {
    }
    

    public String[] getPlayersFatherMessage() {
        return playersFatherMessage;
    }

    public void setPlayersFatherMessage(String[] playersFatherMessage) {
        this.playersFatherMessage = playersFatherMessage;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Arrays.deepHashCode(this.playersFatherMessage);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayersFather other = (PlayersFather) obj;
        if (!Arrays.deepEquals(this.playersFatherMessage, other.playersFatherMessage)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayersFather{" + "playersFatherMessage=" + playersFatherMessage + '}';
    }
    
}
