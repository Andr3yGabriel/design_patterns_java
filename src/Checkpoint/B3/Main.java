package Checkpoint.B3;

public class Main {
    void main() {
        Bolsa bolsa = new Bolsa();
        Observador i1 = new Investidor("Andrey");
        Observador i2 = new Investidor("Gabriel");

        bolsa.addObservador(i1);
        bolsa.addObservador(i2);

        bolsa.alterarValores(10);

        Observador i3 = new Investidor("Weslley");
        bolsa.addObservador(i3);

        bolsa.alterarValores(90);
        bolsa.alterarValores(50);
    }
}
