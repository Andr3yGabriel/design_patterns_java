package Bridge.MMA;

public class LutadorJapones extends Lutador {
    public LutadorJapones(String nome, IArtesMarciais artesMarciais) {
        super(nome, artesMarciais);
    }

    @Override
    public String getNacionalidade() { return "Japonês"; }
}
