package Bridge.MMA;

public class LutadorBrasileiro extends Lutador {
    public LutadorBrasileiro(String nome, IArtesMarciais artesMarciais) {
        super(nome, artesMarciais);
    }

    @Override
    public String getNacionalidade() { return "Brasileiro"; }
}
