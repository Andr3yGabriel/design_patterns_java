package decorator.icecream;

public class Coverage extends IceCreamDecorator{
    String flavor;

    public Coverage(String f, IceCream i) {
        flavor = f;
        iceCream = i;
    }

    @Override
    public String getDescription() {
        String description =  "%s, %s %s";
        return String.format(description, iceCream.getDescription(), flavor, "coverage");
    }

    @Override
    public double cost() {
        return iceCream.cost() + 1.0;
    }
}
