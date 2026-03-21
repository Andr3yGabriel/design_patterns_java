package Observer.Server;

public class Main {
    void main() {
        Sistema sis = new Sistema();

        sis.adicionarObservador(new ArCondicionado());
        sis.setTemp(35);

        sis.setTemp(5);
    }
}
