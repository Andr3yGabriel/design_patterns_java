package Bridge.Alunos;

public class Graduacao implements INivelAcademico {
    @Override
    public String getNivel() { return "Graduação"; }

    @Override
    public String getDescricao() { return "Curso de Bacharelado ou Licenciatura"; }
}
