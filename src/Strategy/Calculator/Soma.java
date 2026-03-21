package Strategy.Calculator;

public class Soma  implements ITipoOperacao{
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
