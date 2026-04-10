package Facade.Transaction;

import java.util.UUID;

public class Main {
    void main() {
        ContaCorrente c1 = new ContaCorrente(uuidGenerator(), "Andrey", 50000);
        ContaCorrente c2 = new ContaCorrente(uuidGenerator(), "Davi");

        TransferenciaFacade facade = new TransferenciaFacade(c1, c2);
        facade.realizarTransferencia(10000);

        facade.consultarSaldo(c1);
        facade.consultarSaldo(c2);

        facade.listarTransferencias(c1);
        facade.listarTransferencias(c2);

        ContaCorrente c3 = new ContaCorrente(uuidGenerator(), "Anderson", 100000);
        facade.setContaOrigem(c3);
        facade.setContaDestino(c1);

        facade.realizarTransferencia(20000);

        facade.consultarSaldo(c3);
        facade.consultarSaldo(c1);

        facade.listarTransferencias(c1);
        facade.listarTransferencias(c2);
        facade.listarTransferencias(c3);
    }

    public String uuidGenerator() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
