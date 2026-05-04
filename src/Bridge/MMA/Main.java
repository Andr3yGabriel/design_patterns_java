package Bridge.MMA;

public class Main {
    void main() {
        Lutador l1 = new LutadorBrasileiro("Anderson", new JiuJitsu());
        Lutador l2 = new LutadorSueco("Alexander", new Judo());
        Lutador l3 = new LutadorJapones("Katsuyori", new Karate());
        Lutador l4 = new LutadorBrasileiro("Lyoto", new Karate());

        l1.atacar();
        l1.defender();

        IO.println("");

        l2.atacar();
        l2.defender();

        IO.println("");

        l3.atacar();
        l3.defender();

        IO.println("");

        l4.atacar();
        l4.defender();
    }
}
