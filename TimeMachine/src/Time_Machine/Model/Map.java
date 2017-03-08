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
        
        Scene stable = new Scene("STABLE");
        Scene majorOffice = new Scene("MAJOR OFFICE");
        Scene fireOffice = new Scene("FIRE OFFICE");
        Scene policeOffice = new Scene("POLICE OFFICE");
        Scene liveroom = new Scene("LIVEROOM");
        Scene kitchen = new Scene("KITCHEN");
        Scene doctorOffice = new Scene("DOCTOR'S OFFICE");
        
        //
        liveroom.setPersonage(Personage.FATHER);
        //Start Locations
        Location barn = new Location();
        Location cityHall = new Location();
        Location policeDepartment = new Location();
        Location fatherHouse = new Location();
        Location bakery = new Location();
        Location fireStation = new Location();
        
        //Set Locations Name
        barn.setLocationName("BARN");
        cityHall.setLocationName("CITY HALL");
        policeDepartment.setLocationName("POLICE DEPARTMENT");
        fatherHouse.setLocationName("YOUR FATHER'S HOUSE");
        bakery.setLocationName("BAKERY");
        fireStation.setLocationName("FIRE STATION");
        // Set Locations Description
        barn.setLocationDescription("Old build full of livestock");
        cityHall.setLocationDescription("The administration building of the municipal government.");
        policeDepartment.setLocationDescription("A police force is a constituted body of persons\n empowered by the state to enforce the law, protect\n property, and limit civil disorder.");
        fatherHouse.setLocationDescription("Where your father lives! Remember he is a kid now!");
        bakery.setLocationDescription("Establishment that produces and sells flour-based food baked in an oven such as bread, cookies, cakes.");
        fireStation.setLocationDescription("Area set aside for storage of firefighting apparatus\n such as fire engines and related vehicles,\n personal protective equipment.");
        //Set Locations Visit status
        barn.setLocationVisited(false);
        cityHall.setLocationVisited(false);
        policeDepartment.setLocationVisited(false);
        fatherHouse.setLocationVisited(false);
        bakery.setLocationVisited(false);
        fireStation.setLocationVisited(false);
        
        
        //Set Scenes to Locations
        barn.setSceneLocation(stable);
        cityHall.setSceneLocation(majorOffice);
        policeDepartment.setSceneLocation(policeOffice);
        fatherHouse.setSceneLocation(liveroom);
        bakery.setSceneLocation(kitchen);
        fireStation.setSceneLocation(fireOffice);
        cityHall.setSceneLocation(doctorOffice);
                
        //add locations to the array
        this.setLocation(barn);
        this.setLocation(cityHall);
        this.setLocation(policeDepartment);
        this.setLocation(fatherHouse);
        this.setLocation(bakery);
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
    public Location getLocationByString(String place){
        for(int i=0;i<this.locations.size();i++){
            Location location = (Location) this.locations.get(i);
            if(location.getLocationName().contains(place)){
                return location;
            }
        }
            return null;
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


