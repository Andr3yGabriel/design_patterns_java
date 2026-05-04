package Bridge.Alunos;

public abstract class Aluno {
    protected String nome;
    protected INivelAcademico nivelAcademico;

    public Aluno(String nome, INivelAcademico nivelAcademico) {
        this.nome = nome;
        this.nivelAcademico = nivelAcademico;
    }

    public abstract String getDedicacao();

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Nível: " + nivelAcademico.getNivel() +
               " | Dedicação: " + getDedicacao() + " | " + nivelAcademico.getDescricao();
    }
}
