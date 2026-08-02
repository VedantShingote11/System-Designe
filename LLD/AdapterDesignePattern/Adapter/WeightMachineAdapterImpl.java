package LLD.AdapterDesignePattern.Adapter;

import LLD.AdapterDesignePattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine machine){
        this.weightMachine = machine;
    }

    @Override
    public double getWeightKg(){
        System.out.println("This is weight in kg -");
        return weightMachine.getWeight() * 0.453;
    }

}
