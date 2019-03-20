package com.cashcarlson.VisualSortCMD;

/**
 *
 * @author Cash Carlson
 */
public class BubbleSort {
    public BubbleSort(int[] array) {
	int len = array.length;
	
	for(int i = 0; i < len - 1; i++) {
	    for(int j = 0; j < len - i -1; j++) {
		System.out.println("\n comparing " + array[j] + " if is greater "
			+ "than " + array[j+1]);
		if(array[j] > array[j+1]) {
		    System.out.println("\n" + array[j] + " is bigger. "
			    + "Now swapping");
		    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
		}
	    }
	}
    }
}
