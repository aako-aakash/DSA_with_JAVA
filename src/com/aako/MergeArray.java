package com.aako;

public class MergeArray {

	public static void main(String[] args) {
		//Two Arrays
		int[] a= {1,2};
		int[] b= {3,4};
		
		//creating new array with size
		
		int[] merge=new int[a.length + b.length];
		
		//copy first array into merged array
		for(int i=0;i<a.length;i++) merge[i]=a[i];
		
		//copy second array into merged array
		for(int i=0;i<b.length;i++) merge[i+a.length]=b[i];
		
		
		//print the merged array
		for(int val:merge) {
			System.out.print(val +" ");
		}
	}

}
