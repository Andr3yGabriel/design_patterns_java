package UML;

import java.util.List;

public class Livro {
    String cdLivro;
    String nmLivro;

    List<Emprestimo> emprestimos;
    List<Reserva> reservas;

    public Livro() {
        cdLivro = "";
        nmLivro = "";
    }
}
