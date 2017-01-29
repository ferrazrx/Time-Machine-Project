/*
 * BYU - Idaho - CIT 260 - Winter 2017
 */
package Time_Machine.Control;

//import classes
import Time_Machine.Model.Map;
import Time_Machine.Model.Location;
import Time_Machine.Model.Scene;
import Time_Machine.Model.PlayersFather;
import Time_Machine.Model.PlayersMother;
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
         
        
    // Creating an instance of the classes Map, Location, Scene, PlayersFather, PlayersMother
    // sinitcyna-elena
    Map mapOne = new Map();
    Location locationOne = new Location();
    Scene sceneOne = new Scene();
    PlayersFather personPlayersFather = new PlayersFather();
    PlayersMother personPlayersMother = new PlayersMother();
    
    
    // Assigning values to each of the instance variables using the “setter” methods
    // sinitcyna-elena
    mapOne.setPlayerPlaceInMap("Bozeman");
    
    locationOne.setLocationName ("Some Location");
    locationOne.setLocationVisited(true);
    locationOne.setLocationDescription("Some description"); // array
    
    sceneOne.setSceneListOfPersonages("List of Personages"); //array
    sceneOne.setSceneDescription("Some description of scene");
    sceneOne.setSceneItemsAvailable("Items available"); //array
    
    personPlayersFather.setPlayersFatherMessage("Some father's message"); // array
    
    personPlayersMother.setPlayersMotherMessage("Some mother's message"); // array
    
    // Call the toString() function and display the contents to the console
    // sinitcyna-elena   
    System.out.println(mapOne.toString());
    System.out.println(locationOne.toString());
    System.out.println(sceneOne.toString());
    System.out.println(personPlayersFather.toString());
    System.out.println(personPlayersMother.toString());
    
    }

}
