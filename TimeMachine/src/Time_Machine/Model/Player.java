/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author rxfer_000
 */
public class Player extends Person implements Serializable {
    private String name;
    private int statusBar;
    private Date currentTime;
    private Location currentLocation;
    private int currentYear;
    private Inventory inventory;
    private Location location;
    private TimeMachine timeMachine;

    public Player() {
        this.inventory = new Inventory();
        this.location = new Location();
        this.timeMachine = new TimeMachine();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public TimeMachine getTimeMachine() {
        return timeMachine;
    }

    public void setTimeMachine(TimeMachine timeMachine) {
        this.timeMachine = timeMachine;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(int statusBar) {
        this.statusBar = statusBar;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.statusBar;
        hash = 29 * hash + Objects.hashCode(this.currentTime);
        hash = 29 * hash + Objects.hashCode(this.currentLocation);
        hash = 29 * hash + this.currentYear;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.statusBar != other.statusBar) {
            return false;
        }
        if (!Objects.equals(this.currentTime, other.currentTime)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (this.currentYear != other.currentYear) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", statusBar=" + statusBar + ", currentTime=" + currentTime + ", currentLocation=" + currentLocation + ", currentYear=" + currentYear + '}';
    }

    
}
