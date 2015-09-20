///////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 20, 2015
//hw04
//Poker Hand Check Java Program
//
//  Purpose: to simulate a randomly drawn poker hand (one card from each deck) 
//      and specify if there is a pair, two pair, three of a kind, or a high 
//      card hand
//

public class PokerHandCheck {
    //main method required for all java programs
    public static void main(String [] args) {
    
        System.out.println("Your random cards were: ");
        
        int cardOne=(int)(Math.random()*52)+1; //defines first card's number
        String printCardOne=""; //defines name of first card to be printed
        switch(cardOne){
            case 1:
                printCardOne="Ace";
                break;
            case 2:
                printCardOne="2";
                break;
            case 3:
                printCardOne="3";
                break;
            case 4:
                printCardOne="4";
                break;
            case 5:
                printCardOne="5";
                break;
            case 6:
                printCardOne="6";
                break;
            case 7:
                printCardOne="7";
                break;
            case 8:
                printCardOne="8";
                break;
            case 9:
                printCardOne="9";
                break;
            case 10:
                printCardOne="10";
                break;
            case 11:
                printCardOne="Jack";
                break;
            case 12:
                printCardOne="Queen";
                break;
            case 13:
                printCardOne="King";
                break;
            case 14:
                printCardOne="Ace";
                break;
            case 15:
                printCardOne="2";
                break;
            case 16:
                printCardOne="3";
                break;
            case 17:
                printCardOne="4";
                break;
            case 18:
                printCardOne="5";
                break;
            case 19:
                printCardOne="6";
                break;
            case 20:
                printCardOne="7";
                break;
            case 21:
                printCardOne="8";
                break;
            case 22:
                printCardOne="9";
                break;
            case 23:
                printCardOne="10";
                break;
            case 24:
                printCardOne="Jack";
                break;
            case 25:
                printCardOne="Queen";
                break;
            case 26:
                printCardOne="King";
                break;
            case 27:
                printCardOne="Ace";
                break;
            case 28:
                printCardOne="2";
                break;
            case 29:
                printCardOne="3";
                break;
            case 30:
                printCardOne="4";
                break;
            case 31:
                printCardOne="5";
                break;
            case 32:
                printCardOne="6";
                break;
            case 33:
                printCardOne="7";
                break;
            case 34:
                printCardOne="8";
                break;
            case 35:
                printCardOne="9";
                break;
            case 36:
                printCardOne="10";
                break;
            case 37:
                printCardOne="Jack";
                break;
            case 38:
                printCardOne="Queen";
                break;
            case 39:
                printCardOne="King";
                break;
            case 40:
                printCardOne="Ace";
                break;
            case 41:
                printCardOne="2";
                break;
            case 42:
                printCardOne="3";
                break;
            case 43:
                printCardOne="4";
                break;
            case 44:
                printCardOne="5";
                break;
            case 45:
                printCardOne="6";
                break;
            case 46:
                printCardOne="7";
                break;
            case 47:
                printCardOne="8";
                break;
            case 48:
                printCardOne="9";
                break;
            case 49:
                printCardOne="10";
                break;
            case 50:
                printCardOne="Jack";
                break;
            case 51:
                printCardOne="Queen";
                break;
            case 52:
                printCardOne="King";
                break;                
        }
        
        if (cardOne<=13){
            System.out.println("the " + printCardOne + " of diamonds"); //prints first card's name of diamonds
        }
        else if (cardOne>=14&&cardOne<=26){
            System.out.println("the " + printCardOne + " of clubs"); //prints first card's name of clubs
        }
        else if (cardOne>=27&&cardOne<=39){
            System.out.println("the " + printCardOne + " of hearts"); //prints first card's name of hearts
        }
        else if (cardOne>=40&&cardOne<=52){
            System.out.println("the " + printCardOne + " of spades"); //prints first card's name of spades
        }
        
        
        int cardTwo=(int)(Math.random()*52)+1; //defines second card's number
        String printCardTwo=""; //defines name of second card to be printed
        switch(cardTwo){
            case 1:
                printCardTwo="Ace";
                break;
            case 2:
                printCardTwo="2";
                break;
            case 3:
                printCardTwo="3";
                break;
            case 4:
                printCardTwo="4";
                break;
            case 5:
                printCardTwo="5";
                break;
            case 6:
                printCardTwo="6";
                break;
            case 7:
                printCardTwo="7";
                break;
            case 8:
                printCardTwo="8";
                break;
            case 9:
                printCardTwo="9";
                break;
            case 10:
                printCardTwo="10";
                break;
            case 11:
                printCardTwo="Jack";
                break;
            case 12:
                printCardTwo="Queen";
                break;
            case 13:
                printCardTwo="King";
                break;
            case 14:
                printCardTwo="Ace";
                break;
            case 15:
                printCardTwo="2";
                break;
            case 16:
                printCardTwo="3";
                break;
            case 17:
                printCardTwo="4";
                break;
            case 18:
                printCardTwo="5";
                break;
            case 19:
                printCardTwo="6";
                break;
            case 20:
                printCardTwo="7";
                break;
            case 21:
                printCardTwo="8";
                break;
            case 22:
                printCardTwo="9";
                break;
            case 23:
                printCardTwo="10";
                break;
            case 24:
                printCardTwo="Jack";
                break;
            case 25:
                printCardTwo="Queen";
                break;
            case 26:
                printCardTwo="King";
                break;
            case 27:
                printCardTwo="Ace";
                break;
            case 28:
                printCardTwo="2";
                break;
            case 29:
                printCardTwo="3";
                break;
            case 30:
                printCardTwo="4";
                break;
            case 31:
                printCardTwo="5";
                break;
            case 32:
                printCardTwo="6";
                break;
            case 33:
                printCardTwo="7";
                break;
            case 34:
                printCardTwo="8";
                break;
            case 35:
                printCardTwo="9";
                break;
            case 36:
                printCardTwo="10";
                break;
            case 37:
                printCardTwo="Jack";
                break;
            case 38:
                printCardTwo="Queen";
                break;
            case 39:
                printCardTwo="King";
                break;
            case 40:
                printCardTwo="Ace";
                break;
            case 41:
                printCardTwo="2";
                break;
            case 42:
                printCardTwo="3";
                break;
            case 43:
                printCardTwo="4";
                break;
            case 44:
                printCardTwo="5";
                break;
            case 45:
                printCardTwo="6";
                break;
            case 46:
                printCardTwo="7";
                break;
            case 47:
                printCardTwo="8";
                break;
            case 48:
                printCardTwo="9";
                break;
            case 49:
                printCardTwo="10";
                break;
            case 50:
                printCardTwo="Jack";
                break;
            case 51:
                printCardTwo="Queen";
                break;
            case 52:
                printCardTwo="King";
                break;                
        }
        
        if (cardTwo<=13){
            System.out.println("the " + printCardTwo + " of diamonds"); //prints second card's name of diamonds
        }
        else if (cardTwo>=14&&cardTwo<=26){
            System.out.println("the " + printCardTwo + " of clubs"); //prints second card's name of clubs
        }
        else if (cardTwo>=27&&cardTwo<=39){
            System.out.println("the " + printCardTwo + " of hearts"); //prints second card's name of hearts
        }
        else if (cardTwo>=40&&cardTwo<=52){
            System.out.println("the " + printCardTwo + " of spades"); //prints second card's name of spades
        }
        
        int cardThree=(int)(Math.random()*52)+1; //defines third card's number
        String printCardThree=""; //defines name of third card to be printed
        switch(cardThree){
            case 1:
                printCardThree="Ace";
                break;
            case 2:
                printCardThree="2";
                break;
            case 3:
                printCardThree="3";
                break;
            case 4:
                printCardThree="4";
                break;
            case 5:
                printCardThree="5";
                break;
            case 6:
                printCardThree="6";
                break;
            case 7:
                printCardThree="7";
                break;
            case 8:
                printCardThree="8";
                break;
            case 9:
                printCardThree="9";
                break;
            case 10:
                printCardThree="10";
                break;
            case 11:
                printCardThree="Jack";
                break;
            case 12:
                printCardThree="Queen";
                break;
            case 13:
                printCardThree="King";
                break;
            case 14:
                printCardThree="Ace";
                break;
            case 15:
                printCardThree="2";
                break;
            case 16:
                printCardThree="3";
                break;
            case 17:
                printCardThree="4";
                break;
            case 18:
                printCardThree="5";
                break;
            case 19:
                printCardThree="6";
                break;
            case 20:
                printCardThree="7";
                break;
            case 21:
                printCardThree="8";
                break;
            case 22:
                printCardThree="9";
                break;
            case 23:
                printCardThree="10";
                break;
            case 24:
                printCardThree="Jack";
                break;
            case 25:
                printCardThree="Queen";
                break;
            case 26:
                printCardThree="King";
                break;
            case 27:
                printCardThree="Ace";
                break;
            case 28:
                printCardThree="2";
                break;
            case 29:
                printCardThree="3";
                break;
            case 30:
                printCardThree="4";
                break;
            case 31:
                printCardThree="5";
                break;
            case 32:
                printCardThree="6";
                break;
            case 33:
                printCardThree="7";
                break;
            case 34:
                printCardThree="8";
                break;
            case 35:
                printCardThree="9";
                break;
            case 36:
                printCardThree="10";
                break;
            case 37:
                printCardThree="Jack";
                break;
            case 38:
                printCardThree="Queen";
                break;
            case 39:
                printCardThree="King";
                break;
            case 40:
                printCardThree="Ace";
                break;
            case 41:
                printCardThree="2";
                break;
            case 42:
                printCardThree="3";
                break;
            case 43:
                printCardThree="4";
                break;
            case 44:
                printCardThree="5";
                break;
            case 45:
                printCardThree="6";
                break;
            case 46:
                printCardThree="7";
                break;
            case 47:
                printCardThree="8";
                break;
            case 48:
                printCardThree="9";
                break;
            case 49:
                printCardThree="10";
                break;
            case 50:
                printCardThree="Jack";
                break;
            case 51:
                printCardThree="Queen";
                break;
            case 52:
                printCardThree="King";
                break;                
        }
        
        if (cardThree<=13){
            System.out.println("the " + printCardThree + " of diamonds"); //prints third card's name of diamonds
        }
        else if (cardThree>=14&&cardThree<=26){
            System.out.println("the " + printCardThree + " of clubs"); //prints third card's name of clubs
        }
        else if (cardThree>=27&&cardThree<=39){
            System.out.println("the " + printCardThree + " of hearts"); //prints third card's name of hearts
        }
        else if (cardThree>=40&&cardThree<=52){
            System.out.println("the " + printCardThree + " of spades"); //prints third card's name of spades
        }
        
        int cardFour=(int)(Math.random()*52)+1; //defines fourth card's number
        String printCardFour=""; //defines name of fourth card to be printed
        switch(cardFour){
            case 1:
                printCardFour="Ace";
                break;
            case 2:
                printCardFour="2";
                break;
            case 3:
                printCardFour="3";
                break;
            case 4:
                printCardFour="4";
                break;
            case 5:
                printCardFour="5";
                break;
            case 6:
                printCardFour="6";
                break;
            case 7:
                printCardFour="7";
                break;
            case 8:
                printCardFour="8";
                break;
            case 9:
                printCardFour="9";
                break;
            case 10:
                printCardFour="10";
                break;
            case 11:
                printCardFour="Jack";
                break;
            case 12:
                printCardFour="Queen";
                break;
            case 13:
                printCardFour="King";
                break;
            case 14:
                printCardFour="Ace";
                break;
            case 15:
                printCardFour="2";
                break;
            case 16:
                printCardFour="3";
                break;
            case 17:
                printCardFour="4";
                break;
            case 18:
                printCardFour="5";
                break;
            case 19:
                printCardFour="6";
                break;
            case 20:
                printCardFour="7";
                break;
            case 21:
                printCardFour="8";
                break;
            case 22:
                printCardFour="9";
                break;
            case 23:
                printCardFour="10";
                break;
            case 24:
                printCardFour="Jack";
                break;
            case 25:
                printCardFour="Queen";
                break;
            case 26:
                printCardFour="King";
                break;
            case 27:
                printCardFour="Ace";
                break;
            case 28:
                printCardFour="2";
                break;
            case 29:
                printCardFour="3";
                break;
            case 30:
                printCardFour="4";
                break;
            case 31:
                printCardFour="5";
                break;
            case 32:
                printCardFour="6";
                break;
            case 33:
                printCardFour="7";
                break;
            case 34:
                printCardFour="8";
                break;
            case 35:
                printCardFour="9";
                break;
            case 36:
                printCardFour="10";
                break;
            case 37:
                printCardFour="Jack";
                break;
            case 38:
                printCardFour="Queen";
                break;
            case 39:
                printCardFour="King";
                break;
            case 40:
                printCardFour="Ace";
                break;
            case 41:
                printCardFour="2";
                break;
            case 42:
                printCardFour="3";
                break;
            case 43:
                printCardFour="4";
                break;
            case 44:
                printCardFour="5";
                break;
            case 45:
                printCardFour="6";
                break;
            case 46:
                printCardFour="7";
                break;
            case 47:
                printCardFour="8";
                break;
            case 48:
                printCardFour="9";
                break;
            case 49:
                printCardFour="10";
                break;
            case 50:
                printCardFour="Jack";
                break;
            case 51:
                printCardFour="Queen";
                break;
            case 52:
                printCardFour="King";
                break;                
        }
        
        if (cardFour<=13){
            System.out.println("the " + printCardFour + " of diamonds"); //prints fourth card's name of diamonds
        }
        else if (cardFour>=14&&cardFour<=26){
            System.out.println("the " + printCardFour + " of clubs"); //prints fourth card's name of clubs
        }
        else if (cardFour>=27&&cardFour<=39){
            System.out.println("the " + printCardFour + " of hearts"); //prints fourth card's name of hearts
        }
        else if (cardFour>=40&&cardFour<=52){
            System.out.println("the " + printCardFour + " of spades"); //prints fourth card's name of spades
        }
        
        int cardFive=(int)(Math.random()*52)+1; //defines fifth card's number
        String printCardFive=""; //defines name of fifth card to be printed
        switch(cardFive){
            case 1:
                printCardFive="Ace";
                break;
            case 2:
                printCardFive="2";
                break;
            case 3:
                printCardFive="3";
                break;
            case 4:
                printCardFive="4";
                break;
            case 5:
                printCardFive="5";
                break;
            case 6:
                printCardFive="6";
                break;
            case 7:
                printCardFive="7";
                break;
            case 8:
                printCardFive="8";
                break;
            case 9:
                printCardFive="9";
                break;
            case 10:
                printCardFive="10";
                break;
            case 11:
                printCardFive="Jack";
                break;
            case 12:
                printCardFive="Queen";
                break;
            case 13:
                printCardFive="King";
                break;
            case 14:
                printCardFive="Ace";
                break;
            case 15:
                printCardFive="2";
                break;
            case 16:
                printCardFive="3";
                break;
            case 17:
                printCardFive="4";
                break;
            case 18:
                printCardFive="5";
                break;
            case 19:
                printCardFive="6";
                break;
            case 20:
                printCardFive="7";
                break;
            case 21:
                printCardFive="8";
                break;
            case 22:
                printCardFive="9";
                break;
            case 23:
                printCardFive="10";
                break;
            case 24:
                printCardFive="Jack";
                break;
            case 25:
                printCardFive="Queen";
                break;
            case 26:
                printCardFive="King";
                break;
            case 27:
                printCardFive="Ace";
                break;
            case 28:
                printCardFive="2";
                break;
            case 29:
                printCardFive="3";
                break;
            case 30:
                printCardFive="4";
                break;
            case 31:
                printCardFive="5";
                break;
            case 32:
                printCardFive="6";
                break;
            case 33:
                printCardFive="7";
                break;
            case 34:
                printCardFive="8";
                break;
            case 35:
                printCardFive="9";
                break;
            case 36:
                printCardFive="10";
                break;
            case 37:
                printCardFive="Jack";
                break;
            case 38:
                printCardFive="Queen";
                break;
            case 39:
                printCardFive="King";
                break;
            case 40:
                printCardFive="Ace";
                break;
            case 41:
                printCardFive="2";
                break;
            case 42:
                printCardFive="3";
                break;
            case 43:
                printCardFive="4";
                break;
            case 44:
                printCardFive="5";
                break;
            case 45:
                printCardFive="6";
                break;
            case 46:
                printCardFive="7";
                break;
            case 47:
                printCardFive="8";
                break;
            case 48:
                printCardFive="9";
                break;
            case 49:
                printCardFive="10";
                break;
            case 50:
                printCardFive="Jack";
                break;
            case 51:
                printCardFive="Queen";
                break;
            case 52:
                printCardFive="King";
                break;                
        }
        
        if (cardFive<=13){
            System.out.println("the " + printCardFive + " of diamonds"); //prints fifth card's name of diamonds
        }
        else if (cardFive>=14&&cardFive<=26){
            System.out.println("the " + printCardFive + " of clubs"); //prints fifth card's name of clubs
        }
        else if (cardFive>=27&&cardFive<=39){
            System.out.println("the " + printCardFive + " of hearts"); //prints fifth card's name of hearts
        }
        else if (cardFive>=40&&cardFive<=52){
            System.out.println("the " + printCardFive + " of spades"); //prints fifth card's name of spades
        }
        
        
        
        if (printCardOne==printCardTwo&&printCardThree==printCardFour || printCardOne==printCardTwo&&printCardThree==printCardFive || printCardOne==printCardTwo&&printCardFour==printCardFive||
            printCardOne==printCardThree&&printCardTwo==printCardFour || printCardOne==printCardThree&&printCardTwo==printCardFive || printCardOne==printCardThree&&printCardFour==printCardFive ||
            printCardOne==printCardFour&&printCardTwo==printCardThree || printCardOne==printCardFour&&printCardTwo==printCardFive || printCardOne==printCardFour&&printCardThree==printCardFive ||
            printCardOne==printCardFive&&printCardTwo==printCardThree || printCardOne==printCardFive&&printCardTwo==printCardFour || printCardOne==printCardFive&&printCardThree==printCardFour ||
            printCardTwo==printCardThree&&printCardFour==printCardFive || printCardTwo==printCardFour&&printCardThree==printCardFive || printCardTwo==printCardFive&&printCardThree==printCardFour){
                System.out.println("You have a two pair!");
            }    
        else if (printCardOne==printCardTwo || printCardOne==printCardThree || printCardOne==printCardFour || printCardOne==printCardFive ||
            printCardTwo==printCardThree || printCardTwo==printCardFour || printCardTwo==printCardFive || 
            printCardThree==printCardFour || printCardThree==printCardFive ||
            printCardFour==printCardFive){
                if (printCardOne==printCardTwo&&printCardOne==printCardThree || printCardOne==printCardTwo&&printCardOne==printCardFour ||
            printCardOne==printCardTwo&&printCardOne==printCardFive || printCardOne==printCardThree&&printCardOne==printCardFour || printCardOne==printCardThree&&printCardOne==printCardFive ||
            printCardOne==printCardFour&&printCardOne==printCardFive || printCardTwo==printCardThree&&printCardTwo==printCardFour || printCardTwo==printCardThree&&printCardTwo==printCardFive ||
            printCardTwo==printCardFour&&printCardTwo==printCardFive || printCardThree==printCardFour&&printCardThree==printCardFive){
                System.out.println("You have three of a kind!");
            }
                else {System.out.println("You have a pair!");
                }
               
                
        }
        else {
            System.out.println("You have a high card hand!");
        }    
       
            
    } //ends main method
}    //ends class






