package org.espire.fibonacci;

public class FibonacciSeries {

    /*
     * Giving Fibonacci Series
     */
    public static Integer checkFibonacci(Integer n) {

        Integer num1 = 0, num2 = 1;
        Integer count = 1;
        while (count <= n) {

            System.out.println("" + num1);

            // sum of previous two number
            Integer sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            count++;
        }
        return num1;

    }

    public static void main(String args[]) {

        FibonacciSeries.checkFibonacci(6);

    }

}
