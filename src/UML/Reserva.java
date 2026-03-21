package UML;

import java.util.Date;

public class Reserva {
    Date dtReserva;
    String hrReserva;

    Livro livro;
    Leitor leitor;

    public Reserva() {
        dtReserva = new Date();
        hrReserva = "";
    }
}
