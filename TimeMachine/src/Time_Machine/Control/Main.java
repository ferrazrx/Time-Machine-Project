/*
 * BYU - Idaho - CIT 260 - Winter 2017
 */
package Time_Machine.Control;

//import classes
import Time_Machine.Model.Baker;
import Time_Machine.Model.Bakery;
import Time_Machine.Model.BozemanMajor;
import Time_Machine.Model.Map;
import Time_Machine.Model.Location;
import Time_Machine.Model.PhysicianOfBozeman;
import Time_Machine.Model.PlayerParentsHouse;
import Time_Machine.Model.Scene;
import Time_Machine.Model.PlayersFather;
import Time_Machine.Model.PlayersMother;
import Time_Machine.Model.Plumber;
import Time_Machine.Model.TimeMachine;
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
        
        
        //sinitcyna-elena
        //Test must be deleted after Individual assignment L04
        //Test of classes references (Map, Location, Scene, PlayersFather, PlayersMother)
        int test = 0;
        
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
 
                    
//sinitcyna-elena
//Test must be deleted after Individual assignment L04
//Test of classes references (Map, Location, Scene, PlayersFather, PlayersMother)                    
case "A":
case "a":
test = 1;
goOn = false;
break;


/*
*Synitsyn-Dmitriy Test for classes: TimeMachine, Bakery, PlayerParentsHouse, 
*                                   PhysicianOfBozeman, Baker, Plumber, 
*                                   BozemanMajor
*/
case "B":
case "b":
test = 2;
goOn = false;
break;


                default:
                    System.out.println("Please, select a valid option");
                    break;
            }

        }while(goOn);
         
       
           
//sinitcyna-elena
//Test must be deleted after Individual assignment L04
//Test of classes references (Map, Location, Scene, PlayersFather, PlayersMother)     
       if(test == 1) {  
       System.out.println();
       System.out.println("Elena Sinitcyna Individual Assignment (Lesson 4):");  
       System.out.println();
       
       
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
    
    locationOne.setLocationName ("Bakery");
    locationOne.setLocationVisited(true);
    locationOne.setLocationDescription("Some description");
    
    sceneOne.setSceneListOfPersonages("John"); //array or string?
    sceneOne.setSceneDescription("Some description of scene");
    sceneOne.setSceneItemsAvailable("Items available"); //array or string?
    
    personPlayersFather.setPlayersFatherMessage("Some father's message"); //array or string?
    
    personPlayersMother.setPlayersMotherMessage("Some mother's message"); //array or string?
    
    // Call the toString() function and display the contents to the console
    // sinitcyna-elena   
    System.out.println(mapOne.toString());
    System.out.println(locationOne.toString());
    System.out.println(sceneOne.toString());
    System.out.println(personPlayersFather.toString());
    System.out.println(personPlayersMother.toString());
    }
       
       
       /*
       *Sinitsyn-Dmitriy
       *Instances, using the “setter” methods and toString()
       *Classes: TimeMachine, Bakery, PlayerParentsHouse, PhysicianOfBozeman,
       *          Baker, Plumber, BozemanMajor
       */
       
       if(test == 2){
       
           //TimeMachine class
          TimeMachine timeMachineNew = new TimeMachine();           
          timeMachineNew.setStatusTimeMachine("Broken"); 
          timeMachineNew.setDescriptionTimeMachine("Find Pliers");
          timeMachineNew.setPartsListTimeMachine("Time Machine's part list is comming soon...");            
          String timeMachineInfo = timeMachineNew.toString();                 
          System.out.println(timeMachineInfo);
          
          //Bakery class
          Bakery bakeryNew = new Bakery();
          bakeryNew.setBakeryInfo("In the Bakery you can get some usefull information");
          bakeryNew.setBakeryFood("You can get some food here");
          String bakeryInfo = bakeryNew.toString();                 
          System.out.println(bakeryInfo);
          
          //PlayerParentsHouse class
          PlayerParentsHouse playerParentsHouseNew = new PlayerParentsHouse();
          playerParentsHouseNew.setPlayerParentsHouseInfo("In the Parents House you can get some usefull information");
          String playerParentsHouseInfo = playerParentsHouseNew.toString();                 
          System.out.println(playerParentsHouseInfo);
          
          //PhysicianOfBozeman class
          PhysicianOfBozeman physicianOfBozemanNew = new PhysicianOfBozeman();
          physicianOfBozemanNew.setPhysicianOfBozeman("Physician of Bozeman has importsnt message for you");
          String physicianOfBozemanInfo = physicianOfBozemanNew.toString();                 
          System.out.println(physicianOfBozemanInfo);
          
          //Baker class
          Baker bakerNew = new Baker();
          bakerNew.setBaker("Baker has importsnt message for you");
          String bakerInfo = bakerNew.toString();                 
          System.out.println(bakerInfo);
          
          //Plumber class
          Plumber plumberNew = new Plumber();
          plumberNew.setPlumber("Plumber has importsnt message for you");
          String plumberInfo = plumberNew.toString();                 
          System.out.println(plumberInfo);
          
          //BozemanMajor class 
          BozemanMajor bozemanMajorNew = new BozemanMajor();
          bozemanMajorNew.setBozemanMajor("Plumber has importsnt message for you");
          String bozemanMajorInfo = bozemanMajorNew.toString();                 
          System.out.println(bozemanMajorInfo);        
          
       }
    }

}
