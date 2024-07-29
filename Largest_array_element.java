import java.lang.*;
import java.util.*;
public class Largest_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Brute 
		int arr[]  = {3,1,4,2,5,8,3,-2};
		int n= arr.length;
		Arrays.sort(arr);//usually takes O(nlogn)
		System.out.println("largest element is :"+arr[n-1]);
		//OPTIMAL
		int Largest = arr[0];
		for(int i =0;i<n;i++) {
			if (arr[i]>Largest) {           //TAKES O(n) 
				Largest = arr[i];
			}
		}System.out.println("largest from optimal is:"+Largest);

	}

}
