package org.espire.armstrong;

public class Armstrong {
    /**
     * Checking whether number is armstrong or not
     */
    public static Boolean calculate(Integer num) {

        Boolean status = Boolean.FALSE;
        Integer remainder, total = 0;
        Integer value = num;
        //sum of the cube of each digit until 0
        while (num != 0) {
            remainder = num % 10;
            total = total + remainder * remainder * remainder;
            num = num / 10;
        }
        //comparing
        if (total == value)
            status = Boolean.TRUE;
        return status;
    }

    public static void main(String[] args) {
        System.out.println(Armstrong.calculate(407));
    }
}
