/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.GetInput;

/**
 *
 * @author Group 7
 */
public abstract class View implements ViewInterface {
    protected String menu;
    
    public View(String menu){
    this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }
    
    @Override
    public void displayMenu() {
        boolean done = false;
        do{ System.out.println(this.menu);
            System.out.println("Enter a option:");
            String option = this.getInputValue();
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
    public String getInputValue(){
         String option = GetInput.getString();
        return option;
    }
    public int getInputInt(){
        int option = GetInput.getInt();
        return option;
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public abstract boolean action(String value);
    
    public void pause() {
        System.out.println("\n\n\t****  Press enter to continue... ****");
        this.getInputValue();
        return;
    }
    
}
