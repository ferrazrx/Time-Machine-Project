/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.exceptions.ItemControlException;

/**
 *
 * Group 7
 */
public class ItemControl {
    //Flux Capacitor Control
    private static double powerDissipation;

    public static double getPowerDissipation() {
        return powerDissipation;
    }
    
    public static double CalculatePowerDissipationInCapacitor(int voltage, int resistor) throws ItemControlException{
        if (voltage>220 || voltage<0){
            throw new ItemControlException("You eletrical network just provide the maximum of 220V and the minimum of 0V.");
        } else if(resistor>200 || resistor<1){
            throw new ItemControlException("Your larger resistor is 200 ohm and it can't be less than 1 ohm");
        } else {
            ItemControl.powerDissipation = (Math.pow(voltage,2))/(resistor);
            //Power Dissipation must be between 100w and 200w
            if(ItemControl.powerDissipation<100){
                throw new ItemControlException("Your power dissipation is: "+ItemControl.powerDissipation+"w. It must be higher than 100w.");   
            } else 
            if(ItemControl.powerDissipation>200){
                throw new ItemControlException("Your power dissipation is:"+ItemControl.powerDissipation+"w. It must be less than 200w.");
            }else {
                System.out.println("Congratulations! Your power dissipation is:"+ ItemControl.powerDissipation+".");
                return ItemControl.powerDissipation;
            }
        }
    
    }
    // Calculate the Air Core Wire Coil distance.
    private static double airCoreWireCoilDistance;
    public static double calculateAirCoreWireCoilDistance(double acceleration, double time) throws ItemControlException{
        if(acceleration<0){
            throw new ItemControlException("You must increase the acceleration, not decrease!");
        } else 
        if(acceleration>100){
            throw new ItemControlException("You can break the machine with an acceleration greater than 100m/s^2.");
        }else 
        if(time<0){
            throw new ItemControlException("Do you want to travel ahead or go back in time? Please, enter a positive time!");
        } else {
            ItemControl.airCoreWireCoilDistance = (acceleration/2)*(Math.pow(time,2));
            if(ItemControl.airCoreWireCoilDistance<5000){
                throw new ItemControlException("The distance is not enough! You just circulate the Air Core Wire "+ ItemControl.airCoreWireCoilDistance +"m."
                        + "\n You must reach 5.000m or more."); 
            } else {
                System.out.println("Yeah! You got it! Now you have a Air Core Wire Coil with "+ItemControl.airCoreWireCoilDistance+"m.");
                return ItemControl.airCoreWireCoilDistance;
            }
        }
        
    
    }
    
}