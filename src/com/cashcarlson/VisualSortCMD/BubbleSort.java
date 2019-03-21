package com.cashcarlson.VisualSortCMD;

/**
 * This is a class called BubbleSort
 * It's made to the process of bubble sort
 * Bubble sort compares the adjacent pair in the Array
 * It checks if it's current number is bigger than the pair
 * If it's not bigger than it's pair it moves on to the next number in the array
 * it repeats this process until the Array is sorted
 * 
 * @author Cash Carlson
 */
public class BubbleSort {
    public BubbleSort(int[] array) {
	int len = array.length;
	
	for(int i = 0; i < len - 1; i++) {
	    for(int j = 0; j < len - i -1; j++) {
		System.out.println("\nComparing " + array[j] + " if is greater "
			+ "than " + array[j+1]);
		if(array[j] > array[j+1]) {
		    System.out.println("\n" + array[j] + " is bigger. "
			    + "Now swapping");
		    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
		}
		else {
		    System.out.println("\n" + array[j] + " is not bigger. "
			    + "Moving to the next number");
		}
	    }
	}
	System.out.println("\nArray is now sorted. Printing sorted Array: \n");
    }
}
