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
public class Bakery extends Scene implements Serializable{
    private String[] bakeryInfo;
    private String[] bakeryFood;

    public Bakery() {
    }

    public String[] getBakeryInfo() {
        return bakeryInfo;
    }

    public void setBakeryInfo(String[] bakeryInfo) {
        this.bakeryInfo = bakeryInfo;
    }

    public String[] getBakeryFood() {
        return bakeryFood;
    }

    public void setBakeryFood(String[] bakeryFood) {
        this.bakeryFood = bakeryFood;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Arrays.deepHashCode(this.bakeryInfo);
        hash = 17 * hash + Arrays.deepHashCode(this.bakeryFood);
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
        final Bakery other = (Bakery) obj;
        if (!Arrays.deepEquals(this.bakeryInfo, other.bakeryInfo)) {
            return false;
        }
        if (!Arrays.deepEquals(this.bakeryFood, other.bakeryFood)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bakery{" + "bakeryInfo=" + bakeryInfo + ", bakeryFood=" + bakeryFood + '}';
    }
    
    
    
}
