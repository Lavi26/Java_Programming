package org.espire.removeduplicates;


public class RemoveDuplicates {
	
	public static <E>  void removeDuplicateFromArray(E[] input) {
		//Creating object array
		Object array[]=new Object[input.length];
		int i,j=0;
		for(i=0;i<input.length-1;i++) {
			if(input[i]!=input[i+1]) {
				array[j]=input[i];
				j=j+1;
			}
		}
		array[j]=input[input.length-1];
		for(i=0;i<=j;i++) {
			System.out.print(array[i]+",");
		}
	}

	//Main method
	public static void main(String args[]) {
		int i,j;
		Integer integerArray[]= {1,2,3,1,5,9,6,3};
		String str[]= {"Abb","Abb","B","C"};
		for(i=0;i<integerArray.length;i++) {
			for(j=i+1;j<integerArray.length;j++) {
				int temp=0;
				if(integerArray[i]>integerArray[j]) {
					temp=integerArray[i];
					integerArray[i]=integerArray[j];
					integerArray[j]=temp;
				}
			}
		}
	    removeDuplicateFromArray(integerArray);
	    System.out.println();
	    removeDuplicateFromArray(str);
	}
}
