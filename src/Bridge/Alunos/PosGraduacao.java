package Bridge.Alunos;

public class PosGraduacao implements INivelAcademico {
    @Override
    public String getNivel() { return "Pós-Graduação"; }

    @Override
    public String getDescricao() { return "Curso de Especialização ou MBA"; }
}
