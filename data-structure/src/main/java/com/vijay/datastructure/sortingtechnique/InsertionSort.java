package com.vijay.datastructure.sortingtechnique;

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		
		int i,j;
		for(i=1; i<arr.length; i++) {
			j=i-1;
			while(j>=0&&arr[j]>arr[i]) {
				arr[j+1]=arr[j+1]^arr[j];
				arr[j]=arr[j+1]^arr[j];
				arr[j+1]=arr[j+1]^arr[j];
				
				j--;
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
