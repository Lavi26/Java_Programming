package armstrongnumber;
import java.util.Scanner;


public class ArmstrongNumber {
	
	/*
	 * checking whether number is armstrong or not
	 */
	
	
	
	 public static Boolean calculate(int num) {

	       
	      //Declaring and initializing variable 
	        int number, temp, total = 0;
	        number = num;
	      //Loop for dividing number and find cubic sum of the number 0
	        for( ;number!=0;number /= 10)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	        }
          
	        //checking 
	        if(total == num) {
	            System.out.println(num + " is an Armstrong number");
	        return true;}
	        else {
	            System.out.println(num + " is not an Armstrong number");
			return false;
	        }
	    }

	
    public static void main(String[] args) {

       
        System.out.println("Ënter Number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        //calling method
        ArmstrongNumber.calculate(input);
    }
}
