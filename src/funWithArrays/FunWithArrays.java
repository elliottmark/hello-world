package funWithArrays;

//import java.util.Random;

/**
 * FunWithArrays: Creates an array filled manually (default) or with 
 * random integers. Several helper methods do fun things (ie: sorting,
 * search for integers, insert integer into an array...)
 * 
 * @author Mark Elliott
 * @version 1.0
 *
 */

public class FunWithArrays {
	
	final int [] s = new int [5]; 
	
	// used in insertFront/Back methods
	final int [] t = new int [s.length+1];
	
	// used in main
	int [] newArray = new int [s.length];
	
	FunWithArrays() {
		
		// fill static array randomly
		//Random rand = new Random();
		//for(int i=0; i<s.length; i++) {
		    //s[i] = rand.nextInt(100);
		//}
		
		// fill static array manually
		s[0] = 7;
		s[1] = 2;
		s[2] = 70;
		s[3] = 8;
		s[4] = 1;
		
		System.out.println("Array created and manually populated");
	}
	
	
	/**
	 * searchFor method searches the input array for a specified integer
	 * 
	 * @param a array to search
	 * @param n number to look for
	 * @return true or false
	 */
	
	public static boolean searchFor (int [] a, int n) {
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == n) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * PrintArray method
	 * 
	 * @param a array to print
	 */
	
	public static void printArray(int [] a) {
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	
	
	/**
	 * Ascending sort method sort the array 2 ways (easy or hard)
	 * 
	 * @param a array to work on
	 * @return sortedArrayAscending
	 */
	
	public static int [] ascendingSort(int [] a) {
		
		// easy way - work on array s > start at 0 > sort to s.length
		//Arrays.sort(s, 0, s.length);
		
		// hard way
		int temp;
		int n = a.length;
		
		// outside loop
		for(int i=0; i<n; i++) {
			//inside loop
			for(int j=1; j<n-i; j++) {
				if (a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return(a);
	}
	
	
	/**
	 * Descending sort method manually sorts array
	 * 
	 * @param a array to work on
	 * @return sortedDescendingArray
	 */

	public static int [] descendingSort(int [] a) {
		
		// bubble sort
		int temp;
		int n = a.length;
		
		// outside loop
		for(int i=0; i<n; i++) {
			//inside loop
			for(int j=1; j<n-i; j++) {
				if (a[j-1] < a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return(a);
	}

	
	/**
	 * insertLast method: inserts the input number into the last element
	 * of the array
	 * 
	 * @param a array to work on
	 * @param n number to add to the last position of the array
	 * @return newArray
	 */
	
	public static int [] insertLast(int [] a, int n) {
		
		int [] na = new int [a.length+1];
		
		for (int i=0; i<a.length; i++) {
			na[i] = a[i]; // copy elements of array s to array t
		}
		na[a.length] = n; // add n to the end of the array
		return(na);
	}
	
	
	/**
	 * insertFront method: inserts the number into the first element
	 * of the array
	 * 
	 * @param a array to work on
	 * @param n number to insert into the first position
	 * @return newArray
	 */
	
	public static int [] insertFront(int [] a, int n) {
		
		int [] na = new int [a.length+1];
		
		na[0] = n; // add n to the front of the array
		for (int i=0; i<a.length; i++) {
			na[i+1] = a[i]; // copy elements of array a to array na
		}
		return(na);
	}
	

	public static void main(String[] args) {
		
		int num = 70; 		// number to search for in the array
		int insert = 21; 	// number to insert
		
		FunWithArrays fun = new FunWithArrays();
		
		printArray(fun.s);
		searchFor(fun.s,num);
		descendingSort(fun.s);
		printArray(fun.s);
		ascendingSort(fun.s);
		printArray(fun.s);
		fun.newArray = insertLast(fun.s,insert);
		printArray(fun.newArray);
	}
}
