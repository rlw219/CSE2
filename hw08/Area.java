/*
Rebecca Woods
CSE2
October 19, 2015
Area Java Program

    Purpose: To calculate the area of requested shape
*/

import java.util.Scanner; //imports scanner


public class Area {
    
    //input checking method
    public static double inputCheck(){
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
            
            boolean acceptable = false;
            double check = 0; //declares variable check
            
            while (!acceptable){
                
                if (myScanner.hasNextDouble()){ //checks that value entered can be a double
                    check = myScanner.nextDouble(); //defines check as the entered double
                    if (check>0) { //if statement for positive number check
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
                
            } //end of while loop for rectangle length
            
        return check; //has method store check
    } //end of inputCheck method
    
    
    
    
    
    //Rectangle method
    public static double rect(){
        System.out.print("Please enter the length of the rectangle: "); //asks user for length
        double length = inputCheck(); //declares variable length
        System.out.print("Please enter the width of the rectangle: "); //asks user for width
        double width = inputCheck(); //declares variable width
        double rectArea = length*width; //declares rectangle's area
        return rectArea; //returns rectangle's area
        
    } //end of rect method
    
    public static double tri(){
        System.out.print("Please enter the base of the triangle: "); //asks user for height
        double height = inputCheck(); //declares variable height
        System.out.print("Please enter the base of the triangle: "); //asks user for base
        double base = inputCheck(); //declares variable base
        double triArea = (0.5)*base*height; //declares triangle's area
        return triArea; //returns triangle's area
        
    } //end of tri method
    
    public static double circle(){
        System.out.print("Please enter the circle's radius: "); //asks user for radius
        double radius = inputCheck(); //declares variable radius
        double pi = 3.14; //declares constant pi
        double circleArea = pi*radius*radius; //declares circle's area
        return circleArea; //return circle's area
        
    } //end of circle method
    
    
    //main method required for all java programs
    public static void main(String[] args) {
    
        
        Scanner myScanner = new Scanner(System.in); //declares scanner
        
        System.out.println("rectangle");
        System.out.println("triangle");
        System.out.println("circle");
        System.out.println("Please chose one of the above shapes: ");
        //shows user shape options
        
        String shape = myScanner.nextLine(); //declares variable shape
        
        
        boolean acceptable = shape.equals("rectangle") || shape.equals("triangle") || shape.equals("circle");
        //declares acceptable as true if rectangle, triangle, or circle inputted
        
        while (!acceptable){ //while loop for shape input
            
            System.out.println("That is not an acceptable shape\n please enter either rectangle, triangle, or circle (in LOWER CASE):");
            shape = myScanner.nextLine(); //reassignment of variable shape
            acceptable = shape.equals("rectangle") || shape.equals("triangle") || shape.equals("circle");
            //changes acceptable to true if rectangle, triangle, or circle inputted
        } //end of while loop for error in shape input
        
        if (shape.equals("rectangle")){ //if statement for rectangle's area
            System.out.println("The area is: " + rect()); //calls rect method and returns rectArea
        } //end of if statement for rectangle's area
        if (shape.equals("triangle")){ //if statement for triangle's area
            System.out.println("The area is: " + tri()); //calls tri method and returns triArea
        } //end of if statement for triangle's area
        if (shape.equals("circle")){ //if statement for circle's area
            System.out.println("The Area is: " + circle()); //calls circle method and returns circleArea
        } //end of if statement for circle's area
        
        
    } //end of main method
} //end of class