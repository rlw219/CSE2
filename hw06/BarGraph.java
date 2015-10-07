/*
Rebecca Woods
CSE2
October 2, 2015
Bar Graph Java Program

    Purpose: to create a bar graph of a college student's expenses 
             based on input
*/

import java.util.Scanner; //imports scanner

public class BarGraph {
    //main method required for all java programs
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner(System.in); //defines scanner
        
        boolean valid;
        
        System.out.print("Input how much you spent on Monday:     $");
        String Monday; //defines Monday's expense total
        double expenseMonday; //defines Monday's expense total as a double
       
        do{
           expenseMonday=myScanner.nextDouble(); 
            valid= expenseMonday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
            } while (!valid);
       
        System.out.print("Input how much you spent on Tuesday:    $");
        double expenseTuesday; //defines Tuesday's expense total
        
         do{
            expenseTuesday=myScanner.nextDouble(); 
            valid= expenseTuesday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
        } while (!valid);
        
        System.out.print("Input how much you spent on Wednesdays: $");
        double expenseWednesday; //defines Wednesday's expense total
        
         do{
            expenseWednesday=myScanner.nextDouble(); 
            valid= expenseWednesday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
        } while (!valid);
        
        System.out.print("Input how much you spent on Thursday:   $");
        double expenseThursday; //defines Thursday's expense total
        
         do{
            expenseThursday=myScanner.nextDouble(); 
            valid= expenseThursday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
        } while (!valid);
        
        System.out.print("Input how much you spent on Friday:     $");
        double expenseFriday; //defines Friday's expense total
        
         do{
            expenseFriday=myScanner.nextDouble(); 
            valid= expenseFriday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
        } while (!valid);
        
        System.out.print("Input how much you spent on Saturday:   $");
        double expenseSaturday; //defines Saturday's expense total
        
         do{
            expenseSaturday=myScanner.nextDouble(); 
            valid= expenseSaturday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
        } while (!valid);
        
        System.out.print("Input how much you spent on Sunday:     $");
        double expenseSunday; //defines Sunday's expense total
        
         do{
            expenseSunday=myScanner.nextDouble(); 
            valid= expenseSunday>=0;
            if (!valid){
            System.out.print("Sorry, that is an incorrect value. \nAmount must be a positive number. Please try again: $");
            }
        } while (!valid);
        
        int m=1; //defines m (for Monday)
        int M=((int)(Math.round(expenseMonday)));
        
        //System.out.println(M); //checks value of M
        System.out.print("Mon:   ");
        while (m<=M) {
            System.out.print("*"); //prints dollars spent in  dollars (each * represents 1 dollar)
            m++;
        }
        
        System.out.println(""); //line break
        
        int t=1; //defines t (for Tuesday)
        int T=((int)(Math.round(expenseTuesday)));
        
        //System.out.println(T); //checks value of T
        System.out.print("Tues:  ");
        while (t<=T) {
            System.out.print("*"); //prints dollars spent in  dollars (each * represents 1 dollar)
            t++;
        }
        
        System.out.println(""); //line break
        
        int w=1; //defines w (for Wednesday)
        int W=((int)(Math.round(expenseWednesday)));
        
        //System.out.println(W); //checks value of W
        System.out.print("Wed:   ");
        while (w<=W) {
            System.out.print("*"); //prints dollars spent in  dollars (each * represents 1 dollar)
            w++;
        }
        
        System.out.println(""); //line break
       
        int h=1; //defines h (for Thursday)
        int H=((int)(Math.round(expenseThursday)));
        
        //System.out.println(H); //checks value of H
        System.out.print("Thu:   ");
        while (h<=H) {
            System.out.print("*"); //prints dollars spent in  dollars (each * represents 1 dollar)
            h++;
        }
        
        System.out.println(""); //line break
        
        int f=1; //defines f (for Friday)
        int F=((int)(Math.round(expenseFriday)));
        
        //System.out.println(F); //checks value of F
        System.out.print("Fri:   ");
        while (f<=F) {
            System.out.print("*"); //prints dollars spent in  dollars (each * represents 1 dollar)
            f++;
        }
        
        System.out.println(""); //line break
        
        int a=1; //defines a (for Saturday)
        int A=((int)(Math.round(expenseSaturday)));
        
        //System.out.println(A); //checks value of A
        System.out.print("Sat:   ");
        while (a<=A) {
            System.out.print("*"); //prints dollars spent in  dollars (each * represents 1 dollar)
            a++;
        }
        
        System.out.println(""); //line break
        
        int s=1; //defines s (for Sunday)
        int S=((int)(Math.round(expenseSunday)));
        
        //System.out.println(S); //checks value of S
        System.out.print("Sun:   ");
        while (s<=S) {
            System.out.print("*"); //prints dollars spent in dollars (each * represents 1 dollar)
            s++;
        }
        
        System.out.println(""); //line break
        
        System.out.println("\n * = 1 dollar"); //tells user what * means in the graph
        
        double averageExpensesPerDay=(double)((int)((expenseMonday+expenseTuesday+expenseWednesday+
                                expenseThursday+expenseFriday+expenseSaturday+
                                expenseSunday)/7*100))/100; //average expense per day
                                
        
        double fourYearExpenditure=0;
        double averageExpensesPerWeek=(double)((int)(averageExpensesPerDay*7*100))/100;
        
        
        for (int week=1; week<=208; week++) {
            double percentFlux=(double)((Math.random()*40)-20);
        //System.out.println(percentFlux); //checks value for percentFlux
            double newWeekExpense=(averageExpensesPerWeek*percentFlux/100)+averageExpensesPerWeek;
        
        fourYearExpenditure +=newWeekExpense;
            //System.out.println("$" + newWeekExpense); checks value of newWeekExpense
        } 
        
        
        double estimatedFourYearExpenditure= (double)((int)(fourYearExpenditure*100))/100;
        
        System.out.println("Your average daily expenses are: $" + averageExpensesPerDay);
        System.out.println("Estimated expenditure for 4 years: $" + estimatedFourYearExpenditure);
        
       
        
    } //end of main method
} //end of class