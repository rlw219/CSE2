/*
Rebecca Woods
CSE2
October 6, 2015
Check Digit Java Program

    Purpose: Checks digits in an ISBN number
*/

import java.util.Scanner; //imports scanner

public class CheckDigit {
    //main method required for all java programs
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner(System.in); //defines scanner
        
        char oneChar,twoChar,threeChar,fourChar,fiveChar,sixChar,sevenChar,eightChar,nineChar,checkChar; //declares first 9 digits in ISBN
        
        System.out.print("Please enter a 10 digit barcode: "); //prompts user to enter an ISBN number
        String ISBN;
        
        do{
        ISBN= myScanner.next(); 
        
        if(ISBN.length()!=10){ //checks length of ISBN
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
            
        }
        
        } while (ISBN.length()!=10); //condition for rerunning do loop for length
        
        oneChar = ISBN.charAt(0);
        twoChar = ISBN.charAt(1);
        threeChar = ISBN.charAt(2);
        fourChar = ISBN.charAt(3);
        fiveChar = ISBN.charAt(4);
        sixChar = ISBN.charAt(5);
        sevenChar = ISBN.charAt(6);
        eightChar = ISBN.charAt(7);
        nineChar = ISBN.charAt(8);
        checkChar = ISBN.charAt(9);
        
        boolean oneCharValid = (oneChar=='1' || oneChar=='2' || oneChar=='3' || oneChar=='4' || oneChar=='5' || oneChar=='6' || oneChar=='7' || oneChar=='8' || oneChar=='9' || oneChar=='0');
        boolean twoCharValid = (twoChar=='1' || twoChar=='2' || twoChar=='3' || twoChar=='4' || twoChar=='5' || twoChar=='6' || twoChar=='7' || twoChar=='8' || twoChar=='9' || twoChar=='0');
        boolean threeCharValid = (threeChar=='1' || threeChar=='2' || threeChar=='3' || threeChar=='4' || threeChar=='5' || threeChar=='6' || threeChar=='7' || threeChar=='8' || threeChar=='9' || threeChar=='0');
        boolean fourCharValid = (fourChar=='1' || fourChar=='2' || fourChar=='3' || fourChar=='4' || fourChar=='5' || fourChar=='6' || fourChar=='7' || fourChar=='8' || fourChar=='9' || fourChar=='0');
        boolean fiveCharValid = (fiveChar=='1' || fiveChar=='2' || fiveChar=='3' || fiveChar=='4' || fiveChar=='5' || fiveChar=='6' || fiveChar=='7' || fiveChar=='8' || fiveChar=='9' || fiveChar=='0');
        boolean sixCharValid = (sixChar=='1' || sixChar=='2' || sixChar=='3' || sixChar=='4' || sixChar=='5' || sixChar=='6' || sixChar=='7' || sixChar=='8' || sixChar=='9' || sixChar=='0');
        boolean sevenCharValid = (sevenChar=='1' || sevenChar=='2' || sevenChar=='3' || sevenChar=='4' || sevenChar=='5' || sevenChar=='6' || sevenChar=='7' || sevenChar=='8' || sevenChar=='9' || sevenChar=='0');
        boolean eightCharValid = (eightChar=='1' || eightChar=='2' || eightChar=='3' || eightChar=='4' || eightChar=='5' || eightChar=='6' || eightChar=='7' || eightChar=='8' || eightChar=='9' || eightChar=='0');
        boolean nineCharValid = (nineChar=='1' || nineChar=='2' || nineChar=='3' || nineChar=='4' || nineChar=='5' || nineChar=='6' || nineChar=='7' || nineChar=='8' || nineChar=='9' || nineChar=='0');
        boolean checkCharValid = (checkChar=='1' || checkChar=='2' || checkChar=='3' || checkChar=='4' || checkChar=='5' || checkChar=='6' || checkChar=='7' || checkChar=='8' || checkChar=='9' || checkChar=='0' || checkChar=='X');
        
        while(!oneCharValid || !twoCharValid || !threeCharValid || !fourCharValid || !fiveCharValid || !sixCharValid || !sevenCharValid || !eightCharValid || !nineCharValid || !checkCharValid ){
            
        if(!oneCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
        
        if(!twoCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        
        else{
        if(!threeCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
        
        if(!fourCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
        
        if(!fiveCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
            
        if(!sixCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
        
        if(!sevenCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
        
        if(!eightCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
    
        }
        else{
        
        if(!nineCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
        else{
        
        if(!checkCharValid){
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
        ISBN = myScanner.next(); 
         break;
            
        }
         ISBN = myScanner.next(); 
         break;
        } //end of nineValid else
        } //end of eightCharValid else
        } //end of sevenCharValid else
        } //end of sixCharValid else
        } //end of fiveCharValid else
        } //end of fourCharValid else
        } //end of threeCharValid else
        } //end of twoCharValid else
        } //end of oneCharValid else
        
        
        } //end of loop
        
        
        
        int one = Character.getNumericValue(oneChar);
        int two = Character.getNumericValue(twoChar);
        int three = Character.getNumericValue(threeChar);
        int four = Character.getNumericValue(fourChar);
        int five = Character.getNumericValue(fiveChar);
        int six = Character.getNumericValue(sixChar);
        int seven = Character.getNumericValue(sevenChar);
        int eight = Character.getNumericValue(eightChar);
        int nine = Character.getNumericValue(nineChar);
        
        
        int check;
        
        if (checkChar == 'X'){
            check=10;
        }
        else{
            check = Character.getNumericValue(checkChar);
        }
        
        int sum = (10*one + 9*two + 8*three + 7*four + 6*five + 5*six + 4*seven + 3*eight + 2*nine);
        int checkReal = (sum % 11);
        if(checkReal==10){
            if (sum%11 != check) {
                System.out.println("This is NOT a valid ISBN. Check digit should be: X");    
            }
        }
        
        
        if (sum % 11 != check){
            System.out.println("This is NOT a valid ISBN. Check digit should be: " + checkReal);
        }
        else{
            System.out.println("This is a valid ISBN.");
        }
        
    } //end of main method
} //end of class