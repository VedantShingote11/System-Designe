public class VehicleFactory_ {

    public static Vehicle_ getVehicleObject(String type){

        if("car".equals(type)){
            return new Car_();
        }

        // instead of null
        return new NullObject();

    }
}
