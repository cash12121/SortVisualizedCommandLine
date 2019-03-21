package com.cashcarlson.VisualSortCMD;

/**
 * SortArray.java is made to create the array for it's planned algorithms
 * It also handles printing the array for the user and sending the array
 * to send the array.
 * 
 * TO DO:
 * -Create helper methods for better maintainable code
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
