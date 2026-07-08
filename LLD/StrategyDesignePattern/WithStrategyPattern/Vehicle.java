package WithStrategyPattern;
import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;
    Vehicle(DriveStrategy ob){
        this.obj = ob;
    }

    public void drive(){
        obj.drive();
    }
}
