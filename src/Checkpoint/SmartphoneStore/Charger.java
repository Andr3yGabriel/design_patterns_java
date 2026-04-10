package Checkpoint.SmartphoneStore;

public class Charger extends SmartphoneDecorator{
    public Charger(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescription() {
        return smartphone.getDescription() + ", Extra Charger";
    }

    @Override
    public double cost() {
        return smartphone.cost() + 100.00;
    }
}
