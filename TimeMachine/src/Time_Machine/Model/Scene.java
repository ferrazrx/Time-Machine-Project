/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author  sinitcyna-elena
 */
public class Scene implements Serializable{
  // Class instance variables
	private String[] sceneListOfPersonages;
	private String sceneDescription;
	private String[] sceneItemsAvailable;

	public Scene() {
	}

	public String[] getSceneListOfPersonages() {
    	return sceneListOfPersonages;
	}

	public void setSceneListOfPersonages(String[] sceneListOfPersonages) {
    	this.sceneListOfPersonages = sceneListOfPersonages;
	}

	public String getSceneDescription() {
    	return sceneDescription;
	}

	public void setSceneDescription(String sceneDescription) {
    	this.sceneDescription = sceneDescription;
	}

	public String[] getSceneItemsAvailable() {
    	return sceneItemsAvailable;
	}

	public void setSceneItemsAvailable(String[] sceneItemsAvailable) {
    	this.sceneItemsAvailable = sceneItemsAvailable;
	}

	@Override
	public int hashCode() {
    	int hash = 3;
    	hash = 67 * hash + Arrays.deepHashCode(this.sceneListOfPersonages);
    	hash = 67 * hash + Objects.hashCode(this.sceneDescription);
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
    	final Scene other = (Scene) obj;
    	if (!Objects.equals(this.sceneDescription, other.sceneDescription)) {
        	return false;
    	}
    	if (!Arrays.deepEquals(this.sceneListOfPersonages, other.sceneListOfPersonages)) {
        	return false;
    	}
    	return Arrays.deepEquals(this.sceneItemsAvailable, other.sceneItemsAvailable);
	}

	@Override
	public String toString() {
    	return "Scene{" + "sceneListOfPersonages=" + Arrays.toString(sceneListOfPersonages) + ", sceneDescription=" + sceneDescription + ", sceneItemsAvailable=" + Arrays.toString(sceneItemsAvailable) + '}';
	}

	/**
 	*
 	*/
	public void setSceneListOfPersonages() {
    	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public void setSceneItemsAvailable() {
    	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	 
}


