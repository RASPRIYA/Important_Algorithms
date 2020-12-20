package sorting_package;

import java.util.Scanner;

public class InsertionSort {
	//print the array
	static void printArray(int a[],int n) {
		System.out.println("Sorted Array: ");
		for(int i=0;i<n;i++) 
			System.out.print(a[i]+" ");
		System.out.println();
	}
	//insertion sort
	static void insertion(int a[],int n) {
		for(int i=1;i<n;i++){
	          int k=i;
	          int j=i-1;
	          //compare a[i] as key with all previous elements
	         while(a[j]>a[k]){
	        	 //swap if a[j] > a[k]
	             int temp=a[k];
	             a[k]=a[j];
	             a[j]=temp;
	             
	             k=j;
	             j--;
	             //if there is no element left to compare
	             if(j<0)
	             break;
	         } 
	      }
	}

	public static void main(String[] args) {
		//input
		Scanner in=new Scanner(System.in);
		//input of test cases
		System.out.println("Enter the no. of test cases: ");
		int t=in.nextInt();
		for(int k=0;k<t;k++) {
			System.out.println("Enter the no. of elements: ");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		//call method for insertion sort
		insertion(a,n);
		//call method for print array
		printArray(a,n);
	}
	}

}
