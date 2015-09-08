//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Rebecca Woods
//CSE2
//September 6, 2015
//hw02
//Arithmetic Java Program
//
//  Purpose: to compute the cost of item bought, including PA sales tax
//

public class Arithmetic{
    
    public static void main(String[] args)  {
        
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //('$' is part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //Cost per box of envelopes
    double envelopeCost$=3.25;
    
    //Percent tax in PA
    double taxPercent=0.06;
    
    double totalSockCost$=(nSocks*sockCost$),                                                                    //total cost of socks before tax
           socksTax$=((int)(100*totalSockCost$*taxPercent)/100.0),                                               //tax cost on socks
           totalSockCostWithTax$=(socksTax$+totalSockCost$),                                                     //total cost of socks with tax
           totalGlassCost$=(nGlasses*glassCost$),                                                                //total cost of drinking glasses before tax
           glassesTax$=((int)(100*totalGlassCost$*taxPercent)/100.0),                                            //tax cost on drinking glasses
           totalGlassCostWithTax$=(glassesTax$+totalGlassCost$),                                                 //total cost of glasses with tax
           totalEnvelopeCost$=(nEnvelopes*envelopeCost$),                                                        //total cost of envelope boxes before tax
           envelopeTax$=((int)(100*totalEnvelopeCost$*taxPercent)/100.0),                                        //tax cost on envelopes
           totalEnvelopeCostWithTax$=((envelopeTax$)+totalEnvelopeCost$),                                        //total cost of envelope boxes with tax
           totalPurchaseCost$=((int)(100*(totalEnvelopeCost$+totalGlassCost$+totalSockCost$))/100.0),              //total cost of purchase without tax
           totalSalesTax$=(socksTax$+glassesTax$+envelopeTax$),                                                  //total sales tax
           finalCost$=((int)(100*(totalSockCostWithTax$+totalGlassCostWithTax$+totalEnvelopeCostWithTax$))/100.0); //final cost of purchase (tax included)
           
           
    //Socks purchase
    System.out.println("Socks");
    System.out.println("Number of pairs: "+nSocks);
    System.out.println("Cost per pair: $"+sockCost$);
    System.out.println("Cost of total number of pairs: $"+(totalSockCost$));
    System.out.println("Sales tax for socks: $"+(socksTax$));
    
    //Drinking Glasses purchase
    System.out.println("                ");
    System.out.println("Drinking Glasses");
    System.out.println("Number of glasses: "+nGlasses);
    System.out.println("Cost per glass: $"+(glassCost$));
    System.out.println("Cost of total number of glasses: $"+(totalGlassCost$));
    System.out.println("Sales tax for glasses: $"+(glassesTax$));
    
    //Boxes of Envelopes purchase
    System.out.println("                  ");
    System.out.println("Boxes of Envelopes");
    System.out.println("Number of boxes: "+nEnvelopes);
    System.out.println("Cost per box: $"+envelopeCost$);
    System.out.println("Cost of total number of boxes: $"+(totalEnvelopeCost$));
    System.out.println("Sales tax for boxes of envelopes: $"+(envelopeTax$));
    
    //Total purchases
    System.out.println("               ");
    System.out.println("Total purchases");
    System.out.println("Total cost before tax: $"+totalPurchaseCost$);
    System.out.println("Total sales tax: $"+totalSalesTax$);
    System.out.println("Total cost of purchases including sales tax: $"+finalCost$+"0");
    }
}