///////////////////////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 13, 2015
//hw03
//Block Java Program
//
//  Purpose: to calculate the volume and surface area of a block from the prompted length, width and height
//

import java.util.Scanner; //imports Scanner

public class Block {
    //main method required for all java programs
    public static void main(String[] args)  {
        Scanner myScanner=new Scanner (System.in);  //defines Scanner
        
        System.out.print("Enter the length of the block: ");    //tells user to input length of block
        double blockLength=myScanner.nextDouble();  //defines variable blockLength
        System.out.print("Enter the width of the block: ");     //tells user to input width of block
        double blockWidth=myScanner.nextDouble();   //defines variable blockWidth
        System.out.print("Enter the height of the block: ");    //tells user to input height of block
        double blockHeight=myScanner.nextDouble();  //defines variable blockHeight
        double blockVolume=blockLength*blockWidth*blockHeight;  //defines variable blockVolume
        double blockSurfaceArea=(2*blockLength*blockHeight)+(2*blockLength*blockWidth)+(2*blockWidth*blockHeight);  //defines variable blockSurfaceArea
        System.out.println("The volume of the block of dimensions " + blockLength + " x " + blockWidth + " x " + blockHeight + " is " + blockVolume + ".");
        //outputs dimensions and volume of block
        System.out.println("The surface area of the block is " + blockSurfaceArea + ".");   //outputs surface area of block
        
    }   //end of main method
}   //end of class