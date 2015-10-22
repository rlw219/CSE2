/*
Rebecca Woods
CSE2
October 22, 2015
String Analysis Java Program

    Purpose: process a string by examining all the characters
    or a specified number of characters in the string (and determine 
    if they are letters)
    
*/    

    import java.util.Scanner; //imports scanner

public class StringAnalysis {

    public static boolean yellow(String a){ //method yellow STRING ONLY
    
        for (int i=0; i<=a.length(); i++) { //for loop for all chars
            char c = a.charAt(i); //declares variable c to be each char
                if (Character.isLetter(c)) { //if statement for char is letter
                    continue;
                } //end of if statement for char is letter
                else { //else statement for char is letter
                    return false;
                } //end of else statement for char is letter
        } //end of for loop for all chars
        return true;
    
    
        
    } //end of method yellow STRING ONLY
    
    public static boolean yellow(String a, int b){ //method yellow STRING AND INT
        
        for (int i=0; i<b; i++) { //for loop for chars before #b
            char c = a.charAt(i); //declares variable c to be each char
                if (Character.isLetter(c)) { //if statement for char is letter
                    continue;
                } //end of if statement for char is letter
                else { //else statement for char is letter
                    return false;
                } //end of else statement for char is letter
        } //end of for loop for chars before #b
        return true;
        
    } //end of method yellow STRING AND INT
    
    
    public static void main(String[] args) { //main method required for all java programs
    
        Scanner myScanner = new Scanner(System.in); //declares Scanner
        
        boolean letters; //declares boolean letters
        
        System.out.println("Please enter a String: ");
        String a = myScanner.nextLine(); //declares a as the string
        
        int b = 0; //declares variable b
        
                
                System.out.println("Please enter the number of characters\n in the string to evaluate. \n(Enter 1000 to evaluate the entire string): ");
                
                    boolean acceptable = false; //creates boolean acceptable
                    
                    while (!acceptable){ //while loop for b
                        
                        if (myScanner.hasNextInt()){ //checks that value entered can be a double
                            b = myScanner.nextInt(); //defines b as the entered int
                            if (b>0) { //if statement for positive number check
                                acceptable = true; //changes acceptable to true
                            } //end of if statement for positive number check
                            else { //else statement for positive number check
                                System.out.print("ERROR. Please enter a positive number in digits: ");
                                myScanner.nextLine(); //asks again for input
                            } //end of else statement for positive number check
                            
                        } //end of if statement for a double check
                        else { //else statement for a double check
                        System.out.print("ERROR. Please enter a number in digits: ");
                        myScanner.nextLine(); //asks again for input
                        } //end of else statement for a double check
                    } //end of while loop for b
                    
                    int length = a.length(); //declares length of string a
                    if (b>length){ //if statement for b larger than the length of a
                    
                    letters = yellow(a); //calls method yellow to evaluate string a
                    System.out.println(letters); //prints result from yellow
                    
                    } //end of if statement for b larger than length of a
                    else { //else statement of b larger than the length a
                        letters = yellow(a,b); //calls method yellow to evaluate string a until # of chars = b
                        System.out.println(letters); //prints result from yellow
                    } //end of else statement of b larger than length of a
                
        
    } //end of main method

} //end of class