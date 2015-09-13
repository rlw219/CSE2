//////////////////////////////////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 13, 2015
//hw03
//Timer Java Program
//
//  Purpose: to compute the time until dinner time
//

import java.util.Scanner; //imports Scanner

public class Timer {
    //main method required for all java programs
    public static void main(String[] args)  {
        Scanner myScanner=new Scanner (System.in);  //defines Scanner
        
        System.out.print("Enter the current time in the form HHMM in military time: "); //tells user to input current time in the form (hour hour minute minute) in military time
        double currentTime=myScanner.nextDouble();  //defines variable currentTime
        System.out.print("Enter the time that you will be eating dinner in the form HHMM in military time: "); //tells user to input dinner time in the form (hour hour minute minute) in military time
        double dinnerTime=myScanner.nextDouble();   //defines variable dinnerTime
        System.out.println("You have " + (int)((dinnerTime-currentTime)/100) + " hours and " + 
        (int)((dinnerTime-currentTime)-(100*(int)((dinnerTime-currentTime)/100))) + " minutes until dinner."); //outputs hours and minutes until dinner
        
    }   //end of the main method
}   //end of class