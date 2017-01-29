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
 * @author sinitsyndmitriy
 */
public class PlayerParentsHouse extends Scene implements Serializable{
    private String[] playerParentsHouseInfo;

    public PlayerParentsHouse() {
    }

    public String[] getPlayerParentsHouseInfo() {
        return playerParentsHouseInfo;
    }

    public void setPlayerParentsHouseInfo(String[] playerParentsHouseInfo) {
        this.playerParentsHouseInfo = playerParentsHouseInfo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Arrays.deepHashCode(this.playerParentsHouseInfo);
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
        final PlayerParentsHouse other = (PlayerParentsHouse) obj;
        if (!Arrays.deepEquals(this.playerParentsHouseInfo, other.playerParentsHouseInfo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlayerParentsHouse{" + "playerParentsHouseInfo=" + playerParentsHouseInfo + '}';
    }
    
    
    
}
