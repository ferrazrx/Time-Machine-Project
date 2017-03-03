/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

/**
 *
 * @author Group 7
 */
public class PeopleTownView extends View {

    public PeopleTownView() {
        super("\n-------------------------------------------"+
              "\n|              People in Town             |"+    
              "\n-------------------------------------------\n"+    
              "P - See people in this location\n" +
              "T - Talk\n" +
              "B - Back to Game Menu\n" + 
              "-------------------------------------------\n");
    }
    
    @Override
    public boolean action(String option) {
        option = option.toUpperCase();
        switch (option){
            case "P":
                break;
            case "T":
                break;
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    }
    
}
