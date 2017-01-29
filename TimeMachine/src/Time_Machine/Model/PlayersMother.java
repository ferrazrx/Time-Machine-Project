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
public class PlayersMother extends Person implements Serializable{
    private String[] playersMotherMessage;

    public PlayersMother() {
    }

    public String[] getPlayersMotherMessage() {
        return playersMotherMessage;
    }

    public void setPlayersMotherMessage(String[] playersMotherMessage) {
        this.playersMotherMessage = playersMotherMessage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Arrays.deepHashCode(this.playersMotherMessage);
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
        final PlayersMother other = (PlayersMother) obj;
        if (!Arrays.deepEquals(this.playersMotherMessage, other.playersMotherMessage)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayersMother{" + "playersMotherMessage=" + playersMotherMessage + '}';
    }

    public void setPlayersMotherMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPlayersMotherMessage(String some_mothers_message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
