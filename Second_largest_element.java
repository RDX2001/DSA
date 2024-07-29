import java.lang.*;
import java.util.*;
public class Second_largest_element {
	
	public static void second_largest(int arr[]) {//brute with TC as O(nlogn+n)
		Arrays.sort(arr);
		int n =arr.length;
		int Largest = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=Largest) {
				System.out.println("second largest element is:"+arr[i]);
				break;
			}
		}
		
	}
	public static void second_largest_better(int arr[]) {// O(n) time complexity
		int n = arr.length;
		int largest = arr[0];
		for(int i = 0;i<n;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		int s_largest = Integer.MIN_VALUE;
		for(int j =0;j<n;j++) {
			if((arr[j]>s_largest)&&(arr[j]<largest)) {
				s_largest = arr[j];
			}
		}System.out.println("second largest from better is:"+s_largest);
	}
	
	public static int second_largest_optimal(int arr[]) {
		int n = arr.length;
		int largest = arr[0];
		int s_largest = Integer.MIN_VALUE;
		for(int i =1;i<n;i++) {
			if(arr[i]>largest) {
				s_largest = largest;
				largest = arr[i];
			}
			else if((arr[i]<largest)&&(arr[i]>s_largest)) {
				s_largest = arr[i];
			}
		}return s_largest;
	}
	
	public static int second_smallest(int arr[]) {
		int n= arr.length;
		int smallest = arr[0];
		int ssmallest = Integer.MAX_VALUE;
		for(int i =1;i<n;i++) {
			if(arr[i]<smallest) {
				ssmallest = smallest;
				smallest = arr[i];
			}
			else if((arr[i]>smallest)&&(arr[i]<ssmallest)) {
				ssmallest = arr[i];
			}
		}return ssmallest;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-10000,-9,-4,-2,-7,-6,-3,-5,-2,7};
		second_largest(arr);
		second_largest_better(arr);
		int second_largest = second_largest_optimal(arr);
		System.out.println("second largest from optimal is :"+second_largest);
		int ssmallest = second_smallest(arr);
		System.out.println("second smallest is :"+ssmallest);

	}

}
