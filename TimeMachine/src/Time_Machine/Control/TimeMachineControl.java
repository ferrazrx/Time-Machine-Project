package Time_Machine.Control;

/**
 *
 * @author sinitsyndmitriy
 */
public class TimeMachineControl {

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

    }
    
}