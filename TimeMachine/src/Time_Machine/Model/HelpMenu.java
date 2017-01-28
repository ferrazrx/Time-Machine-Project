/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Skyler
 */
public class HelpMenu extends GameMenu implements Serializable{
    
    private char input;
    private String message;

    public HelpMenu() {
    }

    
    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.input;
        hash = 43 * hash + Objects.hashCode(this.message);
        return hash;
    }

    @Override
    public String toString() {
        return "HelpMenu{" + "input=" + input + ", message=" + message + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HelpMenu other = (HelpMenu) obj;
        if (this.input != other.input) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }
    
    
}
