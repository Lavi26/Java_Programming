package org.espire.squareroot;

public class SquareRoot {

    /*
     * Find the Square root of a number
     */
    public static double checkRoot(Integer n) {

        // approximate by half of the given number
        double squareRoot = n / 2, result;

        // until the difference of approximate value and root value is not equal to 0
        do {
            result = squareRoot;
            squareRoot = (result + (n / result)) / 2;
        } while ((result - squareRoot) != 0);

        return squareRoot;

    }

    public static void main(String args[]) {

        System.out.println(SquareRoot.checkRoot(4));

    }
}
