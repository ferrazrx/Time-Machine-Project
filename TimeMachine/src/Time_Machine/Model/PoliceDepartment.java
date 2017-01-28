/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.util.Arrays;

/**
 *
 * @author rxfer_000
 */
public class PoliceDepartment extends Scene {
    private String[] informations;
    private String[] reportedIncidents;

    public PoliceDepartment() {
    }

    public String[] getInformations() {
        return informations;
    }

    public void setInformations(String[] informations) {
        this.informations = informations;
    }

    public String[] getReportedIncidents() {
        return reportedIncidents;
    }

    public void setReportedIncidents(String[] reportedIncidents) {
        this.reportedIncidents = reportedIncidents;
    }
    
    public String askForHelp (String helpDescription){
        return null;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.informations);
        hash = 97 * hash + Arrays.deepHashCode(this.reportedIncidents);
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
        final PoliceDepartment other = (PoliceDepartment) obj;
        if (!Arrays.deepEquals(this.informations, other.informations)) {
            return false;
        }
        if (!Arrays.deepEquals(this.reportedIncidents, other.reportedIncidents)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PoliceDepartment{" + "informations=" + informations + ", reportedIncidents=" + reportedIncidents + '}';
    }
    
}
