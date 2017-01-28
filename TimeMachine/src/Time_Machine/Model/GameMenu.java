package byui.cit260.timeMachine.model;

import java.io.Serializable;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skyler
 */
public class GameMenu implements Serializable{
    
    private String helpMessage;
    private char input;

    public GameMenu() {
    }

    
    public String getHelpMessage() {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.helpMessage);
        hash = 47 * hash + this.input;
        return hash;
    }

    @Override
    public String toString() {
        return "GameMenu{" + "helpMessage=" + helpMessage + ", input=" + input + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameMenu other = (GameMenu) obj;
        if (!Objects.equals(this.helpMessage, other.helpMessage)) {
            return false;
        }
        if (this.input != other.input) {
            return false;
        }
        return true;
    }
    
    
    
    
}

