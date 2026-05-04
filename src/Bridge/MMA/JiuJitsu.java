package Bridge.MMA;

public class JiuJitsu implements IArtesMarciais {
    @Override
    public String atacar() { return "finalização de jiu-jitsu"; }

    @Override
    public String defender() { return "guarda de jiu-jitsu"; }
}
