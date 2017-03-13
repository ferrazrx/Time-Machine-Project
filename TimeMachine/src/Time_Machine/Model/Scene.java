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
public class Scene implements Serializable{
  // Class instance variables
        private String sceneName;
	private ArrayList<Personage> personages;
	private String sceneDescription;
	private ArrayList<item> itemsAvailable;

    public Scene(String name) {
        this.personages = new ArrayList();
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
        return personages;
    }

    public void setPersonage(Personage personage) {
        this.personages.add(personage);
    }

    public void setPersonages(ArrayList personages) {
        this.personages = personages;
    }

    public void setItemsAvailable(ArrayList itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
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
}