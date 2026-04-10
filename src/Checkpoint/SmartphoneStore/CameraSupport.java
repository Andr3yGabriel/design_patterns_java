package Checkpoint.SmartphoneStore;

public class CameraSupport extends SmartphoneDecorator{
    public CameraSupport(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescription() {
        return smartphone.getDescription() + ", Camera Support";
    }

    @Override
    public double cost() {
        return smartphone.cost() + 400.00;
    }
}
