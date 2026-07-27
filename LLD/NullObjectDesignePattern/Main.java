public class Main {

    private static void printVehicleDetails(Vehicle_ vehicle) {
        System.out.println("This vehicle has capacity of : " + vehicle.getSeatingCapacity() + " seats");
        System.out.println("This vehicle tank has capacity of : " + vehicle.getTankCapacity() + " ltr");
    }

    public static void main(String[] args) {

        Vehicle_ vehicle = VehicleFactory_.getVehicleObject("bike");
        printVehicleDetails(vehicle);

    }
}