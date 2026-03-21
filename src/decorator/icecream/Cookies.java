package decorator.icecream;

public class Cookies extends IceCreamDecorator{
    public Cookies(IceCream ice) {
        iceCream = ice;
    }

    @Override
    public String getDescription() {
        String description =  "%s, %s";
        return String.format(description, iceCream.getDescription(), "Cookies");
    }

    @Override
    public double cost() {
        return iceCream.cost() + 1.50;
    }
}
