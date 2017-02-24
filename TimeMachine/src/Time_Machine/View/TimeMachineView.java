/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;

/**
 *
 * @author RAFAEL.FERRAZ
 */
public class TimeMachineView {
        public String TimeMachineOptions(){
        System.out.println("Choose a Time Machine option:"
                + "\n\t F - Try to fix the Time Machine"
                + "\n\t I - Try to combine items with the Time Machine"
                + "\n\t R - Try to turn the Time Machine on"
                + "\n\t B - Back to Game Manu ");
        String option = GetInput.getString();
        return option;
    }
}

