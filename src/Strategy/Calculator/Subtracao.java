package Strategy.Calculator;

public class Subtracao implements ITipoOperacao{
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
