/*
Rebecca Woods
CSE2
November 1, 2015
hw10 Shuffling java program

    Purpose: to print all 52 cards, shuffle the cards, 
    and select a randomized hand
*/


public class Shuffling {
    
    //Print Array method
    public static void printArray(String[] list) {
        for (int i=0; i<52; i++) { //for loop for printing cards in deck
            System.out.print(list[i] + " "); //prints card
            if (i==(list.length)-1) { //stops printing past array length (important for random hand)
                break; //breaks loop
            } //end of if statement for array length
        } //end of for loop for printing
        System.out.println(""); //line break
    } //end of print array method
    
    //shuffle method
    public static String[] shuffle(String[] list) {
        
        int j = 1; //declares variable j
        int k = 0; //declares variable k
        while (k<104) { //while loop for randomizing cards (shuffles 104)
            String temporary = list[0]; //creates temporary string for first value in array
            list[0] = list[j]; //changes first value in array to 'j' value
            list[j] = temporary; //changes 'j' value in array to 0th(temp value)
            j = (int) (Math.random()*51)+1; //randomized value j
            k++; //adds one to k to continue loop
        } //end of for loop for shuffling deck
        
        return list; //returns shuffled deck
    } //end of shuffle method
    
    //randomize hand method
    public static String[] randomizeHand(String[] list) {
        
        int j = 1;
        String[] temp = new String[5]; //creates temporary array inside randomizeHand method
        for (int k=0; k<5; k++) { //for loop for temp cards
            j = (int) (Math.random()*51)+1; //generates random card
            temp[k] = list[j]; //allocates the random card to a value in temp array
            
            if(k>0 && temp[k].equals(temp[k-1]) || //checks for duplicates
               k>1 && temp[k].equals(temp[k-2]) || //in hand
               k>2 && temp[k].equals(temp[k-3]) ||
               k>3 && temp[k].equals(temp[k-4])) {
                   
                k--; //reallocates last array value
            } //does not allow repeats in temp hand
        } //end of for loop for temp
        
        return temp;
    } //end of randomize hand method
    
    //main method required for all java programs
    public static void main(String[] args) {
        
	    //suits club, heart, spade or diamond
        String[] suitNames = {"C","H","S","D"}; //creates array for card suit
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //creates array for card #
        String[] deck = new String[52]; //creates array for the deck
        String[] hand = new String[5]; //creates array for the randomly drawn hand
        for (int i=0; i<52; i++){ //for loop for card names and suits
            deck[i]=rankNames[i%13]+suitNames[i/13]; //allocates card values in array
            
        } //end of for loop for card names and suits
        
        printArray(deck); //prints all cards in order
        
        shuffle(deck); //shuffles cards
        System.out.println("Shuffled");
        
        printArray(deck); //prints shuffled cards
        
        System.out.println("Randomized Hand!");
        hand = randomizeHand(deck); //selects random hand
        printArray(hand); //prints randomly selected hand

    } //end of main method
} //end of class
    