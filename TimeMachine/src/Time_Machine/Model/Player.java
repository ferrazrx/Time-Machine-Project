/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Group 7
 */
public class Player implements Serializable {
    private String name;
    private int statusBar;
    private Date currentTime;
    private int currentYear;
    private Location currentLocation;

    public Player() {
     
    }

    public Player(String name, int statusBar, Date currentTime, int currentYear) {
        this.name = name;
        this.statusBar = statusBar;
        this.currentTime = currentTime;
        this.currentYear = currentYear;
    }

    public String getName() {
        return name;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setName(String name) {
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

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
}
