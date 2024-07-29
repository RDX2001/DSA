import java.lang.*;
import java.util.*;
public class selection_sort {
	
	public static void sel_sort(int arr[],int n) {
		for(int i = 0;i<n-1;i++) {
			int mini = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[mini]) {
					mini = j;
				}
				
			}//swap
			int temp = arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
		}
		//after sort
		System.out.println("Sorted array is:"); 
		for(int k =0;k<n;k++) {
			
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take array input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n= sc.nextInt();
		int arr[] =new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("enter"+i+" th element");
			arr[i] = sc.nextInt();
		}
		sel_sort(arr,n);
		

	}

}
