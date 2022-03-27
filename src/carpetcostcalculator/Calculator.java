package carpetcostcalculator;

public class Calculator {
    Floor floor;
    Carpet carpet;


    public  Calculator(Floor floor,Carpet carpet){
        this.carpet=carpet;
        this.floor=floor;

    }
 // instance method
 public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
 }


}
