package Bridge.Alunos;

public class Mestrado implements INivelAcademico {
    @Override
    public String getNivel() { return "Mestrado"; }

    @Override
    public String getDescricao() { return "Programa de Mestrado Acadêmico ou Profissional"; }
}
