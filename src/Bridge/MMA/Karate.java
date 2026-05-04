package Bridge.MMA;

public class Karate implements IArtesMarciais {
    @Override
    public String atacar() { return "golpe de karatê"; }

    @Override
    public String defender() { return "bloqueio de karatê"; }
}
