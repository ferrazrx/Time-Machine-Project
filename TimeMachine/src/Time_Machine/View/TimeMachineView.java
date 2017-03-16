/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.Main;
import Time_Machine.Control.TimeMachineControl;
import Time_Machine.exceptions.TimeMachineControlException;

/**
 *
 * @author Group 7
 */
public class TimeMachineView extends View {
    
    public TimeMachineView(){
    super( 
            "\n-------------------------------------------"+
            "\n|              Time Machine Menu          |"+    
            "\n-------------------------------------------\n"+    
            "F - Try to fix the Time Machine\n"
          + "I - Try to combine items with the Time Machine\n"
          + "R - Try to turn the Time Machine on\n"
          + "B - Back to Game Manu\n"
          + "-------------------------------------------\n");
    }
    
    @Override
    public boolean action (String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "F":
                this.fixTimeMachine();
                break;
            case "I":
                this.combineItem();
                break;
            case "R":turnOn();
                break;
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    }

    private void fixTimeMachine() {
        TimeMachineControl.returnTimeMachineItems(Main.getCurrentGame());
        TimeMachineControl.tryToFixTimeMachine(Main.getCurrentGame());
    }

    private void combineItem() {
        InventoryControl.listInventoryItems(Main.getCurrentGame());
        System.out.println("Enter the item's name you want to combine with the time machine:");
        String item = this.getInputValue();
        try{
            TimeMachineControl.addPart(Main.getCurrentGame(), item);
        }
        catch(TimeMachineControlException ex){
            System.out.println(ex.getMessage());
        }
    }

    private void turnOn() {
       TimeMachineControl.tryToFixTimeMachine(Main.getCurrentGame());
    }


}

