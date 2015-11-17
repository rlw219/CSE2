/*
Rebecca Woods
CSE2
November 17, 2015
Transpose Java Program

    Purpose: to implement matrix transposition on random matrices
*/

import java.util.Scanner; //imports scanner

public class Transpose {
    
    //random matrix size method
    public static int[][] randomMatrix(int inputWidth, int inputLength) {
            
        int[][] matrix = new int [inputLength][inputWidth];
    
        for (int i=0; i<inputLength; i++) { //for loop to fill columns
            for (int j=0; j<inputWidth; j++) { //for toop to fill rows
                matrix[i][j] = (int)(Math.random()*20)-10; //random number generator for matrix values
            } //end of for loop to fill rows
        } //end of for loop to fill columns
        
    
    return matrix;
    
    
    
    } //end of randomMatrix method
    
    //printMatrix method
    public static void printMatrix(int[][] matrix) {
        
        for (int i=0; i<matrix.length; i++) {
            if (i==0 || matrix[i].length == matrix[i-1].length){
                for (int j=0; j<matrix[i].length; j++) {
                    if (matrix[i][j] < 0 && matrix[i][j] != -10 || matrix[i][j] == 10){
                        System.out.print(" " + matrix[i][j] + " ");
                    }
                    else if (matrix[i][j] >= 0 ){
                        System.out.print("  " + matrix[i][j] + " ");
                    }
                    else if (matrix[i][j] == -10){
                        System.out.print(matrix[i][j] + " ");
                    }
                } //end of width print loop
                
                System.out.println(""); //line break
            } //end of if statement for matrix
            else { //else statement to check for ragged array
                System.out.println("ERROR. Ragged array."); //error for ragged array
            } //end of else to check for ragged array
            
        } //end of length print loop
        
        
    } //end of printMatrix method
    
    //transpose matrix method
    public static int[][] transposeMatrix(int[][]matrix) {
        
        int [][] temp = new int [matrix[0].length][matrix.length];
        
        for (int i=0; i<temp.length; i++) {
            for (int j=0; j<temp[i].length; j++) {
                temp[i][j] = matrix[j][i];
                
            }
        }
        return temp;
        
    } //end of transposeMatrix method
    
    
    //main method required for all java programs
    public static void main(String[] args) {
        
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
        int Width = 0; //initializes Width
        int Length = 0; //initializes Length
        System.out.print("Please enter the width of the matrix: ");

            boolean acceptable = false;
            while (!acceptable) { //loop for width value check
            
                if (myScanner.hasNextInt()){ //if statement for value greater than 0
                    Width = myScanner.nextInt();
                    if (Width > 0) {
                        acceptable = true;
                    } //end of if statement for value greater than 0
                    else {
                        System.out.println("ERROR. Please enter a positive number: ");
                        myScanner.nextLine();
                    }
            } //if statement for int value
            else {
                System.out.println("ERROR. Please enter an integer: ");
                myScanner.nextLine();
            }
        } //while loop for width value check
        
        System.out.print("Please enter the length of the matrix: ");
        
        acceptable = false;
            while (!acceptable) { //loop for length value check
            
                if (myScanner.hasNextInt()){ //if statement for value greater than 0
                    Length = myScanner.nextInt();
                    if (Length > 0) {
                        acceptable = true;
                    } //end of if statement for value greater than 0
                    else {
                        System.out.println("ERROR. Please enter a positive number: ");
                        myScanner.nextLine();
                    }
            } //if statement for int value
            else {
                System.out.println("ERROR. Please enter an integer: ");
                myScanner.nextLine();
            }
        } //while loop for length value check
        
        System.out.println("Matrix (row-major): ");
        int [][] matrix = randomMatrix(Width, Length); //calls method randomMatrix
        printMatrix(matrix); //prints matrix
        
        System.out.println("Matrix (column-major): ");
        int [][] columnMatrix = transposeMatrix(matrix); //changes matrix from row-major to column-major
        printMatrix(columnMatrix); //prints new column-major matrix
        
    } //end of main method
} //end of class