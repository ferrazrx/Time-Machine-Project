/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Group 7
 */
public class Map implements Serializable{
    
// Class instance variables
	private ArrayList locations;
        private Location playerPlaceInMap;
        
	public Map() {
	this.locations = new ArrayList();
        }

    public ArrayList getLocations() {
        return locations;
    }

    public void setLocation(Location location) {
        this.locations.add(location);
    }

    public Location getPlayerPlaceInMap() {
        return playerPlaceInMap;
    }

    public void setPlayerPlaceInMap(Location playerPlaceInMap) {
        this.playerPlaceInMap = playerPlaceInMap;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.locations);
        hash = 41 * hash + Objects.hashCode(this.playerPlaceInMap);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.playerPlaceInMap, other.playerPlaceInMap)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", playerPlaceInMap=" + playerPlaceInMap + '}';
    }
        
        

	
}


