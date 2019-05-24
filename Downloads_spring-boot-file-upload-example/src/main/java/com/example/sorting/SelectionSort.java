package com.example.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int arraySize=11;
		Sort sort=new Sort(arraySize);
		sort.insert(24);
		sort.insert(87);
		sort.insert(2);
		sort.insert(5);
		sort.insert(1);
		sort.insert(99);
		sort.insert(12);
		sort.insert(999);
		sort.insert(-1);
		System.out.print("Here is our initial array: ");
		sort.log();

		sort.selectionSort();

		System.err.print("Here is our final array after selection sort: ");
		sort.log();
	}
	
	
}
