/*
Rebecca Woods
CSE2
Oct 30, 2015
Lab10
    Purpose: practice arrays
    
*/

import java.util.Scanner; //imports scanner

public class Arrays {
    
    //main method required for all java programs
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in); //declares scanner
    
    int size = (int)((Math.random()*5)+5);
    String [] students = new String [size]; //creates array of students
    
    int [] midterm = new int [size]; //creates array of midterms

    
    System.out.println("Enter " + size + " student names:");
    
    for (int i=0; i<size; i++) {
        students [i] = myScanner.nextLine();
    } //end of for loop for students
    
    System.out.println("Here are the midterm grades of the " + size + " students above:");
    for (int i=0; i<size; i++) {
            int grade = (int)((Math.random()*100)+0);
            midterm [i] = grade;
            System.out.println(students [i] + " : " + midterm [i]);
    } //end of for loop for grades
    
    
    
    } //end of main method
} //end of class