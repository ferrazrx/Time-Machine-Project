/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Time_Machine.Model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class Inventory implements Serializable{
    
    private ArrayList items;
    private int AmountItems;

    public Inventory() {
        this.items = new ArrayList();
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItem(Item newItem) {
        items.add(newItem);
    }

    public void setItemById(int index, Item newItem) {
        items.add(index, newItem);
    }
    
    public int getAmountItems() {
        return items.size();
    }
    public Item getItemByIndex(int index){
        return (Item) items.get(index);
    }
    public String getItemName (int index){
           Item item = (Item) items.get(index);
           return item.getName();
    }
    public boolean constainItem(Item verifyItem){
        return items.contains(verifyItem);
    }
    public void removeItem(int itemToRemove){
        items.remove(itemToRemove);
    }
  
}
