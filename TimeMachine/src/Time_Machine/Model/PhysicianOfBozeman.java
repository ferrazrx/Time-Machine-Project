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
public class PhysicianOfBozeman extends Person implements Serializable{
    private String physicianOfBozeman;

    public PhysicianOfBozeman() {
    }

    public String getPhysicianOfBozeman() {
        return physicianOfBozeman;
    }

    public void setPhysicianOfBozeman(String physicianOfBozeman) {
        this.physicianOfBozeman = physicianOfBozeman;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.physicianOfBozeman);
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
        final PhysicianOfBozeman other = (PhysicianOfBozeman) obj;
        if (!Objects.equals(this.physicianOfBozeman, other.physicianOfBozeman)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhysicianOfBozeman{" + "physicianOfBozeman=" + physicianOfBozeman + '}';
    }

    
    
}
