package com.revature.list;

public class MyArrayList {
	
	private int [] arr = new int [10];
	//private int size = 1;
	private int counter = 0;
	
	//create an "expand" method that enables us to create a "doubled" version of old array
	//for when the old array is filled
	private void expand() {
		int [] newArr = new int [arr.length * 2];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
	}

	public void add(int val) {
		if(counter == arr.length -1) {
			expand();
		}
		
		arr[counter] = val;
		counter++;	
	}

	public void set(int index, int val) {
		arr[index] = val;
		
	}

	public void remove(int index) {
		int [] blankArr = new int[counter - 1];
		for(int j = 0; j < index; j++) {
			blankArr[j] = arr[j];
		}
		for(int j = index; j < counter - 1; j++) {
			blankArr[j] = arr[j+1];
		}
		counter--;
		arr = blankArr;
		
		
	}

	public int get(int index) {
		
		return arr[index];
	}

	@Override
	public String toString() {
		StringBuilder arrString = new StringBuilder("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				arrString.append(arr[i]);
				
			}else {
			arrString.append(arr[i] + ", ");
			}
		}
		arrString.append("]");
		String newString = new String(arrString);
		
		
		return newString;
	}
}
