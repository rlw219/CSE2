/*
Rebecca Woods
CSE2
October 9, 2015
Encrypted X Jave Program

    Purpose: To display a hidden message "X"
*/

import java.util.Scanner; //imports scanner

public class encrypted_x {
    //main method required for all java programs
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
        int input = 0;
        
        boolean acceptable = false;
        System.out.print("Please input an integer between 0 and 100: ");
        while(!acceptable){
            if(myScanner.hasNextInt()){
                input = myScanner.nextInt();
                acceptable = true;
                
                if (input>0 && input<100){
                continue;
                }
                else {
                    acceptable = false;
                   System.out.print("    ERROR: need an integer\n Input your integer between 0-100: ");
                }
            }
            else {
                System.out.print("    ERROR: need an integer\n Input your integer between 0-100: ");
                myScanner.next();
            }
            
        
        } //end of while loop
        
        for (int i=0; i<input; i++){
            
            for (int j=0; j<input; j++){
                if (i==j || i==(input-j-1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            } //end of inner loop
            System.out.println("");
        } //end of outer loop
        
        
        
    } //end of main method
} //end of class