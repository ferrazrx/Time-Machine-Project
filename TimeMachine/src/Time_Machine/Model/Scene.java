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
 * @author  Group 7
 */
public class Scene implements Serializable{
  // Class instance variables
        private String sceneName;
	private ArrayList Personages;
	private String sceneDescription;
	private ArrayList itemsAvailable;

    public Scene(String name) {
        this.Personages = new ArrayList();
        this.itemsAvailable = new ArrayList();
        this.sceneName = name;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public ArrayList getPersonages() {
        return Personages;
    }

    public void setPersonage(Personage personage) {
        this.Personages.add(personage);
    }

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String sceneDescription) {
        this.sceneDescription = sceneDescription;
    }

    public ArrayList getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(Item ItemsAvailable) {
        this.itemsAvailable.add(ItemsAvailable);
    }
  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.sceneName);
        hash = 79 * hash + Objects.hashCode(this.Personages);
        hash = 79 * hash + Objects.hashCode(this.sceneDescription);
        hash = 79 * hash + Objects.hashCode(this.itemsAvailable);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneName=" + sceneName + ", Personages=" + Personages + ", sceneDescription=" + sceneDescription + ", ItemsAvailable=" + itemsAvailable + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.sceneName, other.sceneName)) {
            return false;
        }
        if (!Objects.equals(this.Personages, other.Personages)) {
            return false;
        }
        if (!Objects.equals(this.sceneDescription, other.sceneDescription)) {
            return false;
        }
        if (!Objects.equals(this.itemsAvailable, other.itemsAvailable)) {
            return false;
        }
        return true;
    }
    
}