package code8;

import java.util.Scanner;


public class Code8 {
    public static boolean StillWorking = true;
    public static boolean Stop = false; 
    public static double FinalCost;
    public static void main(String[] args) {
    Scanner Georgia = new Scanner(System.in);
        Thing(Georgia,FinalCost);
        
    }
    
    
    public static void Thing(Scanner Georgia,double FinalCost){
    double Nei,Nsi,Ssi,Commer,Fam,Multi,TaxRate,PropertyValue,Choice3;
    Nei = .065;Nsi = .06;Ssi = .025;Commer = .005;Fam = .002;Multi = .003;
    //double tax = taxCalc(PropertyValue,TaxRate);
    int Choice1,Choice2;
    //SalesTax = 8.25;
    //do{
        
        String YoureTax = "Youre Volume is: ";
        String Greeting1 = ("\nWelcome to The Property Calculator \n What District are u in?\n[1]NEISD \n[2]NSISD\n[3]SSISD\n[4]Stop\n>");
        String Greeting2 = ("\nWelcome to The Property Calculator \n Press 1 Multi-Family \n Press 2 For Commercial\n Press 3 For Family\n Press 4 To Stop\n>");
        String ApV = ("Whats the properties apprasied value?\n>");
        
        System.out.print(Greeting1);
        Choice1 = Georgia.nextInt();
        System.out.print(Greeting2);
        Choice2 = Georgia.nextInt();
        System.out.print(ApV);
        PropertyValue = Georgia.nextDouble();
        TaxRate = TaxRateBuilder.TaxRateBB(Choice1, Choice2);
        FinalCost = TaxRateBuilder.taxCalc(PropertyValue, TaxRate);
        System.out.print(FinalCost+"\n");
        //}while(StillWorking);
    }

}
