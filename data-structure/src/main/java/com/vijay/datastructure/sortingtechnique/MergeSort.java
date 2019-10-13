package com.vijay.datastructure.sortingtechnique;

public class MergeSort {	
	
	public static int[] merge(int[] A, int l, int mid, int h) {
				
		int[] C = new int[h];
		
		int i=l,j=mid+1,k=l;
		
		while(i<=mid&&j<h) {
			if(A[i]<=A[j]) {
				C[k++]=A[i++];
			}
			else {
				C[k++]=A[j++];
			}
		}
		
		for(;i<=mid;i++) {
			C[k++]=A[i];
		}
		for(;j<h;j++) {
			C[k++]=A[j];
		}
		return C;
	}
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		if(low<high) {
			System.out.println("In merge sort");
			int mid =(low+high)/2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
			
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] A	= {4,6,3,5,7,2,8,1};
			
		//int[] result1 = merge(A, 0, A.length/2, A.length);
		int[] result = mergeSort(A, 0, A.length);
		
		System.out.print("{");
		for(int i:result) {
			System.out.print(i+" ");
		}
		System.out.print("}");
	}
	
	

}
