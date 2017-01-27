/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

//import classes
import Time_Machine.Model.Person;
import Time_Machine.View.GameMenu;
import Time_Machine.View.Title;
import java.util.Scanner;

/**
 *
 * @author Group 7
 */
public class Main {
    public static void main(String[] args) {
        // Insert the title of the Game on the console
        Title.titleGame();
        GameMenu.displayTitleDetail();
        
        //Display the game Main Menu
        GameMenu.displayGameMenu();
        
        
        //Scanner the option in the Main Menu
        Scanner scan = new Scanner(System.in);
        String option = scan.nextLine();
        
        // Just a test of the class Person - This part must be deleted
        Person john = new Person();
        john.setName("John Smith");
        john.setAge(16);
        john.setDescription("John is a player's friend.");
        john.setType("Available");
        System.out.println(john.toString());
        
        // End of the test
        
              
    }
 
    
}
