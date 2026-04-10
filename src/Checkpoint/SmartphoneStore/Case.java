package Checkpoint.SmartphoneStore;

public class Case extends SmartphoneDecorator{
    public Case(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescription() {
        return smartphone.getDescription() + ", Case";
    }

    @Override
    public double cost() {
        return smartphone.cost() + 120.00;
    }
}
