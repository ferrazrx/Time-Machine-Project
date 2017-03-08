/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.Main;
import Time_Machine.Control.PeopleTownControl;
import Time_Machine.Control.SceneControl;

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
    }

    private void talkPerson() {
        SceneControl.getScenesAndPersonages(Main.getPlayer());
        System.out.println("Enter the person option: (e.g. 0,1,2...)");
        String personageIndex = this.getInputValue();
        boolean verification = PeopleTownControl.printPersonageMessage(personageIndex);
        if(verification == true){
            System.out.println("\n\tWhat do you want to say? Enter the index option: ");
            String message = this.getInputValue();
            int messageInt = Integer.parseInt(message) ;
                PeopleTownControl.getAnswer(personageIndex, messageInt);
        }    
    }
    
}
