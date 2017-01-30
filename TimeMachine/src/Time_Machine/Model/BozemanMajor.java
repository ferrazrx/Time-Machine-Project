/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author sinitsyndmitriy
 */
public class BozemanMajor extends Person implements Serializable{
    private String bozemanMajor;

    public BozemanMajor() {
    }

    public String getBozemanMajor() {
        return bozemanMajor;
    }

    public void setBozemanMajor(String bozemanMajor) {
        this.bozemanMajor = bozemanMajor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.bozemanMajor);
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
        final BozemanMajor other = (BozemanMajor) obj;
        if (!Objects.equals(this.bozemanMajor, other.bozemanMajor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BozemanMajor{" + "bozemanMajor=" + bozemanMajor + '}';
    }

    
}