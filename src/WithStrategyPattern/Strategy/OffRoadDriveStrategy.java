package WithStrategyPattern.Strategy;

public class OffRoadDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("OffRoad Drive Capability");
    }
}
