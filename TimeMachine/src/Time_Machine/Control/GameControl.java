/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Inventory;
import Time_Machine.Model.Map;
import Time_Machine.Model.TimeMachine;

/**
 *
 * @author Group 7
 */
public class GameControl {
    private Map bozemanMap;
    private Inventory playerInventory;
    private TimeMachine playerTimeMachine;

    public GameControl() {
        this.bozemanMap = new Map();
        this.playerInventory = new Inventory();
        this.playerTimeMachine = new TimeMachine();
    }

    public Map getBozemanMap() {
        return bozemanMap;
    }

    public void setBozemanMap(Map bozemanMap) {
        this.bozemanMap = bozemanMap;
    }

    public Inventory getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(Inventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    public TimeMachine getPlayerTimeMachine() {
        return playerTimeMachine;
    }

    public void setPlayerTimeMachine(TimeMachine playerTimeMachine) {
        this.playerTimeMachine = playerTimeMachine;
    }
    
    
    
}
