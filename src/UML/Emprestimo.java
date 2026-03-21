package UML;

import java.time.Instant;
import java.util.Date;

public class Emprestimo {
    int nrEmprestimo;
    Date dtEmprestimo;
    Date dtDevolucao;

    Livro livro;
    Leitor leitor;

    public Emprestimo() {
        nrEmprestimo = 0;
        dtEmprestimo = new Date();
        // Data de devolução definida para uma semana após o empréstimo
        dtDevolucao = Date.from(Instant.now().plusSeconds(7 * 24 * 60 * 60));
    }
}
