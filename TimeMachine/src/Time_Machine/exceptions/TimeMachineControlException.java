/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.exceptions;

/**
 *
 * @author Group 7
 */
public class TimeMachineControlException extends Exception {

    public TimeMachineControlException() {
    }

    public TimeMachineControlException(String message) {
        super(message);
    }

    public TimeMachineControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeMachineControlException(Throwable cause) {
        super(cause);
    }

    public TimeMachineControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
