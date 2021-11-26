package org.espire.binarysearch;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int a[],int first,int last,int key) {
		if(first<=last) {
			
			int mid= first+(last-first)/2;
			
			if(a[mid]==key) {
				return mid;
			}
			if(a[mid]>key) {
				return binarySearch(a,mid-1,last,key);
			}
			else
			{
				return binarySearch(a,mid+1,last,key);
				
			}
		}
		return -1;
	}
	
}
