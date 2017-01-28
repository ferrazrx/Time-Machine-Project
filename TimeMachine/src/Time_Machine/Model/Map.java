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
 * @author sinitcyna-elena
 */
public class Map implements Serializable{
    
// Class instance variables
	private String playerPlaceInMap;

	public Map() {
	}

	public String getPlayerPlaceInMap() {
    	return playerPlaceInMap;
	}

	public void setPlayerPlaceInMap(String playerPlaceInMap) {
    	this.playerPlaceInMap = playerPlaceInMap;
	}

	@Override
	public int hashCode() {
    	int hash = 3;
    	hash = 53 * hash + Objects.hashCode(this.playerPlaceInMap);
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
    	return Objects.equals(this.playerPlaceInMap, other.playerPlaceInMap);
	}

	@Override
	public String toString() {
    	return "Map{" + "playerPlaceInMap=" + playerPlaceInMap + '}';
	}
}


