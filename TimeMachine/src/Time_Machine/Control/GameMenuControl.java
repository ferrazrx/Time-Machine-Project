/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

/**
 *
 * @Skyler Hildreth ? 
 */
public class GameMenuControl {
    private static String playerName;
    private static double startLocation;
    
  public static void startNewGame(int newGame, String playerName, double startLocation)
  {
      System.out.println("Would you want to start a new game or continue an existing game?");
      System.out.println("Enter 1 for new game and 2 for existing game");
              if (newGame > 2 || newGame < 1){
                  System.out.println("Invalid entry please try again...");
              }
              else if (newGame == 1){
                  System.out.println("Please enter name");
                  if (playerName == null){
                       System.out.println("Please enter another name");
                  }
                  else{
                  System.out.println("welcome enjoy the game.");
                 startLocation = 1;
              }
              }
              else if (newGame == 2){
                  System.out.println("Please enter name");
                  if (playerName == null){
                       System.out.println("Please enter another name");
                  }
                  else{
                  System.out.println("welcome enjoy the game.");
                  startLocation =(2);
              }
  }
  }
}
