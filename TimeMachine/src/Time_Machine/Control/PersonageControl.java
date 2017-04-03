/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Control.Enum.PersonageEnum;
import Time_Machine.Model.Game;
import Time_Machine.Model.Item;
import Time_Machine.Model.Message;
import Time_Machine.Model.Personage;
import Time_Machine.exceptions.PersonageControlException;
import java.util.ArrayList;

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
                    if(message.isRead()== false){
                        System.out.println("\t____________________________________________________________");
                        System.out.println("\t" + a + " - " + message.getMessage());
                    }
                    else{
                        System.out.println("\t____________________________________________________________");
                        System.out.println("\t" + a + " - " + "*** You've already said this speech! ***");
                    }
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
               System.out.println("\n\tAnswer:\n");
               Message message = personage.getAnswerById(index);
               System.out.println(message.getAnswer());
               
               if (message.getItem() != null && message.isRead() == false){
                   Item item = message.getItem();
                   InventoryControl.addInventoryItem(game, item);
                   System.out.println("\n\n\t*** Item " + item.getName() + " add to your inventory! ***");
               }
               message.setRead(true);
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
        Message messageFather1 = new Message(
            "\"Dad! I'm your son from the future! I've traveled in a strange time machine! Can you help me?\"",
            "\"Kids! They're so funny!\"",
            false
        );		
        father.addMessage(messageFather1);		
        
        //Message father 2
       	
        Message messageFather2 = new Message(
            "\"Could you give me something to eat?\"",		
            "\"Here, take one apple and one bread litle boy. You look tired!\"",
            false
        );
        Item apple = new Item(1);
        apple.setName("Apple");
        messageFather2.setItem(apple);
        father.addMessage(messageFather2);
        
        //Message father 3		
        Message messageFather3 = new Message(
            "\"Have you heard about a time machine?\"",	
            "\"Maybe! My father always talked about his dream to build one. He were smart and spend all day build things.\"",
            false
            );
        father.addMessage(messageFather3);
        
        // Message father 4		
        Message messageFather4 = new Message(
            "\"Do you know here I can found more informations about a barn near here?\"",
            "\"There is only one barn near here, and it belongs to my father,\n you'll not find him there. He is missing!\"",
            false
            );
        father.addMessage(messageFather4);
        
        //Message father 5		
        Message messageFather5 = new Message(
            "\"Do you have any informations about any cientist in this city?\"",
            "\"You're curious! I have one journal about a cientist that used to live here in Bozeman.\n He was my father's friend some years ago. Here, you can take the journal, it's useless.\"",
                false
        );
        //create Item to message 5
        Item newspaper = new Item(1);
        newspaper.setName("Newspaper");
        messageFather5.setItem(newspaper);
        
        father.addMessage(messageFather5);           
    
        
        //Player's mother
        Personage mother = new Personage("MOTHER");
        
        Message messageMother1 = new Message (
           "\"Mom! It's me your son! Please help me! I'm scared!\"",
           "\"My son? That's impossible, I don't have any children yet!\n But don't be afraid child, you can count on me!\"",
           false     
        );
        mother.addMessage(messageMother1);
        
        Message messageMother2 = new Message (
           "\"Madam, do you know how to fix a time machine?\"",
           "\"Time machine? What's it? I've never heard about it before...\n Is it a standart machine?\n I usually fix my wash machine with this, take it!\"",
           false     
        );
        Item coil = new Item(1);
        coil.setName("Air Core Wire Coils");
        messageMother2.setItem(coil);
        mother.addMessage(messageMother2);
        
        Message messageMother3 = new Message (
           "\"Madam, do you have something to eat?\"",
           "\"Here you are!\"",
           false     
        );
        Item bread = new Item(1);
        bread.setName("Bread");
        messageMother3.setItem(bread);
        mother.addMessage(messageMother3);
        
        
        //Set personagens into the array list personages
        ArrayList<Personage> personages = new ArrayList<>();
        personages.add(PersonageEnum.father.ordinal(), father);
        personages.add(PersonageEnum.mother.ordinal(), mother);
        
    return personages;
    
    }

}
