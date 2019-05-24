package com.example.sorting;

public class Sort {
	private int[] obj;
	private int index;
	public Sort(int size) {
		
		this.obj=new int[size];
		this.index=0;
	}
	public void insert(int value) {
		obj[index++]=value;
	}
	private void swap(int position1, int position2) {
		int tmp = obj[position1];
		obj[position1] = obj[position2];
		obj[position2] = tmp;
	}
	public void selectionSort() {
		int outerObj;
		int innerObj;
		int minObj;
 
		// Counter to print iteration
		int counter = 1;
		for (outerObj = 0; outerObj < index - 1; outerObj++) {
			minObj = outerObj;
			for (innerObj = outerObj + 1; innerObj < index; innerObj++)
				if (obj[innerObj] < obj[minObj]) {
 
					minObj = innerObj;
				}
			swap(outerObj, minObj); // swap an object
 
			// Let's print array after each iteration
			log("Iteration " + counter);
			counter++;
		}
		
	}
	private void log(String string) {
		System.out.println(" ========= " + string + " ========= ");
	
		log();
	}
	public void log() {
		for (int i = 0; i < index; i++)
			System.out.print(obj[i] + " ");
		System.out.println("\n");
	}
}
