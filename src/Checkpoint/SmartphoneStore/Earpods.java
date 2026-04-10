package Checkpoint.SmartphoneStore;

public class Earpods extends SmartphoneDecorator {
    public Earpods(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescription() {
        return smartphone.getDescription() + ", Earpods";
    }

    @Override
    public double cost() {
        return smartphone.cost() + 200.00;
    }
}
