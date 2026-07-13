package Exercises.Parking_Lot_Problem.Utils;

public enum VehicleType {
    
    TWO_WHEELER("2W"),
    FOUR_WHEELER("4W");

    private final String type;

    VehicleType(String type) {
        this.type = type;
    }

    public String getVehicleType() {
        return type;
    }

}
