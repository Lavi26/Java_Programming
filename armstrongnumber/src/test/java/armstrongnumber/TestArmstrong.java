package armstrongnumber;

import java.util.Scanner;

import org.espire.armstrong.Armstrong;

public class TestArmstrong {
	
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = scanner.nextInt();
		
		Armstrong object=new Armstrong();
		object.calculate(num);
	}
		

}
