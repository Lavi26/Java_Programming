package org.espire.factorial;

public class FactorialNumber {

    /*
     * find the factorial of a number
     */
    public static int checkFact(Integer n) {

        Integer i, fact = 1;

        if (n == 0) {
            return 1;
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        System.out.println(+fact);
        return fact;

    }

    public static void main(String args[]) {

        Integer num = 5;

        FactorialNumber.checkFact(num);

    }

}
