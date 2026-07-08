package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Drive with Normal Capability");
    }
}
