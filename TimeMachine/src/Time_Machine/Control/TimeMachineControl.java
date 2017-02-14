package Time_Machine.Control;

import Time_Machine.Model.Item;
import Time_Machine.Model.TimeMachine;
import java.util.ArrayList;

/**
 *
 * @author Group 7
 */
public class TimeMachineControl {
    
        public void addPart(TimeMachine currentTimeMachine, Item itemToTimeMachine){
            System.out.println("You're trying to combine " + itemToTimeMachine.getName() + " with the time machine.");
            String itemName = itemToTimeMachine.getName();
            if("New Flux Capacitor".equals(itemName)       ||
               "High Voltage Wire".equals(itemName)        ||
               "Pliers".equals(itemName)                   ||
               "Air Core Wire Coils".equals(itemName)      ||
               "Capacitor of 1500uf 25V".equals(itemName)     
            ){
            currentTimeMachine.AddPartsListTimeMachine(itemToTimeMachine);
                System.out.println("You add " +itemToTimeMachine.getName()+" to the Time Machine." );
            }
            else{
                System.out.println("This item cannot be combine with the Time Machine. Sorry!");
            }
        }
    
        public void tryToFixTimeMachine(TimeMachine currentTimeMachine){
            int count = currentTimeMachine.getPartsListTimeMachine().size();
            ArrayList items = new ArrayList(); 
            for (int i=0; i<count;i++){
                Item item = (Item) currentTimeMachine.getPartsListTimeMachine().get(i);
                items.add(item.getName());
            }
            if(items.contains("New Flux Capacitor")   &&
               items.contains("High Voltage Wire")    &&
               items.contains("Pliers")               &&
               items.contains("Air Core Wire Coils")  &&
               items.contains("Capacitor of 1500uf 25V")     
            ){
                currentTimeMachine.setStatusTimeMachine("Fixed");
                System.out.println("The time Machine is " + currentTimeMachine.getStatusTimeMachine());
            } else {
                System.out.println("You still don't have all the items to fix the Time Machine."); 
            }
        }
        /*
    private static int area;
    
        public int calcAreaOfTriangle (int height, int base) {
            if(height < 0 || base < 0) {
            System.out.println("Please, enter valid positive number");
            return -1;
            }
            else if (height == 0 || base == 0){
            System.out.println("Invalid value. The value can't be equal to 0.");
            return -1;
            }     
            else {
            TimeMachineControl.area = (height*base)/2;
            System.out.println("The area of an triangle is: " + TimeMachineControl.area);
            return TimeMachineControl.area;
        }
      */
}