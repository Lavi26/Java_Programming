package org.espire.simpleinterest;

public class SimpleInterest {

    public static Double checkSimpleInterest(Double principle, Double rate, Double time){

        Double si= (principle*rate*time)/100;
        return si;
    }

    public static void main(String args[]){

        System.out.println("Simple interest is:" + checkSimpleInterest(5000.0,15.0,1.0));
    }
}
