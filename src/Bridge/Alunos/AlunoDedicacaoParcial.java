package Bridge.Alunos;

public class AlunoDedicacaoParcial extends Aluno {
    public AlunoDedicacaoParcial(String nome, INivelAcademico nivelAcademico) {
        super(nome, nivelAcademico);
    }

    @Override
    public String getDedicacao() { return "Dedicação Parcial"; }
}
