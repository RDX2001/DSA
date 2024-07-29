import java.lang.*;
import java.util.*;
public class Rotate_arr_by_k_right {
	
	public static void Rev_array(int arr[],int start,int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void rotate_right(int arr[],int d) {//most optimal method
		int i=0;
		int j = (arr.length)-1;
		Rev_array(arr,i,((arr.length)-d-1));
		Rev_array(arr,arr.length-d,j);
		Rev_array(arr,i,j);
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter by how many places u wanna rotate");
		int n = sc.nextInt();
		
		
		int arr[] = {1,2,3,4,5,6,7};
		if(n<=arr.length) {
			rotate_right(arr,n);
		}
		else {
			rotate_right(arr,n%(arr.length));
		}
		sc.close();

	}

}
