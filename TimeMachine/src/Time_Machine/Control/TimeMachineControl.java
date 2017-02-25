package Time_Machine.Control;

import Time_Machine.Model.Item;
import Time_Machine.Model.Player;
import Time_Machine.Model.TimeMachine;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class TimeMachineControl {
    
        public static void returnTimeMachineItems(Player player){
            System.out.println("Your Time Machine has the items below:");
            if(player.getTimeMachine().getPartsListTimeMachine().size()<1){
                System.out.println("*** You Time Machine has no items yet. ***");
            }else{
                for(int i=0; i<player.getTimeMachine().getPartsListTimeMachine().size();i++){
                    Item item = (Item) player.getTimeMachine().getPartsListTimeMachine().get(i);
                    System.out.println("____________________________________");
                    System.out.println("Item's Name: "+item.getName()+".");
                }
            }    
        }
    
        public static void addPart(Player player, String item){
             item = item.toUpperCase();
             boolean found = false;
             for(int i=0; i<player.getInventory().getAmountItems();i++){
                if(player.getInventory().getItemByIndex(i).getName().toUpperCase().contains(item)){
                    found = true;
                    Item itemToTimeMachine = player.getInventory().getItemByIndex(i);
                    System.out.println("You're trying to combine " + itemToTimeMachine.getName() + " with the time machine.");
                    String itemName = itemToTimeMachine.getName();
                    if("New Flux Capacitor".equals(itemName)       ||
                       "High Voltage Wire".equals(itemName)        ||
                       "Pliers".equals(itemName)                   ||
                       "Air Core Wire Coils".equals(itemName)      ||
                       "Capacitor of 1500uf 25V".equals(itemName)  ||
                       "Bubble gum".equals(itemName)
                    ){
                        player.getTimeMachine().AddPartsListTimeMachine(itemToTimeMachine);
                        System.out.println("You add " +itemToTimeMachine.getName()+" to the Time Machine." );
                    }else{
                        System.out.println("This item cannot be combine with the Time Machine. Sorry!");
                    }
                    
                }
             }
             if(found== false){System.out.println("*** Item not found in your inventory ***");}
        }
    
        public static void tryToFixTimeMachine(Player player){
            int count = player.getTimeMachine().getPartsListTimeMachine().size();
            ArrayList items = new ArrayList(); 
            for (int i=0; i<count;i++){
                Item item = (Item) player.getTimeMachine().getPartsListTimeMachine().get(i);
                items.add(item.getName());
            }
            if(items.contains("New Flux Capacitor")   &&
               items.contains("High Voltage Wire")    &&
               items.contains("Pliers")               &&
               items.contains("Air Core Wire Coils")  &&
               items.contains("Capacitor of 1500uf 25V") &&
               items.contains("Bubble gum")     
            ){
                player.getTimeMachine().setStatusTimeMachine("Fixed");
                System.out.println("The time Machine is " + player.getTimeMachine().getStatusTimeMachine() + "! You can turn it on now!");
            } else {
                System.out.println("You still don't have all the items to fix the Time Machine."); 
            }
        }
}