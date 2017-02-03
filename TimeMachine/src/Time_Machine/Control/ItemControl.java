/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

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
    
    public static double CalculatePowerDissipationInResistor(int voltage, int resistor){
        System.out.println("You have calculate the power dissipation in your resistor.");
        if (voltage>220 || voltage<0){
            System.out.println("You eletrical network just provide the maximum of 220V and the minimum of 0V.");
            return -1;
        } else if(resistor>200 || resistor<1){
            System.out.println("Your larger resistor is 200 ohm and it can't be less than 1 ohm");
            return -1;
        } else {
            ItemControl.powerDissipation = (Math.pow(voltage,2))/(resistor);
            //Power Dissipation must be between 100w and 200w
            if(ItemControl.powerDissipation<100){
                System.out.println("Your power dissipation is: "+ItemControl.powerDissipation+"w. It must be higher than 100w.");   
                return -1;
            } else 
            if(ItemControl.powerDissipation>200){
                System.out.println("Your power dissipation is:"+ItemControl.powerDissipation+"w. It must be less than 200w.");
                return -1;
            }else {
                System.out.println("Congratulations! Your power dissipation is:"+ ItemControl.powerDissipation+". Now you can turn on the time machine.");
                return ItemControl.powerDissipation;
            }
        }
    
    }
    // Calculate the Air Core Wire Coil distance.
    private static double airCoreWireCoilDistance;
    public static double calculateAirCoreWireCoilDistance(double acceleration, double time){
        if(acceleration<0){
            System.out.println("You must increase the acceleration, not decrease!");
            return -1;
        } else 
        if(acceleration>100){
            System.out.println("You can break the machine with an acceleration greater than 100m/s^2.");
            return -1;
        }else 
        if(time<0){
            System.out.println("Do you want to travel ahead or go back in time? Please, enter a positive time!");
            return -1;
        } else {
            ItemControl.airCoreWireCoilDistance = (acceleration/2)*(Math.pow(time,2));
            if(ItemControl.airCoreWireCoilDistance<5000){
                System.out.println("The distance is not enough! You just circulate the Air Core Wire "+ ItemControl.airCoreWireCoilDistance +"m."
                        + "\n You must reach 5.000m or more."); 
            return -1;    
            } else {
                System.out.println("Yeah! You got it! Now you have a Air Core Wire Coil with "+ItemControl.airCoreWireCoilDistance+"m.");
                return ItemControl.airCoreWireCoilDistance;
            }
        }
        
    
    }
    
}