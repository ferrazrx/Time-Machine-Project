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
 * @author  Group 7
 */
public class Location implements Serializable{

// Class instance variables
        private String locationName;
	private ArrayList sceneLocation;
	private Boolean locationVisited;
	private String locationDescription;    

	public Location() {
            this.sceneLocation = new ArrayList();
	}    

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public ArrayList getSceneLocation() {
        return sceneLocation;
    }

    public void setSceneLocation(Scene sceneLocation) {
        this.sceneLocation.add(sceneLocation);
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

    
    
        
	
}


