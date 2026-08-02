package LLD.AdapterDesignePattern.Adaptee;

public class BabyWeightMachine implements WeightMachine {
    
    @Override
    public double getWeight(){
        System.out.println("This weight is in pounds -");
        return 28;
    }

}
