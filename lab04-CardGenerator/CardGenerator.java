/////////////////////////////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 18, 2015
//lab04
//Card Generator Java Program
//
//  Purpose: Select a random card from a 52 card deck
//

public class CardGenerator {
    //main method required for all java programs
    public static void main(String[] args)  {
        
        int card=(int)(Math.random()*52)+1; //defines card number
        String printCard = ""; //defines name of card to be printed
        switch(card){
            case 1:
                printCard="Ace";
                break;
            case 2:
                printCard="2";
                break;
            case 3:
                printCard="3";
                break;
            case 4:
                printCard="4";
                break;
            case 5:
                printCard="5";
                break;
            case 6:
                printCard="6";
                break;
            case 7:
                printCard="7";
                break;
            case 8:
                printCard="8";
                break;
            case 9:
                printCard="9";
                break;
            case 10:
                printCard="10";
                break;
            case 11:
                printCard="Jack";
                break;
            case 12:
                printCard="Queen";
                break;
            case 13:
                printCard="King";
                break;
            case 14:
                printCard="Ace";
                break;
            case 15:
                printCard="2";
                break;
            case 16:
                printCard="3";
                break;
            case 17:
                printCard="4";
                break;
            case 18:
                printCard="5";
                break;
            case 19:
                printCard="6";
                break;
            case 20:
                printCard="7";
                break;
            case 21:
                printCard="8";
                break;
            case 22:
                printCard="9";
                break;
            case 23:
                printCard="10";
                break;
            case 24:
                printCard="Jack";
                break;
            case 25:
                printCard="Queen";
                break;
            case 26:
                printCard="King";
                break;
             case 27:
                printCard="Ace";
                break;
            case 28:
                printCard="2";
                break;
            case 29:
                printCard="3";
                break;
            case 30:
                printCard="4";
                break;
            case 31:
                printCard="5";
                break;
            case 32:
                printCard="6";
                break;
            case 33:
                printCard="7";
                break;
            case 34:
                printCard="8";
                break;
            case 35:
                printCard="9";
                break;
            case 36:
                printCard="10";
                break;
            case 37:
                printCard="Jack";
                break;
            case 38:
                printCard="Queen";
                break;
            case 39:
                printCard="King";
                break;
             case 40:
                printCard="Ace";
                break;
            case 41:
                printCard="2";
                break;
            case 42:
                printCard="3";
                break;
            case 43:
                printCard="4";
                break;
            case 44:
                printCard="5";
                break;
            case 45:
                printCard="6";
                break;
            case 46:
                printCard="7";
                break;
            case 47:
                printCard="8";
                break;
            case 48:
                printCard="9";
                break;
            case 49:
                printCard="10";
                break;
            case 50:
                printCard="Jack";
                break;
            case 51:
                printCard="Queen";
                break;
            case 52:
                printCard="King";
                break;   
        }
        
        if (card<=13){
            System.out.println("You picked the " + printCard + " of diamonds"); //prints card name of diamonds
        }
        else if (card>=14&&card<=26){
            System.out.println("You picked the " + printCard + " of clubs"); //prints card name of clubs
        }
        else if (card>=27&&card<=39){
            System.out.println("You have picked the " + printCard + " of hearts"); //prints card name of hearts
        }
        else if (card>=40&&card<=52){
            System.out.println("You have picked the " + printCard + " of spades"); //prints card name of spades
        }
    }
}