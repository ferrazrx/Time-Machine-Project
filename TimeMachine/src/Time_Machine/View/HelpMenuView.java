/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;
/**
 *
 * Group 7
 */
public class HelpMenuView extends View {
     
    
     public HelpMenuView(){    
        super(  "\n-------------------------------------------"+
                "\n|              Help Menu                  |"+    
                "\n-------------------------------------------\n"+    
                "G - What is the goal of the game?\n" +
                "T - How to talk with people?\n" +
                "I - How to collect items in the inventory\n" +
                "M - How to move to different places?\n" +
                "H - How to use items\n" + 
                "C - Clues to play the game\n" +
                "B - Back to Main Menu\n" + 
                "-------------------------------------------\n");
    }

     @Override
    public boolean action(String option){
        option = option.toUpperCase();
        switch (option){
            case "G"://create and start a new game
                this.goalGameView();
                break;
            case "T":// See saved games
                this.talkPeopleView();
                break;
            case "I":// Save current game
                this.collectItemView();
                break;
            case "M":
                this.movePlacesView();
                break;
            case "E":
                this.useItemsView();
                break;
            case "C":
                this.cluesView();
                break;    
            default:
                System.out.println("*** Invalid selection *** Try Again!");
                break;
        }
        return false;
    
    }
    private void cluesView() {
        System.out.println("\n\t*******************************************");
        System.out.println("\t*  1º - Combine item with the machine     *\n"
                +          "\t*  2º - Talk with all citizens            *\n"
                +          "\t*  3º - Search for things in all places   *\n"
                +          "\t*  4º - Use the information on images     *\n");
        System.out.println("\t*******************************************");
      }

    private void useItemsView() {
        System.out.println("\n\t*******************************************");
        System.out.println("\t*  You can combine items with you time    *\n"
                +          "\t*  machine.                               *\n");
        System.out.println("\t*******************************************");
       }

    private void movePlacesView() {
        System.out.println("\n\t*******************************************");
        System.out.println("\t*  To move to another place it's simple.  *\n"
                +          "\t*  Type:                                  *\n"
                +          "\t*  V - Map of Bozeman                     *\n"
                +          "\t*  M - Move to Another Location           *\n"
                +          "\t*                                         *\n"
                +          "\t*  Now you can enter the location name    *\n"
                +          "\t*  to move.                               *");
        System.out.println("\t*******************************************");
       }

    private void collectItemView() {
        System.out.println("\n\t********************************************");
        System.out.println("\t*  To collect new items, type:             *\n"
                +          "\t*  L - Look around for clues,              *\n"
                +          "\t*  stuff and food                          *\n"
                +          "\t*                                          *\n"
                +          "\t*  The items will appear on your screen,   *\n"
                +          "\t*  then type the item's name to collect it.*");
        System.out.println("\t********************************************");
        
       }

    private void talkPeopleView() {
        System.out.println("\n\t*******************************************");
        System.out.println("\t*  The personages can change depending on *\n"
                +          "\t*  scene you're on the game. To talk with *\n"
                +          "\t*  determined personage you must be at    *\n"
                +          "\t*  the same scene and then type:          *\n"
                +          "\t*                                         *\n"
                +          "\t*  A - People in this location;           *\n"
                +          "\t*  T - Talk;                              *\n"
                +          "\t*  Write the name of the personage;       *\n"
                +          "\t*                                         *\n"
                +          "\t*  Now you can choose what speech you     *\n"
                +          "\t*  want to say.                           *");
        System.out.println("\t*******************************************");
       }

    private void goalGameView() {
        System.out.println("\n\t*******************************************");
        System.out.println("\t*  The goal of the game is to find the    *\n" +
                           "\t*  pieces of the Time Machine walking     *\n" +
                           "\t*  through the city of Bozeman and fix    *\n" +
                           "\t*  the machine to travel back in time.    *");
        System.out.println("\t*******************************************");
       }
}
