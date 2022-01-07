package remove_duplicate;

import java.util.Scanner;

public class RemoveDuplicateFromArray {
  
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
  
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }

	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");  
        int n=sc.nextInt();  
       
        int[] data = new int[n];  
        System.out.println("Enter duplicates number");  
        for(int i=0; i<n; i++)  
        {  
          //reading  elements from the user   
         data[i]=sc.nextInt();  
        } 
        n = removeduplicates(data, n);
        System.out.println("Remove duplicates ");
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(data[i] + " ");
    }
    
}