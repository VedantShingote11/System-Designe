package Exercises.Parking_Lot_Problem.Objects;

import Exercises.Parking_Lot_Problem.Utils.VehicleType;

public class Vehicle {

    int no;
    VehicleType type;

    public Vehicle(int no, VehicleType type) {
        this.type = type;
        this.no = no;
    }

    public String getVehicleType() {
        return type.getVehicleType();
    }
}
