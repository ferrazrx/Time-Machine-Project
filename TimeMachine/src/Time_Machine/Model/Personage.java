/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class Personage implements Serializable{
    
    private String name;
    private ArrayList<Message> message;
    
        public Personage(String name) {
            this.name = name;
            this.message = new ArrayList();
        }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Message> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Message> message) {
        this.message = message;
    }
    public void addMessage(Message message){
        this.message.add(message);
    
    }
    
    public Message getAnswerById(int a){
        Message answer = this.message.get(a);
        return answer;
   }

    /*FATHER("James", 
            new String[]{
                "\"Dad! I'm your son from the future! I've traveled in a strange time machine! Can you help me?\"",
                "\"Could you give me something to eat?\"",
                "\"Have you heard about a time machine?\"",
                "\"Do you know here I can found more informations about a barn near here?\"",
                "\"Do you have any informations about any cientist in this city?\""
            },
            new String[]{
                "\"Kids! They're so funny!\"",
                "\"Here, take one apple and one bread litle boy. You look tired!\"",
                "\"Maybe! My father always talked about his dream to build one. He were smart and spend all day build things.\"",
                "\"There is only one barn near here, and it belongs to my father,\n you'll not find him there. He is missing!\"",
                "\"You're curious! I have one journal about a cientist that used to live here in Bozeman.\n He was my father's friend some years ago. Here, you can take the journal, it's useless.\""
            },
            new boolean[]{false,false,false,false,false}
            ,true);
*/    




}