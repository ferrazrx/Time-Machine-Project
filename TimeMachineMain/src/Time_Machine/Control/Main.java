/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine_Package;

import java.util.Scanner;

/**
 *
 * @author Group 7
 */
public class Main {
    public static void main(String[] args) {
        // Insert the title of the Game on the console
        Title.titleGame();
        
        //Display the game Main Menu
        GameMenu.displayGameMenu();
        
        //Scanner the option in the Main Menu
        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();
        
        
        
        
    }
 
    
}
