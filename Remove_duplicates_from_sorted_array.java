import java.lang.*;
import java.util.*;
public class Remove_duplicates_from_sorted_array {
	
	public static int remove_brute(int arr[]) {
		HashSet<Integer>set = new HashSet<>();  // here it takes logn time to insert in a set
		for(int i =0;i<arr.length;i++) {        // so time complexity of this part is O(nlogn)
			set.add(arr[i]);
		}
		int k =set.size();               // SC = O(n)
		int j =0;
		for(int x:set) {
			arr[j] = x;  // here it takes O(n);   so total tc is O(n+nlogn)
			j++;
		}return k;
		
	}
	
	public static int remove_optimal(int arr[]) {
		int i = 0;
		int n = arr.length;
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j]) {
				
				arr[i+1]=arr[j];
				++i;
				
			}
		}return (i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,3,3,3};
		int arr_1[] = {1,1,2,2,3,3,3};
		int k = remove_brute(arr);
		System.out.println("Size of unique array :"+k);
		for(int j = 0;j<k;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		int size = remove_optimal(arr_1);
		for(int i = 0;i<=size-1;i++) {
			System.out.print(arr_1[i]+" ");
		}
				

	}

}
