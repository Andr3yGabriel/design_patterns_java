package Observer.Siren;

public class Main {
    void main() {
        Sirene s = new Sirene();
        Operario o1 = new Operario("João");
        Operario o2 = new Operario("Maria");

        s.adicionarObservador(o1);
        s.adicionarObservador(o2);

        s.tocar();

        Operario o3 = new Operario("Carlos");
        s.adicionarObservador(o3);

        s.tocar();
    }
}
