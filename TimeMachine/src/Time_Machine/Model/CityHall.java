/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author rxfer_000
 */
public class CityHall extends Scene implements Serializable {
    private String[] informations;

    public CityHall() {
    }

    public String[] getInformations() {
        return informations;
    }

    public void setInformations(String[] informations) {
        this.informations = informations;
    }
    
    public String askForInformation (){
        return null;
    
    }
    public void getTheCityMap(){
    
    }
    
    public void makePhoneCall(){
    
    }
    @Override
    
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Arrays.deepHashCode(this.informations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CityHall other = (CityHall) obj;
        if (!Arrays.deepEquals(this.informations, other.informations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CityHall{" + "informations=" + informations + '}';
    }
    
}
