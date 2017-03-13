package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Item;
import Time_Machine.Model.TimeMachine;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class TimeMachineControl {
    
        public static void returnTimeMachineItems(Game game){
            System.out.println("Your Time Machine has the items below:");
            if(game.getTimeMachine().getPartsListTimeMachine().size()<1){
                System.out.println("*** You Time Machine has no items yet. ***");
            }else{
                for(int i=0; i<game.getTimeMachine().getPartsListTimeMachine().size();i++){
                    Item item = (Item) game.getTimeMachine().getPartsListTimeMachine().get(i);
                    System.out.println("____________________________________");
                    System.out.println("Item's Name: "+item.getName()+".");
                }
            }    
        }
    
        public static void addPart(Game game, String item){
             item = item.toUpperCase();
             if(game.getLocation().getLocationName().toUpperCase().equals("BARN")){
                for(int i=0; i<game.getInventory().getAmountItems();i++){
                   if(game.getInventory().getItemByIndex(i).getName().toUpperCase().contains(item)){
                       Item itemToTimeMachine = game.getInventory().getItemByIndex(i);
                       System.out.println("You're trying to combine " + itemToTimeMachine.getName() + " with the time machine.");
                       String itemName = itemToTimeMachine.getName();
                       if("New Flux Capacitor".equals(itemName)       ||
                          "High Voltage Wire".equals(itemName)        ||
                          "Pliers".equals(itemName)                   ||
                          "Air Core Wire Coils".equals(itemName)      ||
                          "Capacitor of 1500uf 25V".equals(itemName)  ||
                          "Bubble gum".equals(itemName)
                       ){
                           game.getTimeMachine().AddPartsListTimeMachine(itemToTimeMachine);
                           System.out.println("You add " +itemToTimeMachine.getName()+" to the Time Machine." );
                       }else{
                           System.out.println("This item cannot be combine with the Time Machine. Sorry!");
                       }

                   }else{
                        System.out.println("*** Item not found in your inventory ***");
                   }
                }
             }else{
                 System.out.println("You must be at the Barn to combine item with the time machine, you're now at the " + game.getLocation().getLocationName().substring(0,1).toUpperCase()+ game.getLocation().getLocationName().substring(1).toLowerCase()+".");
             }    
             
        }
    
        public static void tryToFixTimeMachine(Game game){
            if(game.getLocation().getLocationName().toUpperCase().equals("BARN")){
                int count = game.getTimeMachine().getPartsListTimeMachine().size();
                ArrayList items = new ArrayList(); 
                for (int i=0; i<count;i++){
                    Item item = (Item) game.getTimeMachine().getPartsListTimeMachine().get(i);
                    items.add(item.getName());
                }
                if(items.contains("New Flux Capacitor")      &&
                   items.contains("High Voltage Wire")       &&
                   items.contains("Pliers")                  &&
                   items.contains("Air Core Wire Coils")     &&
                   items.contains("Capacitor of 1500uf 25V") &&
                   items.contains("Bubble gum")     
                ){
                    game.getTimeMachine().setStatusTimeMachine("Fixed");
                    System.out.println("The time Machine is " + game.getTimeMachine().getStatusTimeMachine().substring(0,1).toUpperCase()+ game.getTimeMachine().getStatusTimeMachine().substring(1).toLowerCase()+ "! You can turn it on now!");
                } else {
                    System.out.println("You still don't have all the items to fix the Time Machine."); 
                }
            } else {
                System.out.println("You must be at the Barn to try to fix the time machine, you're now at the " + game.getLocation().getLocationName().substring(0,1).toUpperCase()+ game.getLocation().getLocationName().substring(1).toLowerCase()+".");
            }    
        }

    static TimeMachine createTimeMachine() {
      TimeMachine machine = new TimeMachine("broken","An old machine that broke in your travel to the past.");
      return machine;
    }
        
       
}