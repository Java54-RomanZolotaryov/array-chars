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
	
	@Test
	void testCount() {
		char[] arr1 = {'1', '2', '3', '2'};
		ArrayChar arrayChar = new ArrayChar(arr1);
		assertEquals(2, arrayChar.count('2'));
		assertEquals(1, arrayChar.count('1'));
		assertEquals(0, arrayChar.count('9'));
	}
	
	@Test
	void testCompareToIgnoreCase() {
		char[] arr1 = {'h','e','l','l'};
		char[] arr2 = {'H','E','L','l'};
		char[] arr3 = {'H','e'};
		ArrayChar arrayChar1 = new ArrayChar(arr1);
		ArrayChar arrayChar2 = new ArrayChar(arr2);
		ArrayChar arrayChar3 = new ArrayChar(arr3);
		assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar2));
		assertEquals(2, arrayChar2.compareToIgnoreCase(arrayChar3));
		assertEquals(2, arrayChar1.compareToIgnoreCase(arrayChar3));
		assertEquals(-2, new ArrayChar(new char[0]).compareToIgnoreCase(arrayChar3));
	}
	
	@Test
	void containsTest() {
		char[] arr = {'h','E','L','l'};
		ArrayChar arrayChar = new ArrayChar(arr);
		assertTrue(arrayChar.contains('h'));
		assertTrue(arrayChar.contains('E'));
		assertFalse(arrayChar.contains('e'));
		assertFalse(arrayChar.contains('\0'));
	}
	
	@Test
	void equalsTest() {
		char[] arr1 = {'h','E','L','l'};
		char[] arr2 = {'h','E','L','l'};
		char[] arr3 = {'h','e','L'};
		ArrayChar arrayChar1 = new ArrayChar(arr1);
		ArrayChar arrayChar2 = new ArrayChar(arr2);
		ArrayChar arrayChar3 = new ArrayChar(arr3);
		assertTrue(arrayChar2.equals(arrayChar1));
		assertFalse(arrayChar3.equals(arrayChar1));
	}
	
	@Test
	void equalsIgnoreCase() {
		char[] arr1 = {'H','E','l','L'};
		char[] arr2 = {'h','e','L','l'};
		char[] arr3 = {'h','e','L','o'};
		ArrayChar arrayChar1 = new ArrayChar(arr1);
		ArrayChar arrayChar2 = new ArrayChar(arr2);
		ArrayChar arrayChar3 = new ArrayChar(arr3);
		assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
		assertFalse(arrayChar3.equalsIgnoreCase(arrayChar2));
	}

}
