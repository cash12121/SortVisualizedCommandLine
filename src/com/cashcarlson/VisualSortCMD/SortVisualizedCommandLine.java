	package com.cashcarlson.VisualSortCMD;

import java.util.Scanner;

/**
 * Name: SortVisualizeCommandLine.java
 * Date: 2019-03-20
 * Description:
 * 
 * SortVisualizeCommandLine is the main method to run the program for
 * the command line visualizer
 * It's made to handle user input, the main menu, and call methods.
 * 
 * @author Cash Carlson
 */
public class SortVisualizedCommandLine {
    public static void main(String[] args) {
	//Making a scanner object for user input later.
	Scanner scan = new Scanner(System.in);
	
	//Creating userInput variable for scanner later.
	int userInput;
		
	do {
	    SortArray sArray = new SortArray();
	    
            System.out.println("\n*** MENU ***");
            System.out.println("1. Bubble Sort");
	    System.out.println("2. Insertion Sort");
            System.out.println("5. Quit");
            System.out.print("\nPlease make a choice: ");
            
            userInput = scan.nextInt();
            
            switch(userInput) {
                case 1:
		    System.out.println("\nStarting Bubble Sort...\n");
		    System.out.println("\nOriginal Array:\n");
		    System.out.println(sArray.printArray());
		    BubbleSort bSort = new BubbleSort(sArray.sendArray());
		    bSort.getClass();
		    System.out.println(sArray.printArray());
                    break;
		case 2:
		    System.out.println("\nStarting Insertion Sort...\n");
		    System.out.println("\nOriginal Array:\n");
		    System.out.println(sArray.printArray());
		    InsertionSort iSort = new InsertionSort(sArray.sendArray());
		    iSort.getClass();
		    System.out.println("\nSorted Array:\n" + 
			    sArray.printArray());
		    break;
                case 5:
                    System.out.println("Thank you for using my program.");
                    break;
                default: 
                    System.out.println("\nInvaild Input. Please Try Again.");
                    break; 
                    
            }
        } while (userInput != 5);
    }
}
