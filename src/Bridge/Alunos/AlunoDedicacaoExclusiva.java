package Bridge.Alunos;

public class AlunoDedicacaoExclusiva extends Aluno {
    public AlunoDedicacaoExclusiva(String nome, INivelAcademico nivelAcademico) {
        super(nome, nivelAcademico);
    }

    @Override
    public String getDedicacao() { return "Dedicação Exclusiva"; }
}
