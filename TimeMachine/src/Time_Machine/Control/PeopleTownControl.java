/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Location;
import Time_Machine.Model.Message;
import Time_Machine.Model.Personage;
import Time_Machine.Model.Player;
import Time_Machine.Model.Scene;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class PeopleTownControl {
    public void printPersonageMessage(String name){
        
        for(int i=0;i<this.getPersonageMessages(name).size();i++){
            Message message = (Message) this.getPersonageMessages(name).get(i);
            System.out.println("___________________________________________________________");
            System.out.println("#"+i+" - "+message.getMessage());
            
        }
    }
    
    
    
    public ArrayList getPersonageMessages(String name){
        for(int i=0;i<Main.getPlayer().getMap().getLocations().size();i++){
            Location location = (Location) Main.getPlayer().getMap().getLocations().get(i);
            for(int a=0;a<location.getSceneLocation().size();i++){
                Scene scene = (Scene) location.getSceneLocation().get(a);
                for(int c=0;c<scene.getPersonages().size();c++){
                    Personage personage = (Personage) scene.getPersonages().get(c);
                    if(personage.getName().toUpperCase().contains(name.toUpperCase())){
                        return personage.getMessage();
                    }
                }
            }    
        }
    return null;    
    }
    
    public static void setInitialPeople (){
        // Instantiate personages
        Personage father = new Personage();
        Personage mother = new Personage();
        Personage johnFather = new Personage();
        Personage policeOffice = new Personage();
        Personage fireFighters = new Personage();
        Personage physician = new Personage();
        Personage baker = new Personage();
        Personage plumber = new Personage();
        Personage major = new Personage();
        
        //father attributes
        father.setName("James");
        SceneControl.setPersonageInScene(Main.getPlayer(), father, "liveroom");
        //Message 1
        Message message1 = new Message();
        message1.setMessage("\"Dad! I'm your son from the future! I've traveled in a strange time machine! Can you help me?\"");
        message1.setAnswer("\"Kids! They're so funny!\"");
        message1.setRead(false);
        father.setMessage(message1);
        //Message 2
        Message message2 = new Message();
        message2.setMessage("\"Could you give me something to eat?\"");
        message2.setAnswer("\"Here, take one apple and one bread litle boy. You look tired!\"");
        message2.setRead(false);
        father.setMessage(message2);
        //Message 3
        Message message3 = new Message();
        message3.setMessage("\"Have you heard about a time machine?\"");
        message3.setAnswer("\"Maybe! My father always talked about his dream to build one. He were smart and spend all day build things.\"");
        message3.setRead(false);
        father.setMessage(message3);    
        // Message 4
        Message message4 = new Message();
        message4.setMessage("\"Do you know here I can found more informations about a barn near here?\"");
        message4.setAnswer("\"There is only one barn near here, and it belongs to my father,\n you'll not find him there. He is missing!\"");
        message4.setRead(false);
        father.setMessage(message4);
        //Message 5
        Message message5 = new Message();
        message5.setMessage("\"Do you have any informations about any cientist in this city?\"");
        message5.setAnswer("You're curious! I have one journal about a cientist that used to live here in Bozeman.\n He was my father's friend some years ago. Here, you can take the journal, it's useless.");
        father.setMessage(message5);
        
        
    
    
    }
}
