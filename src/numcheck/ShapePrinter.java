/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcheck;

import javax.swing.JOptionPane;

/**
 *
 * @author Liam
 */
public class ShapePrinter {

    public static void printRectangle(int width, int height) {
        System.out.println("in print rectangle");

        for (int row = 1; row <= height; row++) {
            for (int column = 1; column <= width; column++) {
                 
            }
            System.out.println(row);
        }
    }
    
    public static void printSquare(int mySize) {
        System.out.println("in print square");
//        printRectangle(size, size);

        for (int row = 1; row <= mySize; row++) {
            for (int column = 1; column <= mySize; column++) {
               System.out.print("#"); 
            }
            System.out.println("");
        }
    }
              
    
    
    
}
