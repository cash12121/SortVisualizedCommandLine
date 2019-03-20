/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cashcarlson.VisualSortCMD;

/**
 *
 * @author Cash Carlson
 */
public class SortVisualizedCommandLine {
    public static void main(String[] args) {
	SortArray sArray = new SortArray();
	
	System.out.println(sArray.printArray());
	BubbleSort bSort = new BubbleSort(sArray.sendArray());
	bSort.getClass();
	System.out.println(sArray.printArray());
    }
}
