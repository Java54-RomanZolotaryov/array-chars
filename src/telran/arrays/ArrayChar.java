package telran.arrays;

public class ArrayChar {
	private char[] array;
	
	public ArrayChar(char[] array) {
		this.array = array;
	}
	
	public int compareTo(ArrayChar other) {
		int length = Math.min(this.array.length, other.array.length);
		int index = 0;
		while(index < length && this.array[index] == other.array[index]) {
			index++;
		}
		return index == length ? this.array.length - other.array.length :
			this.array[index] - other.array[index];
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
	
	public int compareToIgnoreCase(ArrayChar other) {
		int length = Math.min(this.array.length, other.array.length);
		int index = 0;
		
		//We use bitwise operator '^(XOR)' to compare characters with case ignored
		//However only works in scope of ASCII Table codes
		while(index < length && (this.array[index] == other.array[index] || this.array[index] == (other.array[index] ^ 32))) {
			index++;
		}
		return index == length ? this.array.length - other.array.length :
			this.array[index] - other.array[index];
	}
	
	public boolean contains(char character) {
		return indexOf(character) != -1;
	}
	
	public boolean equals(ArrayChar other) {
		return compareTo(other) == 0;
	}
	
	public boolean equalsIgnoreCase(ArrayChar other) {
		return compareToIgnoreCase(other) == 0;
	}	
}
