/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class Personage extends Person {
    private ArrayList message;
    private boolean visited;

    public Personage() {
        this.message = new ArrayList();
    }

    public ArrayList getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message.add(message);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    
    
}