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
	
}
