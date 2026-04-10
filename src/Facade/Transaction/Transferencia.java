package Facade.Transaction;

public class Transferencia {
    private final double valorTransferencia;
    private final String numeroContaOrigem;
    private final String numeroContaDestino;

    public Transferencia(double valorTransferencia, String numeroContaOrigem, String numeroContaDestino) {
        this.valorTransferencia = valorTransferencia;
        this.numeroContaOrigem = numeroContaOrigem;
        this.numeroContaDestino = numeroContaDestino;
    }

    public double getValorTransferencia() {
        return valorTransferencia;
    }

    public String getNumeroContaOrigem() {
        return numeroContaOrigem;
    }

    public String getNumeroContaDestino() {
        return numeroContaDestino;
    }
}
