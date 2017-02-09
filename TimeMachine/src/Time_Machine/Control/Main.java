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
 
                    

//Test the calculation capacitor in Flux Capacitor
                case "a":
                    System.out.println("\tCalculate the Power Dissipation of the resistor in the Flux Capacitor."
                            + "\n\t\t Equation => P = (U^2)/R ");
                    int voltage;
                    int resistor;
                    double continues;
                    do{
                        System.out.println("Enter voltage value:");
                        voltage = GetInput.getInt();
                        System.out.println("Enter resistor value:");
                        resistor = GetInput.getInt();
                        continues = ItemControl.CalculatePowerDissipationInResistor(voltage,resistor);
                    } 
                    while(continues==-1);
                    
                    break;
                    
       
        
//Test the calculation of the Air Core Wire Coil distance;
                case "b":
                    System.out.println("\tCalculate the Air Core Wire Coil distance."
                            + "\n\t\t Equation => D = (1/2) *acceleration* (time^2)  ");
                    int acceleration;
                    int time;
                    do{
                        System.out.println("Enter the acceleration:");
                        acceleration = GetInput.getInt();
                        System.out.println("Enter the time:");
                        time = GetInput.getInt();
                        continues = ItemControl.calculateAirCoreWireCoilDistance(acceleration, time);
                    } 
                    while(continues==-1);
                    
                    break;
                    
                }
        }while(goOn);
        
    }
}