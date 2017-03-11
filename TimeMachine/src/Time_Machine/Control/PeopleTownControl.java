/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import Time_Machine.Model.Personage;

/**
 *
 * @author Group 7
 */
public class PeopleTownControl {
    
    public static boolean printPersonageMessage(String index){
        int i=0;
        if(PeopleTownControl.getPersonageMessages(index)== null){
            System.out.println("*** Invalid Option, try again! ***");
            return false;
        }else{
            for (String message : PeopleTownControl.getPersonageMessages(index)) {
                System.out.println("___________________________________________________________");
                System.out.println("#" + i + " - " + message);
                i++;
            }
            return true;
        }
    }
    
    private static String[] getPersonageMessages(String index){
        switch (index){
            case "0": return Personage.FATHER.getMessages();
            default:
                return null;
        }
    }

    public static void getAnswer(String personage, int answer) {
        switch (personage){
            case "0":
                
                System.out.println("\n\t"+Personage.FATHER.getName().substring(0,1).toUpperCase()+Personage.FATHER.getName().substring(1).toLowerCase() + " answered:");
                System.out.println("\n\t\t"+ Personage.FATHER.getAnswer(answer));
                break;
            default:
                System.out.println("*** Invalid option, please try again! ***");
        }
    }
   
    
    public static void setPersonages(){
 
    }

}
