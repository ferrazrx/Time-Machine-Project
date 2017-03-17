package Time_Machine.Control;

import Time_Machine.Model.Game;
import Time_Machine.Model.Item;
import Time_Machine.Model.TimeMachine;
import Time_Machine.exceptions.TimeMachineControlException;
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
    
        public static void addPart(Game game, String item) throws TimeMachineControlException{
            boolean found = false; 
            if(game.getPlayer().getCurrentLocation().getLocationName().toUpperCase().equals("BARN")){
                for(int i=0; i<game.getInventory().getAmountItems();i++){
                   if(game.getInventory().getItemByIndex(i).getName().toUpperCase().contains(item.toUpperCase())){
                       found = true;
                       Item itemToTimeMachine = game.getInventory().getItemByIndex(i);
                       System.out.println("You're trying to combine " + itemToTimeMachine.getName() + " with the time machine.");
                       String itemName = itemToTimeMachine.getName();
                       if("New Flux Capacitor".toUpperCase().equals(itemName.toUpperCase())       ||
                          "High Voltage Wire".toUpperCase().equals(itemName.toUpperCase())        ||
                          "Pliers".toUpperCase().equals(itemName.toUpperCase())                   ||
                          "Air Core Wire Coils".toUpperCase().equals(itemName.toUpperCase())      ||
                          "Capacitor of 1500uf 25V".toUpperCase().equals(itemName.toUpperCase())  ||
                          "Bubble gum".toUpperCase().equals(itemName.toUpperCase())
                       ){
                           game.getTimeMachine().AddPartsListTimeMachine(itemToTimeMachine);
                           System.out.println("You add " +itemToTimeMachine.getName()+" to the Time Machine." );
                           return;
                       }else{
                           throw new TimeMachineControlException("This item cannot be combine with the Time Machine. Sorry!");
                       }
                    }
                }   
             }else{
                 throw new TimeMachineControlException("You must be at the Barn to combine item with the time machine, you're now at the " + game.getPlayer().getCurrentLocation().getLocationName().substring(0,1).toUpperCase()+ game.getPlayer().getCurrentLocation().getLocationName().substring(1).toLowerCase()+".");
             }    
             if(found==false){
                 throw new TimeMachineControlException("*** Item not found in your inventory ***");
             }
        }
    
        public static void tryToFixTimeMachine(Game game){
            if(game.getPlayer().getCurrentLocation().getLocationName().toUpperCase().equals("BARN")){
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
                System.out.println("You must be at the Barn to try to fix the time machine, you're now at the " + game.getPlayer().getCurrentLocation().getLocationName().substring(0,1).toUpperCase()+ game.getPlayer().getCurrentLocation().getLocationName().substring(1).toLowerCase()+".");
            }    
        }

    static TimeMachine createTimeMachine() {
      TimeMachine machine = new TimeMachine("broken","An old machine that broke in your travel to the past.");
      return machine;
    }
        
       
}