/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

/**
 *
 * @author sinitcyna-elena
 */
public class MapControl {

    // Volume Of Tetrahedron
    private static double volume;
    
    public double calcVolumeOfTetrahedron (double sideLength) {
        if(sideLength < 0) {
        System.out.println("Length is negative");
        return -1;
        }
        else {
        MapControl.volume = Math.round(Math.pow(sideLength, 3) / (6 * Math.sqrt(2)));
        System.out.println("Here is the volume of tetrahedron: " + MapControl.volume);
        return MapControl.volume;
        }

    }

    
}
