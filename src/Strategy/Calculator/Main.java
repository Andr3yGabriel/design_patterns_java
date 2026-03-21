package Strategy.Calculator;

public class Main {
    void main() {
        Calculadora calc = new Calculadora();

        double resultado = calc.somar(4,5);
        IO.println(resultado);

        resultado = calc.subtrair(4,5);
        IO.println(resultado);

        resultado = calc.multiplicar(4,5);
        IO.println(resultado);

        resultado = calc.dividir(4,5);
        IO.println(resultado);

        try {
            resultado = calc.dividir(4,0);
            IO.println(resultado);
        } catch (ArithmeticException e) {
            IO.println("Erro: " + e.getMessage());
        }
    }
}
