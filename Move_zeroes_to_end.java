import java.util.*;
import java.lang.*;

public class Move_zeroes_to_end {
	
	public static void move_zero(int arr[]) {
		List<Integer>list = new ArrayList<>();
		int i =0;
		int count = 0;
		while(i<arr.length) {
			if(arr[i]!=0) {
				list.add(arr[i]);
				i++;
			}
			else {
				count++;
				i++;
			}
		}
		
		for(int k=1;k<=count;k++) {
			list.add(0);
		}
		list.forEach((n) -> System.out.print(n+" ")); 
	}
	
	public static void move_zero_optimal(int arr[]) {   // the time complexity in nearly O(n) while the space complexity is O(1) only.
		int n = arr.length;
		int j =-1;
		for(int k =0;k<n;k++) {
			if(arr[k]==0) {
				j=k;
				break;
			}
		}
		if(j==-1) {
			System.out.println("no zeroes exist in there");
		}
		else {
			int i =j+1;
			while(i<n) {
				if(arr[i]!=0) {
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					i++;
					j++;
				}
				else {
					i++;
				}
			}
			System.out.println("the modified array is:");
			for(int x:arr) {
				System.out.print(x+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,0,0,0,0,0,3,4};
		move_zero_optimal(arr);

	}

}
