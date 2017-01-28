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
public class Bozeman implements Serializable{
    
    private String[] bozemanInformation;

    public Bozeman() {
    }

    
    public String[] getBozemanInformation() {
        return bozemanInformation;
    }

    public void setBozemanInformation(String[] bozemanInformation) {
        this.bozemanInformation = bozemanInformation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Arrays.deepHashCode(this.bozemanInformation);
        return hash;
    }

    @Override
    public String toString() {
        return "Bozeman{" + "bozemanInformation=" + bozemanInformation + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bozeman other = (Bozeman) obj;
        if (!Arrays.deepEquals(this.bozemanInformation, other.bozemanInformation)) {
            return false;
        }
        return true;
    }
    
    
    
}
