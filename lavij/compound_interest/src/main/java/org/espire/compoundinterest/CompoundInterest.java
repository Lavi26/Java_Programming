package org.espire.compoundinterest;

public class CompoundInterest {
    public static Double checkCompoundInterest(Double principle, Double rate,Double time) {

        double amount = 0, t = 1,ci = 0;

        //convert into vector form
        rate = (1 + rate / 100);

        //calculate power     ci= P(1+R/n)^(nt) -P
        for (Integer i = 0; i < time; i++) {
            t = t * rate;
            amount = principle * t;
            ci = amount - principle;
        }
        return ci;
    }
    public static void main(String args[]){
        System.out.println("Compound interest is:" + checkCompoundInterest(1500.0,3.0,2.0));
    }
}
