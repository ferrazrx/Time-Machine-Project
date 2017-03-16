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
public class PersonageControlException extends Exception {

    public PersonageControlException() {
    }

    public PersonageControlException(String message) {
        super(message);
    }

    public PersonageControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonageControlException(Throwable cause) {
        super(cause);
    }

    public PersonageControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
