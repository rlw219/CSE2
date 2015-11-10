/*
Rebecca Woods
CSE2
November 8, 2015
CSE2Linear Java Program

    Purpose: searching single dimensional arrays
*/

import java.util.Scanner; //imports scanner
import java.util.Random; //imports random number generator

public class CSE2Linear {
    
    //scramble method
    public static int[] scramble(int[] list) {
        
        Random randomGenerator = new Random(); //creates random number
        int j = 1; //declares variable j
        
        for (int k=0; k<45; k++) { //for loop for randomizing grade order (shuffles 45 times)
            
            int randomInt = randomGenerator.nextInt(15);
            int temporary = list[0]; //creates temporary string for first value in array
            list[0] = list[j]; //changes first value in array to 'j' value
            list[j] = temporary; //changes 'j' value in array to 0th(temp value)
            j = randomInt; //randomized value j
            } //end of for loop for scrambling grades
        
        return list; //returns scrambled grades
        
    } //end of scramble method
    
    
    //sort method
    public static int[] sort(int[] list) {
        
        int temporary; //creates temporary string for first value in array
        int j; //initializes variable j
        int k; //initialized variable k
        
        for (k=0; k<(14); k++) { //for loop for sorting grades (k, first value for each potential switch)
        
            for (j=k+1; j<(14); j++); { //for loop for j (second value for each potential switch)
                
                if (list[j]<list[k]) { //if statement for list[k]>list[j] (necessary to check if switch is needed)
                    temporary = list[k]; //changes temporary to 'k' value
                    list[k] = list[j]; //changes 'k' value in array to 'j' value
                    list[j] = temporary; //changes 'j' value in array to the 'k' value (temp)
            
                } //end of if statement for list[j]<list[k]
            } //end of for loop for j (second value for each potential switch)
        
        } //end of for loop for sorting grades (k, first value for each potential switch)
        
        return list; //returns scrambled grades
        
    } //end of sort method
    
    
    //binary search method
    public static String binarySearch(int[] list, int input) {
        
        int low = 0;
        int high = (14);
        int mid = (int) ((high - low)/2 + low);
        int count = 0;
        String statement = "";
        
        while (low <= high) { //binary loop
            
            if (input < list[0]) { //if statement for input < low
                    statement = input + " was not found in the list with " + count + " iterations";
                    return statement;
                    
            } //end of if statement for input < low
            if (input > list[14]) { //if statement for input > high
                    statement = input + " was not found in the list with " + count + " iterations";
                    return statement;
                    
            } //end of if statement for input > high
            if (input < list[mid]) { //if statement to change (mid value -1) to new high
                high = (int) mid-1;
                //System.out.println(" high " + array2[high] + ";"); //used to test loop
                
            } //end of if statement to change (mid value -1) to new high
            else if (input == list[mid]) { //if statement for input being equal to mid
                statement = input + " was found in the list with " + count + " iterations";
                return statement;
                
            } //end of if statement for input equal to mid
            else { //else statement to change (mid value +1) to new low
                low = (int) mid+1;
                //System.out.println(" low " + array2[low] + ";"); //used to test loop
                
            } //end of else statement to (mid value +1) to new low
            
            
            mid = (int) ((high - low)/2 + low); //changes mid to new value between high and low
            count++;
            
        } //end of for loop for binary
        
            if (low > high) { //if statement for input between low and high that is not found (must be flipped, see below)
                statement = input + " was not found in the list with " + count + " iterations";
                return statement;
                
            } //end of if statement for input between low and high that is not found
        return statement;
        
    } //end of binarySearch method
    
    
    //linear search method
    public static String linearSearch(int[] list, int input) {
        int i=0;
        int count;
        String statement = "";
        while(i<15) {
            if (list[i] == input) {
                count = i+1;
                statement = input + " was found in the list with " + count + " iterations";
                return statement;
            } //if statement to check for input value in array
            else {
                i++;
            } //else statement to iterate again if value is not found in that array spot
            
        } //end of linear loop
        
        count = 15;
        statement = input + " was not found in the list with " + count + " iterations";
        
        return statement;
        
    } //end of linearSearch method
    
    
    //print method
    public static void print(int[]list) {
        for (int i=0; i<52; i++) { //for loop for printing grades
            System.out.print(list[i] + " "); //prints grade
            if (i==(list.length)-1) { //stops printing past array length
                break; //breaks loop
            } //end of if statement for array length
        } //end of for loop for printing
        System.out.println(""); //line break
    } //end of print method
    
    
    //main method required for all java programs
    public static void main (String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
       
        
        int [] grades = new int [15]; //creates grades array
        
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        
        for (int i=0; i<15; i++) {
            boolean acceptable = false; //creates boolean acceptable
        
                while (!acceptable){ //while loop for grades filling with acceptable values
                    
                    if (myScanner.hasNextInt()){ //checks that value entered can be a int
                        grades[i] = myScanner.nextInt(); //defines grades[i] as the entered int
                        if (grades[i]>=0 && grades[i]<=100) { //if statement for positive number check
                            if (i == 0) { //if statement for first value
                                acceptable = true; //changes acceptable to true
                            } //end of if statement for first value
                            else if (i>0 && grades[i] >= grades[i-1]) { //else if statement for value greater than previous
                                acceptable = true; //changes acceptable to true
                            } //end of else if statement for value greater than previous
                            else { //else statement for value greater than previous
                                System.out.println("ERROR. Please enter a number greater than or equal to " + grades[i-1] + ": ");
                                myScanner.nextLine();
                                } //end of else statement for value being greater than previous
                        } //end of if statement for positive number check
                        else { //else statement for positive number check
                            System.out.println("ERROR. Please enter a positive number in digits between 0 and 100: ");
                            myScanner.nextLine(); //asks again for input
                        } //end of else statement for positive number check
                        
                    } //end of if statement for a int check
                    else { //else statement for a int check
                        System.out.println("ERROR. Please enter a whole number in digits: ");
                        myScanner.nextLine(); //asks again for input
                    } //end of else statement for a int check
                } //end of while loop for filling grades with aceptable values
        
        } //end of for loop to fill grades
        
        System.out.println("Sorted grades: ");
        sort(grades);
        print(grades);
        System.out.print("Please enter a number grade to search: "); //asks user for searech grade
        int search = myScanner.nextInt();
        System.out.println(binarySearch(grades, search));
        System.out.println("Scrambled grades: ");
        scramble(grades);
        print(grades);
        System.out.print("Please enter a number grade to search: "); //asks user for searech grade
        search = myScanner.nextInt();
        System.out.println(linearSearch(grades, search));
        
        
        
        
        
        
    } //end of main method
    
} //end of class
