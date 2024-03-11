package telran.arrays;

import java.util.Arrays;

public class ArrayChar {
	
	private char[] array;
	
	public ArrayChar(char[] array) {
		this.array = Arrays.copyOf(array, array.length);
	}
	
	public int compareTo(ArrayChar other) {
		return compareCommon(other, false);
	}
	
	public int compareToIgnoreCase(ArrayChar other) {
		return compareCommon(other, true);
	}
	
	private int compareCommon(ArrayChar other, boolean ignoreCase) {
		int length = Math.min(this.array.length, other.array.length);
		int index = 0;
		int diffValue = 0;
		while(index < length && (diffValue = diff(other, index, ignoreCase)) == 0) {
			index++;
		}
		return index == length ? this.array.length - other.array.length :
			diffValue;
	}

	private int diff(ArrayChar other, int index, boolean ignoreCase) {
		char originValue = array[index];
		char otherValue = other.array[index];
		if (ignoreCase) {
			originValue = Character.toLowerCase(originValue);
			otherValue = Character.toLowerCase(otherValue);
		}
		return originValue - otherValue;
	}

	public int indexOf(char character) {
		int index = 0;
		while(index < array.length && array[index] != character) {
			index++;
		}
		return index == array.length ? -1 : index;
	}
	
	public int lastIndexOf(char character) {
		int index = array.length - 1;
		while (index > -1 && array[index] != character) {
			index--;
		}
		return index;
	}
	
	public int count(char character) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
			}
		}
		return count;
	}
		
	public boolean contains(char character) {
		return indexOf(character) > -1;
	}
	
	public boolean equals(ArrayChar other) {
		return other != null && compareTo(other) == 0;
	}
	
	public boolean equalsIgnoreCase(ArrayChar other) {
		return other != null && compareToIgnoreCase(other) == 0;
	}	
}
