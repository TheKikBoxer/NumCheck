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
public class NumCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        testCheck();
//        
//        testRectangle();

        testSquare();
    }

    public static void testCheck() {

//        System.out.println(NumberChecker.checkNumber(3));
//        System.out.println(NumberChecker.checkNumber(4));
//        System.out.println(NumberChecker.checkNumber(5));
//        System.out.println(NumberChecker.checkNumber(6));
//        System.out.println(NumberChecker.checkNumber(12));
//        for (int i = 0; i < 10; i++) {
        NumberChecker.multiplyTable(22, 25, 3);

        NumberChecker.divisonTable(22, 25, 5.0);

    }

    private static void testRectangle() {
        ShapePrinter.printRectangle(5, 4);
    }

    private static void testSquare() {
        int mySize = Integer.valueOf(JOptionPane.showInputDialog("Hey Dude, How Big Should The Box Be"));
        ShapePrinter.printSquare(mySize);
        

    }

}
