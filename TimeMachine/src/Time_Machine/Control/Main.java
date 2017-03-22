/*
 * BYU - Idaho - CIT 260 - Winter 2017
 */
package Time_Machine.Control;

//import classes


import Time_Machine.Model.Game;
import Time_Machine.Model.Player;
import Time_Machine.View.ErrorView;
import Time_Machine.View.MainMenuView;
import Time_Machine.View.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Group 7
 */

public class Main {
// Global variables to the current game
    private static Game currentGame = null;
    private static Player player = null;
    
// Stream I/O variables
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
// Stream Log File
    private static PrintWriter logFile = null;
    
    
    public static void main(String[] args) {
        try {//open charcter stream files for end user input and output
            Main.inFile = new BufferedReader(new InputStreamReader(System.in));
            Main.outFile = new PrintWriter(System.out, true);
            
            try{
                //open log file
                String filePath = "log.txt";
                Main.logFile = new PrintWriter(filePath);
            }
            catch(Exception e){
               ErrorView.display("Main","Exception: " + e.toString() + "\nCause: " + e.getCause() + "\nMessage: "+ e.getMessage());
            }
            //Create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            // Start a new player for the game and get his name
            Player mainPlayer = startProgramView.displayStartProgramView();
            //Store the player in the current Player variable
            Main.setPlayer(mainPlayer);
            //Create a Main Menu
            MainMenuView mainMenuView = new MainMenuView();
            // Display the Main Menu and get value
            mainMenuView.displayMenu();
        }
        catch(Throwable e){
            ErrorView.display("Main","Exception: " + e.toString() + "\nCause: " + e.getCause() + "\nMessage: "+ e.getMessage());
            e.printStackTrace();
        }
        finally {
            try {
                if(Main.inFile != null){
                    Main.inFile.close();
                }
                if(Main.outFile != null){
                    Main.outFile.close();
                }
                if(Main.logFile != null){
                    Main.logFile.close();
                }
            } catch (IOException ex) {
                ErrorView.display("Main","Error closing files");
            }
            
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Main.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Main.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Main.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Main.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Main.logFile = logFile;
    }
    
}