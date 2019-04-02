package com.cashcarlson.VisualSortCMD;

/**
 * Name: InsertionSort.java
 * Date: 2019-04-02
 * Description: 
 * 
 * To be written...
 *
 * @author Cash Carlson
 */
public class InsertionSort {
    public InsertionSort(int[] array) {
	int length = array.length;
	for(int i = 1; i < length; i++) {
	    int point = array[i];
	    int before = i - 1;
	    
	    // run while before is greater than 0 and array at the index of
	    // before is greater than point's value
	    while(before >= 0 && array[before] > point) {
		array[before + 1] = array[before];
		System.out.println(array[before] + " is bigger than " + point + 
			    " now inserting.");
		before -= 1;
	    }
	    
	    array[before + 1] = point;
	}
    }
}
