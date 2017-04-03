/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Group 7
 */
public class Item extends Inventory implements Serializable {
    
    private String name;
    private String Description;
    private int amount;
    private int requiredAmount;

    public Item(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String newName= name.substring(0, 1).toUpperCase() + name.substring(1);
        this.name = newName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int Amount) {
        this.amount = Amount;
    }
    public void AddAmount(){
        this.amount+=1;
    }
    public void lessAmount(){
        this.amount-=1;
    }
    
    public void useItem(){
    
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.Description);
        hash = 97 * hash + this.amount;
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
        final Item other = (Item) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "Name=" + name + ", Description=" + Description + ", Amount=" + amount + '}';
    }
    
    
}
