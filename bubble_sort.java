import java.lang.*;
import java.util.*;
public class bubble_sort {
	
	public static void bubblesort(int arr[],int n) {
		for(int i =n-1;i>=0;i--) {
			int didswap = 0;
			for(int j = 0;j<=i-1;j++) {
				// this is O(n^2) algorithm while space is O(1) 
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					didswap=1;
				}
			}
			if(didswap==0) {
				break;
			}
		}  
		System.out.println("array after bubble sort is:");
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
		bubblesort(arr,n);
		

	}

}
