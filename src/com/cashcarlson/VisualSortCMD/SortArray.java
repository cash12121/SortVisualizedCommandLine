package com.cashcarlson.VisualSortCMD;

/**
 *
 * @author Cash Carlson
 */
public class SortArray {
    private int[] array;
    
    public SortArray() {
	array = new int[10];
	
	//Fill array with random numbers
	for(int i = 0; i < array.length; i++) {
	    //fill array index of i with a int from 0 to 100
	    array[i] = (int)(101 * Math.random());
	}
    }
    
    public String printArray() {
	String print = "|";
	for(int i = 0; i < array.length; i++) {
	    print += " " + array[i] + " |";
	}
	return print;
    }
    
    public int[] sendArray() {
	return array;
    }
}
