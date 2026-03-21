package decorator.icecream;

public class Nut extends IceCreamDecorator{
    public Nut(IceCream ice) {
        iceCream = ice;
    }

    @Override
    public String getDescription() {
        String description =  "%s, %s";
        return String.format(description, iceCream.getDescription(), "Nuts");
    }

    @Override
    public double cost() {
        return iceCream.cost() + .5;
    }
}
