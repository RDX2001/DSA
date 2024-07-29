import java.lang.*;
import java.util.*;

public class Chk_ifsorted {
	
	public static boolean if_sorted(int arr[]) {
		int n = arr.length;
		for(int i = 1;i<n;i++) {
			if(arr[i]>=arr[i-1]) {
				
			}
			else {
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		int arr[] = {1,1,1,1,2,3};
		b= if_sorted(arr);
		System.out.println("If sorted ? :"+b);
		

	}

}
