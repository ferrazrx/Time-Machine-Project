/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.util.Arrays;

/**
 *
 * @author sinitsyndmitriy
 */
public class TimeMachine {
    private String[] statusTimeMachine;
    private String[] descriptionTimeMachine;
    private String[] partsListTimeMachine;

    public TimeMachine() {
    }

    public String[] getStatusTimeMachine() {
        return statusTimeMachine;
    }

    public void setStatusTimeMachine(String[] statusTimeMachine) {
        this.statusTimeMachine = statusTimeMachine;
    }

    public String[] getDescriptionTimeMachine() {
        return descriptionTimeMachine;
    }

    public void setDescriptionTimeMachine(String[] descriptionTimeMachine) {
        this.descriptionTimeMachine = descriptionTimeMachine;
    }

    public String[] getPartsListTimeMachine() {
        return partsListTimeMachine;
    }

    public void setPartsListTimeMachine(String[] partsListTimeMachine) {
        this.partsListTimeMachine = partsListTimeMachine;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Arrays.deepHashCode(this.statusTimeMachine);
        hash = 41 * hash + Arrays.deepHashCode(this.descriptionTimeMachine);
        hash = 41 * hash + Arrays.deepHashCode(this.partsListTimeMachine);
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
        final TimeMachine other = (TimeMachine) obj;
        if (!Arrays.deepEquals(this.statusTimeMachine, other.statusTimeMachine)) {
            return false;
        }
        if (!Arrays.deepEquals(this.descriptionTimeMachine, other.descriptionTimeMachine)) {
            return false;
        }
        if (!Arrays.deepEquals(this.partsListTimeMachine, other.partsListTimeMachine)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TimeMachine{" + "statusTimeMachine=" + statusTimeMachine + ", descriptionTimeMachine=" + descriptionTimeMachine + ", partsListTimeMachine=" + partsListTimeMachine + '}';
    }
    
    
    
    
}