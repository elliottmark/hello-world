package funWithArrays;

import static java.time.Duration.ofMillis;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;

/**
 * @author Mark Elliott
 * @version 1.0
 * 
 * This is the jUnit test suite for the FunWithArrays class. These tests
 * verify the proper functionality of arrays, including correct processing
 * of unsorted data, duplicates, insertion, basic performance
 * requirements and exception handling.
 */

public class FunWithArraysTest {
	
	/**
	 * Test_AscendingSort; tests the ascendingSort method 
	 * to ensure list is sorted in ascending order
	 * 
	 * input = unsorted list of integers
	 * output = sorted list ascending
	 * compare = expected sorted list matches output
	 */

	@Test
	public void Test_AscendingSort() {
		int[] preSort = new int[] {7,2,70,8,1}; // unsorted list
		int[] expectedResult = new int[] {1,2,7,8,70}; // sorted list
		int[] compare = new int[5]; // list used to compare
		
		compare = FunWithArrays.ascendingSort(preSort);
		assertArrayEquals(expectedResult,compare);
	}
	
	
	/**
	 * Test_DescendingSort; tests the descendingSort method
	 * to ensure list is sorted in descending order
	 * 
	 * input = unsorted list of integers
	 * output = sorted list of descending
	 * compare = expected sorted list matches output
	 */
	
	@Test
	public void Test_DescendingSort() {
		int[] preSort = new int[] {7,2,70,8,1}; // unsorted list
		int[] expectedResult = new int[] {70,8,7,2,1}; // sorted list
		int[] compare = new int[5]; // list used to compare
		
		compare = FunWithArrays.descendingSort(preSort);
		assertArrayEquals(expectedResult,compare);
	}

	
	/**
	 * Test_insertLastPosition: tests the insertLast method
	 * to ensure the new integer has been inserted into the last
	 * position of the array
	 * 
	 * input = list of integers
	 * output = list of integers +1 added to the last element
	 * compare = expected list matches output
	 */
	
	@Test
	public void Test_InsertLastPosition() {
		
		int num = 88; // number to insert in the last position
		int[] preInsertArray = new int[] {7,2,70,8,1}; // unsorted list
		int[] expectedResult = new int[] {7,2,70,8,1,88}; // sorted list
		int[] compare = new int[preInsertArray.length+1]; // list used to compare
		
		compare = FunWithArrays.insertLast(preInsertArray, num);
		assertArrayEquals(expectedResult, compare);
	}
	
	
	/**
	 * Test_insertFirstPosition: tests the insertFirst method
	 * to ensure the new integer has been inserted into the first
	 * position of the array
	 * 
	 * input = list of integers
	 * output = list of integers +1 added to the last element
	 * compare = expected list matches output
	 */
	
	@Test
	public void Test_InsertFirstPosition() {
		
		int num = 88; // number to insert in the last position
		int[] preInsertArray = new int[] {7,2,70,8,1}; // unsorted list
		int[] expectedResult = new int[] {88,7,2,70,8,1}; // sorted list
		int[] compare = new int[preInsertArray.length+1]; // list used to compare
		
		compare = FunWithArrays.insertFront(preInsertArray, num);
		assertArrayEquals(expectedResult, compare);
	}
	
	
	/**
	 * Test_Performance: exercises the ascendingSort method
	 * for abnormal runtime performance issues
	 * 
	 * input = unsorted list of integers
	 * output = sorted list ascending
	 * compare = expected sorted list matches output
	 */
	
	@Test
	// my performance requirement - test must complete in under 20ms
	public void Test_Performance() {
		int[] preSort = new int[] {12,23,4,1,70}; // unsorted list
		int[] expectedResult = new int[] {1,4,12,23,70}; // sorted list
		
		assertTimeout(ofMillis(20), () -> {
			int[] compare = new int[5]; // list used to compare
			for(int i=1; i<100000; i++) {
				compare = FunWithArrays.ascendingSort(preSort);
				assertArrayEquals(expectedResult,compare);
			}
		});
	}
	
	
	/**
	 * Test_EmptyArray: tests ascendingSort method 
	 * to ensure empty list is handled if mistakenly passed
	 * 
	 * input = unsorted list of integers
	 * output = sorted list ascending
	 * compare = not used
	 */
	
	@Test
	public void Test_EmptyArray() {
		
		int[] preSort = {};
		int[] expectedResult = {};
		int[] compare = FunWithArrays.ascendingSort(preSort);
		assertArrayEquals(expectedResult, compare);
	}
	
	
	/**
	 * Test_SearchForNumber: tests searchFor method
	 * to ensure the searched for number is found
	 * 
	 * input = unsorted list of integers
	 * output = sorted list ascending
	 * compare = expected sorted list matches output
	 */
	
	@Test
	public void Test_SearchForNumber() {
		
		int num = 70;
		int[] preSort = new int[] {7,2,70,8,1}; // unsorted list
		boolean expectedResult = true; // return true if num is found
		
		boolean compare = FunWithArrays.searchFor(preSort, num);
		assertEquals(expectedResult, compare); // boolean comparison
	}
}
