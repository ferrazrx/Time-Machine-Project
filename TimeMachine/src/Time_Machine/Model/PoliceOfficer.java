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
public class PoliceOfficer implements Serializable{
    
    private String[] policeMessage;

    public PoliceOfficer() {
    }

    
    public String[] getPoliceMessage() {
        return policeMessage;
    }

    public void setPoliceMessage(String[] policeMessage) {
        this.policeMessage = policeMessage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Arrays.deepHashCode(this.policeMessage);
        return hash;
    }

    @Override
    public String toString() {
        return "PoliceOfficer{" + "policeMessage=" + policeMessage + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PoliceOfficer other = (PoliceOfficer) obj;
        if (!Arrays.deepEquals(this.policeMessage, other.policeMessage)) {
            return false;
        }
        return true;
    }
    
    
    
}
