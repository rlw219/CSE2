/////////////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 11, 2015
//lab03
//Check Java Program
//
//  Purpose: to compute the check split evenly by a number of people
//

import java.util.Scanner;

public class Check{
    //main method required for all java programs
    public static void main(String[] args)  {
        Scanner myScanner=new Scanner (System.in); //defines Scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //tells user to input check amount
        double checkCost=myScanner.nextDouble(); //defines variable checkCost
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //tells user to input tip percentage
        double tipPercent=myScanner.nextDouble(); //defines variable tipPercent
        tipPercent/=100; //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner: "); //tells user to input number of people to split the check between
        int numPeople=myScanner.nextInt(); //defines variable numPeople
        double totalCost; //declares total cost
        double costPerPerson; //declares cost per person
        int dollars, //whole dollar amount of cost 
        dimes, pennies; //for storing digits
                                                                   //to the right of the decimal point
                                                                   //for the cost$
        totalCost=checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        //get the whole amount, dropping decimal fraction 
        dollars=(int)costPerPerson;
        //get dimes amount, e.g.,
        // (int)(6.73*10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the devision: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(costPerPerson*10) % 10;
        pennies=(int)(costPerPerson*100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    
    } //end of main method
} //end of class