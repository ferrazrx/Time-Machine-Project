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
 * @author sinitsyndmitriy
 */
public class Baker extends Person implements Serializable{
   private String[] baker;

    public Baker() {
    }

    public String[] getBaker() {
        return baker;
    }

    public void setBaker(String[] baker) {
        this.baker = baker;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Arrays.deepHashCode(this.baker);
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
        final Baker other = (Baker) obj;
        if (!Arrays.deepEquals(this.baker, other.baker)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Baker{" + "baker=" + baker + '}';
    }
    
    
    
    
}
