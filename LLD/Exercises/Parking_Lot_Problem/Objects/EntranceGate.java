package Exercises.Parking_Lot_Problem.Objects;

import Exercises.Parking_Lot_Problem.Objects.ParkingSpot.ParkingSpot;
import Exercises.Parking_Lot_Problem.Objects.ParkingSpotManager.ParkingSpotManager;

public class EntranceGate {
    
    Ticket ticket;
    ParkingSpotManager parkingSpotManager;
    ParkingSpot parkingSpot;

    EntranceGate(Ticket ticket , ParkingSpotManager parkingSpotManager , ParkingSpot parkingSpot){
        this.ticket = ticket;
        this.parkingSpot = parkingSpot;
        this.parkingSpotManager = parkingSpotManager;
    }

    // Function : Find parking space
    // Function : Book Spot
    // Function : Generate Ticket
     
}
