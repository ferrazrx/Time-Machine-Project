/*
 * BYU - Idaho - CIT 260 - Winter 2017
 */
package Time_Machine.Control;
// test
//import classes
import Time_Machine.Model.Location;
import Time_Machine.Model.Map;
import Time_Machine.Model.Scene;
import Time_Machine.View.GameMenu;
import Time_Machine.View.Title;
import java.util.Scanner;

/**
 * @author Group 7
 */
public class Main {

    public static void main(String[] args) {
        // Insert the title of the Game on the console
        Title.titleGame();
        GameMenu.displayTitleDetail();

        //Display the game Main Menu
        GameMenu.displayGameMenu();
        
        //Declare option variable
        String option;
        boolean goOn = true;
        do {
        // Get option
            option = GetInput.getString();
        // Start the switch case to evaluate the option
        /*   N - Start the a New Game
             G - Saved Games
             S - Save Current Game
             H - Get Help on How to Play the Game
             E - Exit */
            switch (option) {
                // Start a New Game
                case "N":
                case "n":
                    break;
                // Restore a Saved Game
                case "G":
                case "g":
                    break;
                // Save current Game
                case "S":
                case "s":
                    break;
                // Open the help Menu
                case "H":
                case "h":
                    break;
                // Exit the game
                case "E":
                case "e": 
                    goOn = false;
                    break;
                default:
                    System.out.println("Please, select a valid option");
                    break;
            }

        }while(goOn);
        

        // Creatng an instance of the class Map
    	Map mapOne = new Map();
   	 
    	// test of the class Map(must be deleted)
    	// call setter function
    	mapOne.setPlayerPlaceInMap("Bozeman");
    	// display content of mapOne
    	System.out.println(mapOne.toString());
   	 
   	 
   	 
    	// Creatng an instance of the class Location
    	Location locationOne = new Location();

   	 
    	// Creatng an instance of the class Scene
    	Scene sceneOne = new Scene();

        
    }

}
