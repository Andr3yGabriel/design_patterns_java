package Bridge.Alunos;

public class Doutorado implements INivelAcademico {
    @Override
    public String getNivel() { return "Doutorado"; }

    @Override
    public String getDescricao() { return "Programa de Doutorado"; }
}
