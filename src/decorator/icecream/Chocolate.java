package decorator.icecream;

public class Chocolate extends IceCream{
    public Chocolate() {
        description = "Chocolate ice cream";
    }

    @Override
    public double cost() {
        return 4.99;
    }
}
