package Exercises.Parking_Lot_Problem.Objects;

import Exercises.Parking_Lot_Problem.Objects.ParkingSpot.ParkingSpot;

public class Ticket {
    
    int id;
    long entryTime;
    Vehicle vehicle;
    ParkingSpot slot;

    public Ticket(int id , long entryTime , Vehicle vehicle , ParkingSpot slot){
        this.id = id;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.slot = slot;
    }

    // Getters & Setters
}
