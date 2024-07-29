import java.lang.*;
import java.util.*;
public class Quick_sort {
	public static int partition(List<Integer>arr,int low,int high) {
		int i = low;
		int j = high;
		int pivot = arr.get(low);
		while(i<j) {
			
			while((arr.get(i)<=pivot)&&i<=high-1) {
				i++;
			}
			while((arr.get(j)>pivot)&&j>=low+1) {
				j--;
			}
			int temp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			
		}
		int temp = pivot;
		arr.set(low, arr.get(j));
		arr.set(j, temp);
		return j;
		
	}
	
	
	public static void quicksort(List<Integer>arr,int low,int high) {
		if(low<high) {
			int p_index =  partition(arr,low,high);
			quicksort(arr,low,p_index-1);
			quicksort(arr,p_index+1,high);
		}
		
	}
	public static List<Integer> qs(List<Integer> arr){
		quicksort(arr,0,arr.size()-1);
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arr = new ArrayList<>();
		arr = Arrays.asList(new Integer[] {4,6,2,5,7,9,1,3});
		int n = arr.size();
		arr = qs(arr);
		for(int i = 0;i<n;i++) {
			System.out.print(arr.get(i)+" ");
		}
		
	}

}
