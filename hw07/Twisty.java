/*
Rebecca Woods
CSE2
October 11, 2015
Twisty Java Program

    Purpose: to practice writing while, for, and do-while loops
*/

import java.util.Scanner; //imports scanner

public class Twisty {
    //main method required for all java programs
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
        int length = 0; //declares length
        int width = 0; //declares width
        
        boolean acceptable = false;
        System.out.print("Input your desired length between 1-80: "); //asks user for length
        
        while(!acceptable){
            if(myScanner.hasNextInt()){
                length = myScanner.nextInt();
                acceptable = true;
                
                if (length>0 && length<81){
                continue;
                }
                else {
                    acceptable = false;
                   System.out.print("    ERROR: please type in a positive integer between 1-80.\n Input your desired length: ");
                }
            }
            else {
                System.out.print("    ERROR: please type in an integer.\n Input your desired length: ");
                myScanner.next();
            }
            
        } //end of length while loop
        
            acceptable = false; //reverts acceptable back to false 
            System.out.print("Input your desired width: "); //asks user for width
            
            while(!acceptable){
            if(myScanner.hasNextInt()){
                width = myScanner.nextInt();
                acceptable = true;
                
                if (width>0 && width<=length){
                continue;
                }
                else {
                    acceptable = false;
                   System.out.print("    ERROR: please type in a positive integer less than length.\n Input your desired width: ");
                }
            }
            else {
                System.out.print("    ERROR: please type in an integer.\n Input your desired width: ");
                myScanner.next();
            }
            
        } //end of width while loop
        int k = 0;
        int l = 1;
        int n = 0;
        int m = 1;
        if (width%2==0){
        for (int i=0; i<width; i++){
            
            for (int j=0; j<length; j++){
                if (j==k*width+i || j==m*width-i-1 || j==l*width+i || j==(n+2)*width-i-1){
                    
                    if (j==k*width+i){ //down right #
                        System.out.print("#");
                        k+=2;
                    }
                    if (j==(n+2)*width-i-1){ //up right #
                        System.out.print("#");
                        n+=2;
                        
                    }
                    if (j==m*width-i-1){ //up right /
                        System.out.print("/");
                        m+=2;
                    }
                    if (j==l*width+i){ //down right \
                        System.out.print("\\");
                        l+=2;
                    }
                    
                }
                else {
                    System.out.print(" ");
                }
            } //end of inner loop
            System.out.println("");
            k = 0;
            l = 1;
            n = 0;
            m = 1;
           
            
        } //end of outer loop
        
        } //end of if statement
        else {
            
            k = 0;
            l = 1;
            n = 0;
            m = 1;
        
        for (int i=0; i<width; i++){
            
            for (int j=0; j<length; j++){
                if (j==k*width+i || j==m*width-i-1 || j==l*width+i || j==(n+2)*width-i-1){
                    if (j==k*width+i && j==m*width-i-1) {
                        System.out.print("#");
                        k+=2;
                        m+=2;
                    }
                    if (j==(n+2)*width-i-1 && j==l*width+i) {
                        System.out.print("\\");
                        n+=2;
                        l+=2;
                    }
                    else {
                        if (j==k*width+i && j!=m*width-i-1){ //down right #
                            System.out.print("#");
                            k+=2;
                        }
                        if (j==(n+2)*width-i-1 && j!=l*width+i){ //up right #
                            System.out.print("#");
                            n+=2;
                        
                        }
                        if (j==m*width-i-1 && j!=k*width+i){ //up right /
                            System.out.print("/");
                            m+=2;
                        }
                        if (j==l*width+i && j!=(n+2)*width-i-1){ //down right \
                            System.out.print("\\");
                            l+=2;
                        }
                    }
                }
                else {
                    System.out.print(" ");
                }
            } //end of inner loop
            System.out.println("");
            k = 0;
            l = 1;
            n = 0;
            m = 1;
           
            
        } //end of outer loop
        
        } //end of if statement
        
    } //end of main method
} //end of class