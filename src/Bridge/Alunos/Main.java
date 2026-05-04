package Bridge.Alunos;

public class Main {
    void main() {
        Aluno a1 = new AlunoDedicacaoExclusiva("Carlos", new Graduacao());
        Aluno a2 = new AlunoDedicacaoParcial("Ana", new PosGraduacao());
        Aluno a3 = new AlunoDedicacaoExclusiva("Marcos", new Mestrado());
        Aluno a4 = new AlunoDedicacaoParcial("Beatriz", new Doutorado());

        IO.println(a1);
        IO.println(a2);
        IO.println(a3);
        IO.println(a4);
    }
}
