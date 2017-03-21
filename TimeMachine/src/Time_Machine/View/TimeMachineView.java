/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.InventoryControl;
import Time_Machine.Control.ItemControl;
import Time_Machine.Control.Main;
import Time_Machine.Control.TimeMachineControl;
import Time_Machine.exceptions.ItemControlException;
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
            "D - See detail to fix the Time Machine\n"
          + "F - Try to fix the Time Machine\n"
          + "I - Try to combine items with the Time Machine\n"
          + "R - Try to turn the Time Machine on\n"
          + "B - Back to Game Manu\n"
          + "-------------------------------------------\n");
    }
    
    @Override
    public boolean action (String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "D":
                this.seeDetail();
                break;
            case "F":
                this.fixTimeMachine();
                break;
            case "I":
                this.combineItem();
                break;
            case "R":turnOn();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"*** Invalid selection *** Try Again!");
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
        this.console.println("Enter the item's name you want to combine with the time machine:");
        String item = this.getInput();
        if("Air Core Wire Coils".toUpperCase().contains(item.toUpperCase())){
            this.console.println("\n\t To install the air coil in your machine \n you have to calculate the distance of wire.");
            this.console.println("\n\t Enter a acceleration to roll your wire:");
            String acceleration = this.getInput();
            this.console.println("\n\t Enter a time to roll your wire:");
            String time = this.getInput();
            try{
                double acelerationDouble = Double.parseDouble(acceleration);
                double timeDouble = Double.parseDouble(time);   
                
                try{
                    ItemControl.calculateAirCoreWireCoilDistance(acelerationDouble, timeDouble);
                    try{
                        TimeMachineControl.addPart(Main.getCurrentGame(), item);
                    }
                    catch(TimeMachineControlException e){
                        ErrorView.display(this.getClass().getName(),e.getMessage());
                    }
                }
                catch(ItemControlException e){
                    ErrorView.display(this.getClass().getName(),e.getMessage());
                }
            }
            catch(NumberFormatException e){
                ErrorView.display(this.getClass().getName(),"Invalid number\n" + e.getMessage());
            }
        }else 
        if("Capacitor of 1500uf 25V".toUpperCase().contains(item.toUpperCase())){
            this.console.println("\n\t To install the capacitor in your machine \n you have to calculate its power dissipatio.");
            this.console.println("\n\t Enter a voltage to the capacitor:");
            String voltage = this.getInput();
            this.console.println("\n\t Enter a resistance of your resistor:");
            String resistance = this.getInput();
            try{
                int voltageDouble = Integer.parseInt(voltage);
                int resistanceDouble = Integer.parseInt(resistance);   
                
                try{
                    ItemControl.CalculatePowerDissipationInCapacitor(voltageDouble, resistanceDouble);
                    try{
                        TimeMachineControl.addPart(Main.getCurrentGame(), item);
                    }
                    catch(TimeMachineControlException e){
                        ErrorView.display(this.getClass().getName(),e.getMessage());
                    }
                }
                catch(ItemControlException e){
                    ErrorView.display(this.getClass().getName(),e.getMessage());
                }
            }
            catch(NumberFormatException e){
                ErrorView.display(this.getClass().getName(),"Invalid number\n"+ e.getMessage());
            } 
        }else{
            try{
                TimeMachineControl.addPart(Main.getCurrentGame(), item);
            }
            catch(TimeMachineControlException ex){
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
        }
    }

    private void turnOn() {
       TimeMachineControl.tryToFixTimeMachine(Main.getCurrentGame());
    }

    private void seeDetail() {
       GameDetailView.TimeMachineItemDetail();
    }


}

