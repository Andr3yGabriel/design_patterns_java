package Bridge.MMA;

public class LutadorSueco extends Lutador {
    public LutadorSueco(String nome, IArtesMarciais artesMarciais) {
        super(nome, artesMarciais);
    }

    @Override
    public String getNacionalidade() { return "Sueco"; }
}
