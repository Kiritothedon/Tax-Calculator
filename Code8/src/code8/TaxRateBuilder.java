package code8;
public class TaxRateBuilder extends Code8{

        public static double TaxRateBB(int Choice1 , int Choice2){
    double Nei,Nsi,Ssi,Commer,Fam,Multi,TaxRate = 0;
Nei = .065;Nsi = .06;Ssi = .025;Commer = .005;Fam = .002;Multi = .003;
    StillWorking = true;
    Stop = false;
  
switch(Choice1){
            case 1:
                TaxRate=Nei;
            break;
            case 2:
                TaxRate=Nsi;
                break;
            case 3:
                TaxRate=Ssi;
                break;
            case 4:
                StillWorking = Stop;
                break;
        }switch(Choice2){
            case 1:
                TaxRate+=Multi;
                break;
            case 2:
                TaxRate+=Commer;
                break;
            case 3:
                TaxRate+=Fam;
                break;
            case 4:
                StillWorking = Stop;
                break;
        }
            return TaxRate;
    }
    public static double taxCalc(double PropertyValue,double TaxRate){
        double FinalCost;
        FinalCost=PropertyValue*TaxRate;
        return FinalCost;
    }
}
