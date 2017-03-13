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
                "I - How to collect items n the inventory\n" +
                "M - How to move to different places?\n" +
                "E - How to use items\n" + 
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
        System.out.println("This is a test");
      }

    private void useItemsView() {
       }

    private void movePlacesView() {
       }

    private void collectItemView() {
       }

    private void talkPeopleView() {
       }

    private void goalGameView() {
       }
}
