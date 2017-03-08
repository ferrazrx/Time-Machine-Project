/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

/*import org.junit.After;*/
import Time_Machine.Model.Location;
import Time_Machine.Model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sinitcyna-elena
 */
public class MapControlTest {
    
    public MapControlTest() {
    }
  
   
  
    @Test
    public void testCalcVolumeOfTetrahedron() {
     
        
    }

    /**
     * Test of playerPlaceInMap method, of class MapControl.
     */
    @Test
    public void testPlayerPlaceInMap() {
        System.out.println("playerPlaceInMap");
        Player player = new Player();
        Location location = new Location();
        location.setLocationName("Test");
        player.setCurrentLocation(location);
        Location currentLocation = MapControl.playerPlaceInMap(player);
        assertEquals(currentLocation, location);
    }

    /**
     * Test of listLocations method, of class MapControl.
     */
    @Test
    public void testListLocations() {
        System.out.println("listLocations");
        Player player = null;
        MapControl.listLocations(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of movePlayerLocation method, of class MapControl.
     */
    @Test
    public void testMovePlayerLocation() {
        System.out.println("movePlayerLocation");
        Player player = null;
        String place = "";
        MapControl.movePlayerLocation(player, place);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     
}
