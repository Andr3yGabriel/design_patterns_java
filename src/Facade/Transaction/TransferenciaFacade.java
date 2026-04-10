package Facade.Transaction;

public class TransferenciaFacade {
    private ContaCorrente contaOrigem;
    private ContaCorrente contaDestino;

    public TransferenciaFacade(ContaCorrente contaOrigem, ContaCorrente contaDestino) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void setContaOrigem(ContaCorrente contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public void setContaDestino(ContaCorrente contaDestino) {
        this.contaDestino = contaDestino;
    }

    public void listarTransferencias(ContaCorrente contaCorrente) {
        IO.println("\n==== Lista de Transferencias ====");
        for (Transferencia t : contaCorrente.getTransferencias()) {
            IO.println("Conta de origem: " + t.getNumeroContaOrigem());
            IO.println("Conta de destino: " + t.getNumeroContaDestino());
            IO.println("Valor da transferencia: R$" + t.getValorTransferencia());
        }
    }

    public void consultarSaldo(ContaCorrente contaCorrente) {
        IO.println("\n==== Consulta de saldo ====");
        IO.println("Conta: " + contaCorrente.getNumeroConta());
        IO.println("Titular: " + contaCorrente.getTitular());
        IO.println("Saldo: " + contaCorrente.getSaldo());
    }

    public void realizarTransferencia(double valorTransferencia) {
        IO.println("\n==== Realizando transferencia ====");
        IO.println("Conta de Origem: " + contaOrigem.getNumeroConta());
        IO.println("Conta de Destino: " + contaDestino.getNumeroConta());

        contaOrigem.debitar(valorTransferencia);
        contaDestino.creditar(valorTransferencia);

        Transferencia t = new Transferencia(valorTransferencia, contaOrigem.getNumeroConta(), contaDestino.getNumeroConta());
        contaOrigem.addTransferencia(t);
        contaDestino.addTransferencia(t);

        IO.println("Transferencia realizada com sucesso!");
    }
}
