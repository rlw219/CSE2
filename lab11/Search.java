/*
Rebecca Woods
CSE2
November 6th, 2015
Search Java PRogram

    Purpose: perform linear and binary searches on large arrays
*/

import java.util.Scanner; //imports scanner

public class Search { //creates class search

    //main method required for all java programs
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
        
        int [] array1 = new int [5000]; //creates array1
        int [] array2 = new int [5000]; //creates array2
        
        
        
        //array1:
        
        
        for (int i=0; i<5000; i++) { //loop to fill array1
            array1[i] = (int) ((Math.random()*100000)+0); //fills array1 with random numbers between 0-100000
        } //end of for loop for filling array1
        
        int min1 = array1[0]; //declares min of array1
        int max1 = array1[0]; //declares max of array1
        
        //finds max
        for(int i=0; i<5000; i++) {
    
            if (array1[i]>max1) {
                max1 = array1[i];
            } //if statement to change max1 to highest value from array
        } //end of max loop
        System.out.println("The maximum of array1 is: " + max1); //prints max value for array1
        
        //finds min
        for(int i=0; i<5000; i++) {
            
            if (array1[i]<min1) {
                min1 = array1[i];
            } //if statement to change min1 to lowest value from array
        } //end of min loop
        System.out.println("The minimum of array1 is: " + min1); //prints min value for array1
        
        
        
        //array2:
        
        
        array2[0] = (int) ((Math.random()*20)+0); //random number between 0-20 generated for array2[0]
        
        for (int i=1, l=(array2[0]+20); i<5000 && l<100000; i++, l+=20) { //loop to fill array2
            
            array2[i] = (int) (Math.random()*(l-array2[i-1])+(array2[i-1])); //random increasing value for array2[i]
            
        } //end of for loop for filling array2
        
        System.out.println("The maximum of array2 is: " + array2[4999]); //shows max for array2
        System.out.println("The minimum of array2 is: " + array2[0]); //shows min for array2

       
       
        /*
        for (int i=0; i<5000; i++) { //for loop for printing numbers in array2
            System.out.print(array2[i] + " "); //prints number
            if (i==(array2.length)-1) { //stops printing past array length
                break; //breaks loop
            } //end of if statement for array length
        } //end of for loop for printing
        System.out.println(""); //line break
        */
        //used to test ordered random number generator
        
        
        
        System.out.print("Enter an int >= 0: "); //asks user for input
        int input = myScanner.nextInt(); 
        
        if (input<0) { //exits program if invalid input (less than zero)
            System.exit(0);
            
        } //end of if statement to exit program if invalid input
        
        
        
        int low = 0;
        int high = (5000-1);
        int mid = (int) ((high - low)/2 + low);
        
        while (low <= high) { //binary loop
            
            if (input < array2[0]) { //if statement for input < low
                    System.out.println(input + " was not found in the list");
                    System.out.println("The number above the key was " + array2[low]);
                    System.out.println("The number below the key was none");
                    System.exit(0);
                    
            } //end of if statement for input < low
            if (input > array2[4999]) { //if statement for input > high
                    System.out.println(input + " was not found in the list");
                    System.out.println("The number above the key was none");
                    System.out.println("The number below the key was " + array2[high]);
                    System.exit(0);
                    
            } //end of if statement for input > high
            
            if (input < array2[mid]) { //if statement to change (mid value -1) to new high
                high = (int) mid-1;
                //System.out.println(" high " + array2[high] + ";"); //used to test loop
                
            } //end of if statement to change (mid value -1) to new high
            else if (input == array2[mid]) { //if statement for input being equal to mid
                System.out.println(input + " was found in the list");
                System.exit(0);
                
            } //end of if statement for input equal to mid
            else { //else statement to change (mid value +1) to new low
                low = (int) mid+1;
                //System.out.println(" low " + array2[low] + ";"); //used to test loop
                
            } //end of else statement to (mid value +1) to new low
            
            
            mid = (int) ((high - low)/2 + low); //changes mid to new value between high and low
            
        } //end of for loop for binary
        
            if (low > high) { //if statement for input between low and high that is not found (must be flipped, see below)
                System.out.println(input + " was not found in the list");
                System.out.println("The number above the key was " + array2[low]);  //must be flipped because binary loop causes high and low
                System.out.println("The number below the key was " + array2[high]); //to go too far, causing low > high
                
            } //end of if statement for input between low and high that is not found
        
    } //end of main method
} //end of class
    