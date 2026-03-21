package Observer.Server;

import java.util.List;

public class ArCondicionado implements Observador {
    private boolean ligado = false;

    @Override
    public void update() {
        ligado = !ligado;
        if (ligado) {
            IO.println("Ar-condicionado ligado.");
        } else {
            IO.println("Ar-condicionado desligado.");
        }
    }
}
