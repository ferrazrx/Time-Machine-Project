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
 * @author rxfer_000
 */
public class John extends Person implements Serializable {
    
    private String[] JohnMessages;

    public John(String[] JohnMessages) {
        this.JohnMessages = JohnMessages;
    }

    public String[] getJohnMessages() {
        return JohnMessages;
    }

    public void setJohnMessages(String[] JohnMessages) {
        this.JohnMessages = JohnMessages;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Arrays.deepHashCode(this.JohnMessages);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final John other = (John) obj;
        if (!Arrays.deepEquals(this.JohnMessages, other.JohnMessages)) {
            return false;
        }
        return true;
    }
    
}
