package Builder.RPG;

public class GuerreiroBuilder implements IPersonagemBuilder {
    private final Personagem personagem;

    public GuerreiroBuilder() {
        personagem = new Personagem();
        personagem.classe = "Guerreiro";
    }

    @Override public IPersonagemBuilder nome(String nome) { personagem.nome = nome; return this; }
    @Override public IPersonagemBuilder forca(int v) { personagem.forca = v; return this; }
    @Override public IPersonagemBuilder destreza(int v) { personagem.destreza = v; return this; }
    @Override public IPersonagemBuilder inteligencia(int v) { personagem.inteligencia = v; return this; }
    @Override public IPersonagemBuilder agilidade(int v) { personagem.agilidade = v; return this; }
    @Override public IPersonagemBuilder cabeca(String item) { personagem.cabeca = item; return this; }
    @Override public IPersonagemBuilder peito(String item) { personagem.peito = item; return this; }
    @Override public IPersonagemBuilder maos(String item) { personagem.maos = item; return this; }
    @Override public IPersonagemBuilder pes(String item) { personagem.pes = item; return this; }

    @Override
    public Personagem build() {
        int total = personagem.forca + personagem.destreza + personagem.inteligencia + personagem.agilidade;
        if (total != 50) throw new IllegalStateException("Total de pontos deve ser 50. Atual: " + total);
        if (personagem.forca < 25) throw new IllegalStateException("Guerreiro deve ter ao menos 25 pontos em Força.");
        return personagem;
    }
}
