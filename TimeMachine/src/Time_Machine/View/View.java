/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Group 7
 */
public abstract class View implements ViewInterface {
    protected String menu;
    
    protected final BufferedReader keyboard = Main.getInFile();
    protected final PrintWriter console = Main.getOutFile();
    
    public View(String menu){
    this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
    
    @Override
    public void displayMenu() {
        boolean done = false;
        do{ this.console.println(this.menu);
            this.console.println("Enter a option:");
            String option = this.getInput();
            switch (option.toUpperCase()) {
                case "B":
                    return;
                case "E":
                    GameDetailView.endView();
                    return;
                default:
                    done= this.action(option);
                    break;
            }
        }while(!done);
    }

    @Override
    public String getInput(){
        String selection = null;
        try {
            selection = keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Exception: " + ex.getMessage());
        }
        return selection;
    }
    
    @Override
    public abstract boolean action(String value);
    
    public void pause() {
        this.console.println("\n\n\t****  Press enter to continue... ****");
        this.getInput();
    }
    
}
