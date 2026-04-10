package Checkpoint.SmartphoneStore;

public class Iphone17 extends Smartphone {
    public Iphone17() {
        description = "iPhone 17";
    }

    @Override
    public double cost() {
        double price = 7999.90;
        double discount;
        switch (client.getClientType()) {
            case VIP -> discount = 0.10;
            case PREMIUM -> discount = 0.20;
            default -> discount = 0.0;
        }
        price -= price * discount;
        return price;
    }
}
