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
    
}