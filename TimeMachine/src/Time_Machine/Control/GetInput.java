/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Time_Machine.Control;

import java.util.Scanner;

/**
 *
 * @author rxfer_000
 */
public class GetInput {
    public static String getString () {
    Scanner scan = new Scanner (System.in);
    String input = scan.nextLine();
    return input;
    }
    public static int getInt(){
    Scanner scan = new Scanner (System.in);
    int input = scan.nextInt();
    return input;
    }
    public static double getDouble(){
    Scanner scan = new Scanner (System.in);
    double input = scan.nextDouble();
    return input;
    }
}
