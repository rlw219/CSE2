/*
Rebecca Woods
CSE2
October 16, 2015
Stats Java Program

    Purpose: Computes the mean and median from the 5 doubles 
             inputted from the user, smallest to largest
*/

import java.util.Scanner; //imports scanner


public class Stats {
    
    //mean method
    public static double mean(double first, double second, double third, double fourth, double fifth) {
        
        double mean = (first + second + third + fourth + fifth)/5; //calculates mean value
        return mean; //returns mean value
    } //end of mean method
    
    //median method
    public static double median(double first, double second, double third, double fourth, double fifth) {
        
        double median = third; //calculates median value as equal to third value, since there will always be 5 inputs
        return median; //returns median value
    } //end of median method
    
    //main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
        
        System.out.println("Input five numbers, smallest to largest: ");
        
        double first = myScanner.nextDouble(); //declares variable first
        
        double second = myScanner.nextDouble(); //declares variable second
        
        while (second<first) {
            
                System.out.print("ERROR. Please enter a number larger than " + first + ": ");
                second = myScanner.nextDouble(); //reassignment of variable second
           
        } //end of while loop for second<first
        
        double third = myScanner.nextDouble(); //declares variable third
        
        while (third<second) {
           
                System.out.print("ERROR. Please enter a number larger than " + second + ": ");
                third = myScanner.nextDouble(); //reassignment of variable third
            
        } //end of while loop for third<second
        
        double fourth = myScanner.nextDouble(); //declares variable fourth
        
         while (fourth<third) {
           
                System.out.print("ERROR. Please enter a number larger than " + third + ": ");
                fourth = myScanner.nextDouble(); //reassignment of variable fourth
                
        } //end of while loop for fourth<third
        
        double fifth = myScanner.nextDouble(); //declares variable fifth
        
         while (fifth<fourth) {
           
                System.out.print("ERROR. Please enter a number larger than " + fourth + ": ");
                fifth = myScanner.nextDouble(); //reassignment of variable fifth
                
        } //end of while loop for fifth<fourth
        
        double meanValue = mean(first, second, third, fourth, fifth); //declares meanValue from mean method
        double medianValue = median(first, second, third, fourth, fifth); //declares medianValue from median method
        
        System.out.println("Mean value of five values is: " + meanValue); //prints mean value
        System.out.println("Median value of five values is: " + medianValue); //prints median value
        
    } //end of main method
} //end of class