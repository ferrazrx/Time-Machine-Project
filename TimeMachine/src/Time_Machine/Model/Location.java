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
 * @author  sinitcyna-elena
 */
public class Location implements Serializable{

// Class instance variables
	private Scene scene;
	private Boolean locationVisited;
	private String locationDescription;    

	public Location() {
	}    

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
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
        hash = 59 * hash + Objects.hashCode(this.scene);
        hash = 59 * hash + Objects.hashCode(this.locationVisited);
        hash = 59 * hash + Objects.hashCode(this.locationDescription);
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
        if (!Objects.equals(this.locationDescription, other.locationDescription)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.locationVisited, other.locationVisited)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + ", locationVisited=" + locationVisited + ", locationDescription=" + locationDescription + '}';
    }
        
	
}


