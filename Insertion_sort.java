import java.lang.*;
import java.util.*;
class Insertion_sort {
	// in insertion sort we select an element and try to place it in its respective place
	//for 1st element we dont have anyone to compare
	//so on moving to next element if we find that previous element is greater than next element then we swap 
	//till possible coz 
	// we will use i from 0->n-1 to select the elements
	// and j should be greater than 0 coz if j=0 and we try to access the previous element using j then it will throw runtime error
	
	public static void ins_sort(int arr[],int n) {
		for(int i = 0;i<n;i++) {
			
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		System.out.println("after insertion sort:");
		for(int k =0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of array elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter"+i+"th element");
			arr[i] = sc.nextInt();
		}
		ins_sort(arr,n);

	}

}
