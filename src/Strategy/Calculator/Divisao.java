package Strategy.Calculator;

public class Divisao implements ITipoOperacao{
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero inválida!");
        }
        return a / b;
    }
}
