package decorator.icecream;

public class Vanilla extends IceCream {
    public Vanilla() {
        description = "Vanilla ice cream";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
