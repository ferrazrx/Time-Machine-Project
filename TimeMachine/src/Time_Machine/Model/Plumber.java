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
public class Plumber extends Person implements Serializable{
  
    private String plumber;

    public Plumber() {
    }

    public String getPlumber() {
        return plumber;
    }

    public void setPlumber(String plumber) {
        this.plumber = plumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.plumber);
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
        final Plumber other = (Plumber) obj;
        if (!Objects.equals(this.plumber, other.plumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Plumber{" + "plumber=" + plumber + '}';
    }
 
    
}