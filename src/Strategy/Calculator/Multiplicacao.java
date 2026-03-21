package Strategy.Calculator;

public class Multiplicacao implements ITipoOperacao{
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
