/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.Main;
import Time_Machine.Control.PersonageControl;
import Time_Machine.Control.SceneControl;
import Time_Machine.exceptions.PersonageControlException;

/**
 *
 * @author Group 7
 */
public class PersonageView extends View {


    public PersonageView() {
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
        SceneControl.getScenesAndPersonages(Main.getCurrentGame());
        this.pause();
    }

    private void talkPerson() {
        SceneControl.getScenesAndPersonages(Main.getCurrentGame());
        System.out.println("Enter the person's name that you want to talk:");
        String personage = this.getInputValue();
        try{
            int messageInt = 0;
            PersonageControl.printPersonageMessage(Main.getCurrentGame(), personage);
            System.out.println("\n\tWhat do you want to say? Enter the index option: ");
            String message = this.getInputValue();
            try{
                messageInt = Integer.parseInt(message);
                PersonageControl.getPersonageAnswer(Main.getCurrentGame(),personage, messageInt);
            }
            catch(NumberFormatException n){
                System.out.println(n.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Speech invalid!");
                System.out.println(e.getMessage());
            }
            catch(PersonageControlException e){
                System.out.println("Speech invalid!");
                System.out.println(e.getMessage());
            }
        }
        catch(PersonageControlException message){
            System.out.println(message.getMessage());
        };   
    }
    
}
