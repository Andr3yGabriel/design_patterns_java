package decorator.icecream;

public abstract class IceCream {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
