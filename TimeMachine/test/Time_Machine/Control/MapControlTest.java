/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

/*import org.junit.After;*/
import Time_Machine.Model.Game;
import Time_Machine.Model.Location;
import Time_Machine.Model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group 7
 */
public class MapControlTest {
    
    
    public void testPlayerPlaceInMap() {
        System.out.println("playerPlaceInMap");
        Game game = new Game();
        Location location = new Location("name",false,"description");
        game.setCurrentLocation(location);
        Location currentLocation = MapControl.playerPlaceInMap(game);
        assertEquals(currentLocation, location);
    }

    /**
     * Test of listLocations method, of class MapControl.
     */
    @Test
    public void testListLocations() {
        System.out.println("listLocations");
        Game game = new Game();
        MapControl.listLocations(game);
        Location location = new Location("name",false,"description");
        game.setCurrentLocation(location);
    }

    /**
     * Test of movePlayerLocation method, of class MapControl.
     */
    @Test
    public void testMovePlayerLocation() {
        System.out.println("movePlayerLocation");
        Game game = new Game();
        String place = "PARENT";
        MapControl.movePlayerLocation(game, place);
    }
     
}
