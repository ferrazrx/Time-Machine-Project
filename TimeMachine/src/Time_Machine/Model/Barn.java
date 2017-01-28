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
 * @author Skyler
 */
public class Barn extends Scene implements Serializable{
    
    private String barnInfo;

    public Barn() {
    }

    
    public String getBarnInfo() {
        return barnInfo;
    }

    public void setBarnInfo(String barnInfo) {
        this.barnInfo = barnInfo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.barnInfo);
        return hash;
    }

    @Override
    public String toString() {
        return "Barn{" + "barnInfo=" + barnInfo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barn other = (Barn) obj;
        if (!Objects.equals(this.barnInfo, other.barnInfo)) {
            return false;
        }
        return true;
    }
    
    
}
