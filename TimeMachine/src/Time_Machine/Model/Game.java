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
public class Game implements Serializable {

    private Inventory inventory;
    private Map map;
    private TimeMachine timeMachine;
    private Player player;
    private ArrayList<Personage> personages;
        
    
    public Game() {
    }
    
    public ArrayList getPersonages() {
        return personages;
    }

    public void setPersonages(ArrayList personages) {
        this.personages = personages;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public TimeMachine getTimeMachine() {
        return timeMachine;
    }

    public void setTimeMachine(TimeMachine timeMachine) {
        this.timeMachine = timeMachine;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
}
