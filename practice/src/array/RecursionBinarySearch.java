package array;

import java.util.Scanner;

public class RecursionBinarySearch {
	
	void binary_search(int min,int max,int key,int[]ar) {
		
		boolean b=true;
		if(b==true){
			
			int mid = (min + max) / 2;
			if (key == ar[mid]) {
				System.out.println(key+" present at index " + mid);
				b = false;
			} 
			else if (key <ar[mid]) {
				//max = mid - 1;
				binary_search(min,mid - 1,key,ar);
				                //max
			}
			else {
				//min = mid + 1;
				binary_search(mid+1,max,key,ar);
				               //min
			}
			if(min>max) {
				System.out.println("Given number is not present");
			}	
		}
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RecursionBinarySearch r=new RecursionBinarySearch()	;
		int ar[] = { 5, 8, 9, 12, 15};
		    //index: 0  1  2   3   4
		System.out.println("ENTER THE KEY VALUE :");
		int key=sc.nextInt();
        r.binary_search(0  , ar.length-1, key , ar);
                  //    min ,   max     , key ,array
	}

}