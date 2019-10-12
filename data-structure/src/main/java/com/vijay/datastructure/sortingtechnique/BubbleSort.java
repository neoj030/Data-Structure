package com.vijay.datastructure.sortingtechnique;


public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,8,5,2,4,6,3};
		
		int[] result =BubbleSort.bubbleSort(arr);
		
		System.out.print("[");
		for(int i: result) {
			System.out.print(i+" ");
		}
		System.out.print("]");
	}

}
