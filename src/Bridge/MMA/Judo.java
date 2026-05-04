package Bridge.MMA;

public class Judo implements IArtesMarciais {
    @Override
    public String atacar() { return "arremesso de judô"; }

    @Override
    public String defender() { return "esquiva de judô"; }
}
