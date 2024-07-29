import java.lang.*;
import java.util.*;
public class Leftrotate_byd_d_places {
	
	public static void left_rotate(int arr[],int d) {// brute force  t.c = O(n) while space complexity = O(d)
		int j =arr.length-1;
		int  arr2[]= new int[d];
		for(int i =0;i<=d-1;i++) {
			arr2[i]=arr[i];
		}for(int k =d;k<=j;k++) {
			arr[k-d]=arr[k];
		}
		for(int m = (arr.length)-d,l =0;m<=j && l<d;m++,l++) {
			arr[m] = arr2[l];
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void array_rev(int arr[],int start,int end) {
		
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void optimal_rotate(int arr[],int d) {// t.c = O(n) while s.c = O(1)  improvement in space complexity as no extra space used.
		int i=0;
		int j = (arr.length)-1;
		array_rev(arr,i,d-1);
		array_rev(arr,d,j);
		array_rev(arr,i,j);
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter by how many places u wanna rotate");
		int n = sc.nextInt();
		
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		if(n<=arr.length) {
			optimal_rotate(arr,n);
		}
		else {
			optimal_rotate(arr,n%(arr.length));
		}

	}

}
