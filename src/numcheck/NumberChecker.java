/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcheck;

/**
 *
 * @author Liam
 */
public class NumberChecker {
//    public static String checkNumber(int number){
//        if ( (number % 3) == 0) {
//            return "FIZZ";
//        }
//        return "nothing";
//        
//    }
//    
//}{



public static void multiplyTable(int start, int end, int coefficient) { 
    for (int i = start; i <= end; i++) {
        
        System.out.println(i + ") " + i*coefficient);
    }

} 

public static void divisonTable(double start, double end, double coefficient) {
    for (double d = start; d <= end; d++) {
        
        
        System.out.println(d + ") " + d/coefficient);
    }
    
}



}

