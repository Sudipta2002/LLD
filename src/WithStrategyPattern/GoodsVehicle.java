package WithStrategyPattern;

import WithStrategyPattern.Strategy.OffRoadDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new OffRoadDriveStrategy());
    }
}
