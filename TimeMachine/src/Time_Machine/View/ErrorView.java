/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.View;

import Time_Machine.Control.Main;
import java.io.PrintWriter;

/**
 *
 * @author Group 7
 */
public class ErrorView {
    private static final PrintWriter errorFile = Main.getOutFile();
    private static final PrintWriter errorLog = Main.getLogFile();
    
    public static void display (String className, String errorMessage){
        errorFile.println("----------------------------------------------------------" +
                          "\n- ERROR - "+ errorMessage +
                          "\n----------------------------------------------------------"
                );
        errorLog.println(className + " - " + errorMessage);
        
    }
}
