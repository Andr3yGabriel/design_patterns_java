package Facade.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private final String numeroConta;
    private final String titular;
    private double saldo = 0;
    private final List<Transferencia> transferencias = new ArrayList<>();

    public ContaCorrente(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaCorrente(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
    }

    public void creditar(double valor) {
        this.saldo += valor;
    }

    public List<Transferencia> getTransferencias() {
        return transferencias;
    }

    public void addTransferencia(Transferencia transferencia) {
        transferencias.add(transferencia);
    }
}
