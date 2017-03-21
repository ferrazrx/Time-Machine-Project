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
                ErrorView.display(this.getClass().getName(), "*** Invalid selection *** Try Again!");
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
        this.console.println("Enter the person's name that you want to talk:");
        String personage = this.getInput();
        try{
            int messageInt = 0;
            PersonageControl.printPersonageMessage(Main.getCurrentGame(), personage);
            this.console.println("\n\tWhat do you want to say? Enter the index option: ");
            String message = this.getInput();
            try{
                messageInt = Integer.parseInt(message);
                PersonageControl.getPersonageAnswer(Main.getCurrentGame(),personage, messageInt);
            }
            catch(NumberFormatException n){
                ErrorView.display(this.getClass().getName(),n.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                ErrorView.display(this.getClass().getName(),"Speech invalid!");
                ErrorView.display(this.getClass().getName(),e.getMessage());
            }
            catch(PersonageControlException e){
                ErrorView.display(this.getClass().getName(),"Speech invalid!");
                ErrorView.display(this.getClass().getName(),e.getMessage());
            }
        }
        catch(PersonageControlException message){
            ErrorView.display(this.getClass().getName(),message.getMessage());
        };   
    }
    
}
