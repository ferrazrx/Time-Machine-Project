/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.Main;
import Time_Machine.Control.PeopleTownControl;
import Time_Machine.Control.SceneControl;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class PeopleTownView extends View {

    public PeopleTownView() {
        super("\n-------------------------------------------"+
              "\n|              People in Town             |"+    
              "\n-------------------------------------------\n"+    
              "P - See people in this location\n" +
              "T - Talk\n" +
              "B - Back to Game Menu\n" + 
              "-------------------------------------------\n");
    }
    
    @Override
    public boolean action(String option) {
        option = option.toUpperCase();
        switch (option){
            case "P":
                this.peopleLocation();
                break;
            case "T":
                this.talkPerson();
                break;
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    }

    private void peopleLocation() {
        SceneControl.getScenesAndPersonages(Main.getPlayer());
        this.pause();
        return;
    }

    private void talkPerson() {
        System.out.println("Enter the person option: (e.g. 0,1,2...)");
        int option = this.getInputInt();
        ArrayList messages = PeopleTownControl.getPersonageMessages(option);
        PeopleTownControl.printPersonageMessage(messages);
        this.pause();
        
    }
    
}
