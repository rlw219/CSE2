////////////////////////////////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 4, 2015
//lab02-Cyclometer
//Bicycle Cyclometer Java Program
//
//  purpose is to calculate the number of minutes and counts,
//  the distance of each trip and the distances combined
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

public class Cyclometer{
    
    public static void main(String[] args)  {
        
        int secsTrip1=480;      //stores time of Trip1
        int secsTrip2=3220;     //stores time of Trip2
        int countsTrip1=1561;   //stores counts of Trip1
        int countsTrip2=9037;   //stores counts of Trip2
        
        double WheelDiameter=27.0;  //stores diameter of wheels
         double PI=3.14159;                //stores pi
         double feetPerMile=5280;          //stores number of feet in a mile
         double inchesPerFoot=12;           //stores number of inches in a foot
         double secondsPerMinute=60;        //stores number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //stores distances for first, second, and total trips
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        //
        distanceTrip1=countsTrip1*WheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*WheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}