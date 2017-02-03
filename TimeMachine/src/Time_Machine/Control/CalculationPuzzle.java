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
public class CalculationPuzzle {
    private double sphereVolume;

    public double getSphereVolume() {
        return sphereVolume;
    }
    
    public void calculateShere(double radius){
    this.sphereVolume = (4/3)* Math.PI * Math.pow(radius,3);
    }
    
    
}
