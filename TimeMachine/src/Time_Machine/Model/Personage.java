/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;

/**
 *
 * @author Group 7
 */
public enum Personage implements Serializable{

    FATHER("James", 
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
    
    private final String name;
    private final String[] messages;
    private final String[] answers;
    private boolean[] messageRead;
    private boolean visited;

    private Personage(String name, String[] messages, String[] answers, boolean[] messageRead, boolean visited) {
        this.name = name;
        this.messages = messages;
        this.answers = answers;
        this.messageRead = messageRead;
        this.visited = visited;
    }

    public String getName() {
        return name;
    }

    public String[] getMessages() {
        return messages;
    }
    public Personage getFather(int i){
        return Personage.FATHER;
    }
 
    public String[] getAnswers() {
        return answers;
    }

    public boolean[] getMessageRead() {
        return messageRead;
    }

    public void setMessageRead(boolean[] messageRead) {
        this.messageRead = messageRead;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    public String getMessage(int i){
        return messages[i];
    }
    public String getAnswer(int i){
        return answers[i];
    }
    public void setReadTrue(int i){
        this.messageRead[i] = true;
    }
    public boolean getReadMessage(int i){
        return messageRead[i];
    } 
    
    
 
}