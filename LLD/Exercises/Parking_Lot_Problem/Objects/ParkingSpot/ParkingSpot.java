package Exercises.Parking_Lot_Problem.Objects.ParkingSpot;

import Exercises.Parking_Lot_Problem.Objects.Vehicle;

public class ParkingSpot {
    
    Vehicle vehicle;
    int price;
    boolean isEmpty;

    ParkingSpot(int price){
        this.price = price;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }

    public int getPrice(){
        return price;
    }

}
