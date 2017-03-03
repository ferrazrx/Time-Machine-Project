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
        System.out.println("Enter a option:");
        System.out.println(this.menu);
        boolean done = false;
        do{
            String option = this.getInputValue();
            if(option.toUpperCase().equals("B") ||option.toUpperCase().equals("E") ){
                return;
            }else{
                done= this.action(option);
            }
        }while(!done);
    }

    @Override
    public String getInputValue(){
     String option = GetInput.getString();
     return option;
    }

    /**
     *
     * @param value
     * @return
     */
    @Override
    public abstract boolean action(String value);
    
}
