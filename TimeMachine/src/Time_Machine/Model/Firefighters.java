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
 * @author Skyler
 */
public class Firefighters implements Serializable{
    private String[] fireFighterMessage;

    public Firefighters() {
    }

    
    public String[] getFireFighterMessage() {
        return fireFighterMessage;
    }

    public void setFireFighterMessage(String[] fireFighterMessage) {
        this.fireFighterMessage = fireFighterMessage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Arrays.deepHashCode(this.fireFighterMessage);
        return hash;
    }

    @Override
    public String toString() {
        return "Firefighters{" + "fireFighterMessage=" + fireFighterMessage + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Firefighters other = (Firefighters) obj;
        if (!Arrays.deepEquals(this.fireFighterMessage, other.fireFighterMessage)) {
            return false;
        }
        return true;
    }
    
    
}
