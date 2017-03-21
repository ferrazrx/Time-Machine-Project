/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.exceptions.PersonageControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Group 7
 */
public class PersonageControlTest {
    
    public PersonageControlTest() {
    }
    @Test
     // TEST 1
    public static void printPersonageMessage ()throws PersonageControlException{
        System.out.println("printPersonageMessage");
        Game game = new Game();
        String name = null;
         try {
             PersonageControl.printPersonageMessage(game, name);
        } catch (PersonageControlException ex) {
            Logger.getLogger(PersonageControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(name, game.getPersonages(),  0.0);
        // TEST 2
        System.out.println("printPersonageMessage");
        Game testgame = new Game();
        String testname = ("Father");
         try {
             PersonageControl.printPersonageMessage(testgame, testname);
        } catch (PersonageControlException ex) {
            Logger.getLogger(PersonageControlTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(testname, game.getPersonages(),  0.0);
    }
}
