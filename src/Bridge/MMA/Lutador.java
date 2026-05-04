package Bridge.MMA;

public abstract class Lutador {
    protected String nome;
    protected IArtesMarciais artesMarciais;

    public Lutador(String nome, IArtesMarciais artesMarciais) {
        this.nome = nome;
        this.artesMarciais = artesMarciais;
    }

    public abstract String getNacionalidade();

    public void atacar() {
        IO.println(nome + " (" + getNacionalidade() + ") ataca com: " + artesMarciais.atacar());
    }

    public void defender() {
        IO.println(nome + " (" + getNacionalidade() + ") defende com: " + artesMarciais.defender());
    }
}
