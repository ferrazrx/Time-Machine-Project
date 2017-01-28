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
public class SaveGame implements Serializable{
    
    private String message;
    private char input;

    public SaveGame() {
    }

    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.message);
        hash = 37 * hash + this.input;
        return hash;
    }

    @Override
    public String toString() {
        return "SaveGame{" + "message=" + message + ", input=" + input + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SaveGame other = (SaveGame) obj;
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        if (this.input != other.input) {
            return false;
        }
        return true;
    }
    
    
    
}
