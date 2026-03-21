package decorator.icecream;

public class Coffee extends IceCream{
    public Coffee() {
        description = "Coffee ice cream";
    }

    @Override
    public double cost() {
        return 3.49;
    }
}
