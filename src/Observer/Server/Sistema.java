package Observer.Server;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private int temp = 20;
    private final List<Observador> observadores;

    public Sistema() {
        observadores = new ArrayList<Observador>();
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void setTemp(int t) {
        IO.println("Temperatura atual: " + t);
        temp = t;
        notificarObservadores();
    }

    public void notificarObservadores() {
        if (temp <= 10 || temp >= 30) {
            for (Observador observador : observadores) {
                observador.update();
            }
        }
    }
}
