package Checkpoint.SmartphoneStore;

public class ScreenProtector extends SmartphoneDecorator {
    public ScreenProtector(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescription() {
        return smartphone.getDescription() + ", Screen Protector";
    }

    @Override
    public double cost() {
        return smartphone.cost() + 70.00;
    }
}
