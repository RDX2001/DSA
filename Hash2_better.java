import java.lang.*;
import java.util.*;
class Hash2_better {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// taking all array elements input
		System.out.println("enter array length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			System.out.println("enter "+i+"th element");
			arr[i] = sc.nextInt();
		}
		//pre compute
		int hash[] = new int[50];
		for(int j = 0;j<50;j++) {
			hash[j]=0;
		}
		for(int k =0;k<n;k++) {
			hash[arr[k]]++;
		}
		
		//get the number of numbers
		System.out.println("enter number of numbers");
		int q = sc.nextInt();
		while(q>0) {
			int number;
			number = sc.nextInt();
			System.out.println(number+" - "+hash[number]+"times");
			q--;
		}
		

	}

}
// here we are creating a hash array and just incrementing the zero value in it if we encounter the index of that array in 
//original array
// time complexity is O(n) and space complexity is o(n)
