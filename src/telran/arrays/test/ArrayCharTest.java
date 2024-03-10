package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void testCompareTo() {
		char[] arr1 = {'1', '2', '3'};
		char[] arr2 = {'9'};
		char[] arr3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(arr1);
		ArrayChar arrayChar2 = new ArrayChar(arr2);
		ArrayChar arrayChar3 = new ArrayChar(arr3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a', 'a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}
	
	@Test
	void indexOfTest() {
		char[] arr1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar = new ArrayChar(arr1);
		assertEquals(1, arrayChar.indexOf('2'));
		assertEquals(-1, arrayChar.indexOf('9'));
	}
	
	@Test
	void lastIndexOfTest() {
		char[] arr1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar = new ArrayChar(arr1);
		assertEquals(3, arrayChar.lastIndexOf('2'));
		assertEquals(-1, arrayChar.indexOf('9'));
	}

}
