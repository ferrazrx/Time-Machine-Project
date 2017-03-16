/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Message;
import Time_Machine.Model.Personage;
import Time_Machine.exceptions.PersonageControlException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Group 7
 */
public class PersonageControl {
    
    public static void printPersonageMessage(Game game, String name) throws PersonageControlException{
        if(name == null || name.equals("")){
            throw new PersonageControlException("The personage's name cannot be empty. Try Again.");
        }
        boolean found = false;
        for(int i=0;i<game.getPersonages().size();i++){
           Personage personage = (Personage) game.getPersonages().get(i);
           if(personage.getName().toUpperCase().contains(name.toUpperCase())){
               found = true;
               System.out.println("Choose a option to talk:");
               for(int a=0;a<personage.getMessage().size();a++){
                Message message = (Message) personage.getMessage().get(a);
                   System.out.println("\t____________________________________________________________");
                   System.out.println("\t" + a + " - " + message.getMessage());    
               }
           }   
        }
        if(found==false){
            throw new PersonageControlException("Personage not found. Try again.");
        }  
    }
    
    public static void getPersonageAnswer(Game game, String name, int index) throws PersonageControlException {
        if(name == null || name.equals("") || index < 0){
            throw new PersonageControlException("Personage name and message index cannot be empty. Try again.");
        }
        boolean found = false;
        for(int i=0;i<game.getPersonages().size();i++){
           Personage personage = (Personage) game.getPersonages().get(i);
           if(personage.getName().toUpperCase().contains(name.toUpperCase())){
               found = true;
               System.out.println("Answer:");
               System.out.println(personage.getAnswerById(index));
           }
        }
        if(found==false){
            throw new PersonageControlException("Personage not found. Try again.");
        }
        
    }

    public static ArrayList createPersonages() {
        //Player's father
        Personage father = new Personage("FATHER");
        
        //Message father 1
        Message message1 = new Message(
            "\"Dad! I'm your son from the future! I've traveled in a strange time machine! Can you help me?\"",
            "\"Kids! They're so funny!\"",
            false
        );		
        father.addMessage(message1);		
        
        //Message father 2
       	
        Message message2 = new Message(
            "\"Could you give me something to eat?\"",		
            "\"Here, take one apple and one bread litle boy. You look tired!\"",
            false
        );
        father.addMessage(message2);
        
        //Message father 3		
        Message message3 = new Message(
            "\"Have you heard about a time machine?\"",	
            "\"Maybe! My father always talked about his dream to build one. He were smart and spend all day build things.\"",
            false
            );
        father.addMessage(message3);
        
        // Message father 4		
        Message message4 = new Message(
            "\"Do you know here I can found more informations about a barn near here?\"",
            "\"There is only one barn near here, and it belongs to my father,\n you'll not find him there. He is missing!\"",
            false
            );
        father.addMessage(message4);
        
        //Message father 5		
        Message message5 = new Message(
            "\"Do you have any informations about any cientist in this city?\"",
            "You're curious! I have one journal about a cientist that used to live here in Bozeman.\n He was my father's friend some years ago. Here, you can take the journal, it's useless.",
                false
        );
        father.addMessage(message5);           
    
        ArrayList<Personage> personages = new ArrayList<>(Arrays.asList(father));
    return personages;
    
    }

}
