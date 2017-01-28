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
 * @author Group 7
 */
public class Inventory implements Serializable {
    
    private String[] items;
    private int AmountItems;

    public Inventory() {
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int getAmountItems() {
        return AmountItems;
    }

    public void setAmountItems(int AmountItems) {
        this.AmountItems = AmountItems;
    }
    
    public void addItem (Item newItem){
      
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Arrays.deepHashCode(this.items);
        hash = 29 * hash + this.AmountItems;
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
        final Inventory other = (Inventory) obj;
        if (this.AmountItems != other.AmountItems) {
            return false;
        }
        if (!Arrays.deepEquals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "items=" + items + ", AmountItems=" + AmountItems + '}';
    }
    
    
    
    
    
}
