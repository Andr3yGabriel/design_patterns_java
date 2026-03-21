package Strategy.Calculator;

public class Calculadora {
    private ITipoOperacao soma;
    private ITipoOperacao subtracao;
    private ITipoOperacao multiplicacao;
    private ITipoOperacao divisao;

    public Calculadora() {
        this.soma = new Soma();
        this.subtracao = new Subtracao();
        this.multiplicacao = new Multiplicacao();
        this.divisao = new Divisao();
    }

    public double somar(double a, double b) {
        return soma.calcular(a, b);
    }

    public double subtrair(double a, double b) {
        return subtracao.calcular(a, b);
    }

    public double multiplicar(double a, double b) {
        return multiplicacao.calcular(a, b);
    }

    public double dividir(double a, double b) {
        return divisao.calcular(a, b);
    }
}
