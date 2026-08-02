package LLD.AdapterDesignePattern.Client;

import LLD.AdapterDesignePattern.Adaptee.BabyWeightMachine;
import LLD.AdapterDesignePattern.Adaptee.WeightMachine;
import LLD.AdapterDesignePattern.Adapter.WeightMachineAdapter;
import LLD.AdapterDesignePattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        
        WeightMachine weightMachinePound = new BabyWeightMachine();

        // This will return weight in pounds but client want it in kg
        System.out.println(weightMachinePound.getWeight());

        // Solution
        // Create an adapter which will convert weight from pound to kg , by sitting between client and adaptee

        WeightMachineAdapter weightMachineKg = new WeightMachineAdapterImpl(new BabyWeightMachine());

        System.out.println(weightMachineKg.getWeightKg());
        
    }

}
