package decorator.icecream;

public class Main {
    void main() {
        IceCream iceCream1 = new Chocolate();
        IceCream iceCream2 = new Vanilla();
        IceCream iceCream3 = new Coffee();

        IO.println(iceCream1.getDescription() + "\n" + iceCream1.cost());
        IO.println(iceCream2.getDescription() + "\n" + iceCream2.cost());
        IO.println(iceCream3.getDescription() + "\n" + iceCream3.cost());

        IceCream chocolateCoverage = new Coverage("vanila", iceCream1);
        IceCream vanillaCookies = new Cookies(iceCream2);
        IceCream coffeeNuts = new Nut(iceCream3);

        IO.println(chocolateCoverage.getDescription() + "\n" + chocolateCoverage.cost());
        IO.println(vanillaCookies.getDescription() + "\n" + vanillaCookies.cost());
        IO.println(coffeeNuts.getDescription() + "\n" + coffeeNuts.cost());
    }
}
