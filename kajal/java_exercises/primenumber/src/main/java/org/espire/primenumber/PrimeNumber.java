package org.espire.primenumber;
/*
 * program to check if a given number is prime or not
 */
public class PrimeNumber {
	public static boolean prime(int x) {
		  boolean flag=true;
		for(int i=2;i<=x/2;i++) {
		 if(x%i==0) {
		 flag=false;
		 break;
		 }
		}
		  return flag;
		 }
	public static void main(String args[]) {

		System.out.println(PrimeNumber.prime(5));
		}}