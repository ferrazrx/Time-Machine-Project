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
 * @author  sinitcyna-elena
 */
public class Location implements Serializable{

// Class instance variables
        private String locationName;
	private ArrayList scene;
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

    public ArrayList getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene.add(scene);
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


