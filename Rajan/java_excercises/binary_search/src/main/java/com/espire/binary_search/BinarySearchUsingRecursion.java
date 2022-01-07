package com.espire.binary_search;

public class BinarySearchUsingRecursion {
	public static void findRecursively(Integer arr[],Integer start,Integer end,Integer search) {
		if(start>end) {
			return;
		}
		Integer mid=(start+end)/2;
		if (arr[mid]==search) {
			System.out.println(mid);
			return;
		}else if(search>arr[mid]) {
			findRecursively(arr,mid+1,end,search);
		}else {
			findRecursively(arr,start,mid-1,search);
		}

}
//main method
public static void main(String[] ag) {
	Integer arr[]= {10,12,14,15,16,20};
	Integer search=15;
	Integer start=0;
	Integer end =arr.length-1;
	findRecursively(arr,start,end,search);
} 
}