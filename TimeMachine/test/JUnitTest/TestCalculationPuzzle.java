/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Time_Machine.Control.CalculationPuzzle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rxfer_000
 */
public class TestCalculationPuzzle {
    @Test
    public void testCalculationPuzzle() {
    CalculationPuzzle sphere = new CalculationPuzzle();
    sphere.calculateShere(1.06078441);
    assertEquals(5,sphere.getSphereVolume());
    }
}
