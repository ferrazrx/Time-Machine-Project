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
public class Location implements Serializable{

// Class instance variables
	private String locationName;
	private Boolean locationVisited;
	private String locationDescription;    

	public Location() {
	}    
    
	public String getLocationName() {
    	return locationName;
	}

	public void setLocationName(String locationName) {
    	this.locationName = locationName;
	}

	public Boolean getLocationVisited() {
    	return locationVisited;
	}

	public void setLocationVisited(Boolean locationVisited) {
    	this.locationVisited = locationVisited;
	}

	public String getLocationDescription() {
    	return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
    	this.locationDescription = locationDescription;
	}

	@Override
	public int hashCode() {
    	int hash = 7;
    	hash = 47 * hash + Objects.hashCode(this.locationName);
    	hash = 47 * hash + Objects.hashCode(this.locationVisited);
    	hash = 47 * hash + Objects.hashCode(this.locationDescription);
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
    	final Location other = (Location) obj;
    	if (!Objects.equals(this.locationName, other.locationName)) {
        	return false;
    	}
    	if (!Objects.equals(this.locationDescription, other.locationDescription)) {
        	return false;
    	}
    	return Objects.equals(this.locationVisited, other.locationVisited);
	}

	@Override
	public String toString() {
    	return "Location{" + "locationName=" + locationName + ", locationVisited=" + locationVisited + ", locationDescription=" + locationDescription + '}';
	}
}


