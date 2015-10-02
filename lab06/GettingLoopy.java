/*
Rebecca Woods
CSE2
October 2, 2015
Getting Loopy Java Program

  Purpose: to get familiar with loops
*/

public class GettingLoopy {
    //main method required for all java programs
    public static void main(String[] args) {
        //main string
        int i=1; //declares int i
      
        
        System.out.println("Step 1:"); //prints "Step 1: "
        while (i<=7){ //while statement for i (will print 1-6)
            
            System.out.print(i);
            i++; //adds one to i
            
            
        }
        int j=1; //declares int j
        while (j<7){ //while statement for j (will print 7s)
            System.out.print(7);
            j++; //adds one to j
        }
        
        System.out.println(""); //line break
        
        int k=10; //declares int k
        
        System.out.println("Step 2:"); //prints "Step 2: "
        System.out.print("WHILE LOOP: "); //prints "WHILE LOOP: "
        while (k<=100){ //while statement for k (prints out prime numbers between 10 and 100)
            if (k%2 != 0 && k%3 != 0 && k%5 != 0 && k%7 != 0){ //if statement to print only prime numbers
                System.out.print(k + " ");
                
            }
            k++; //adds one to k
            
        }
        
        System.out.println(""); //line break
        
        
        System.out.print("FOR LOOP: "); //prints "FOR LOOP: "
        for (int l=10; l<=100; l++){ //for statement for l (prints out prime numbers between 10 and 100)
            if (l%2 != 0 && l%3 != 0 && l%5 != 0 && l%7 != 0){ //if statement to print only prime numbers
                System.out.print(l + " ");
                
            }
        }
        
        System.out.println(""); //line break
        
        int m=10; //declares int m
        System.out.print("DO WHILE: "); //prints "DO WHILE: "
        do { m++; //do statement for m (prints out prime numbers 10 and 100)
       if (m%2 != 0 && m%3 != 0 && m%5 != 0 && m%7 != 0){ //if statement to print only prime numbers
            System.out.print(m + " "); 
        }
        } while (m<100); // while statement that goes with do statement
        
        System.out.println(""); //line break
        
        System.out.println("Step 3: "); //prints "Step 3: "
        int randomAmount=(int)(Math.random()*(200)+5); //declares randomAmount
        //System.out.println(randomAmount);  Check to see randomAmount= number of ":)" printed
        int p=1; //declares int p
        while (p<=randomAmount){ //while statement for number of symbols to be printed
            String symbol= ":)"; //declares String symbol
            System.out.print(symbol);
            if (p%20==0) { //breaks line when there are more than 20 symbols
                System.out.println("");
            }
            p++; //adds one to p
            
        }
        
        System.out.println(""); //line break
        
        
    } //end of main method
} //end of class