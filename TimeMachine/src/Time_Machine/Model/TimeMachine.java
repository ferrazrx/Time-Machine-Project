/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Group 7
 */
public class TimeMachine implements Serializable {
    private String statusTimeMachine;
    private String descriptionTimeMachine;
    private ArrayList partsListTimeMachine;

    public TimeMachine() {
        this.partsListTimeMachine = new ArrayList();
        this.statusTimeMachine = "Broken";
    }

    public String getStatusTimeMachine() {
        return statusTimeMachine;
    }

    public void setStatusTimeMachine(String statusTimeMachine) {
        this.statusTimeMachine = statusTimeMachine;
    }

    public String getDescriptionTimeMachine() {
        return descriptionTimeMachine;
    }

    public void setDescriptionTimeMachine(String descriptionTimeMachine) {
        this.descriptionTimeMachine = descriptionTimeMachine;
    }

    public ArrayList getPartsListTimeMachine() {
        return partsListTimeMachine;
    }

    public void AddPartsListTimeMachine(Item timeMachineItem) {
        this.partsListTimeMachine.add(timeMachineItem);
    }
    
 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.statusTimeMachine);
        hash = 11 * hash + Objects.hashCode(this.descriptionTimeMachine);
        hash = 11 * hash + Objects.hashCode(this.partsListTimeMachine);
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
        if (!Objects.equals(this.statusTimeMachine, other.statusTimeMachine)) {
            return false;
        }
        if (!Objects.equals(this.descriptionTimeMachine, other.descriptionTimeMachine)) {
            return false;
        }
        if (!Objects.equals(this.partsListTimeMachine, other.partsListTimeMachine)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TimeMachine{" + "statusTimeMachine=" + statusTimeMachine + ", descriptionTimeMachine=" + descriptionTimeMachine + ", partsListTimeMachine=" + partsListTimeMachine + '}';
    }
    
}