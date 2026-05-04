package Builder.RPG;

public interface IPersonagemBuilder {
    IPersonagemBuilder nome(String nome);
    IPersonagemBuilder forca(int valor);
    IPersonagemBuilder destreza(int valor);
    IPersonagemBuilder inteligencia(int valor);
    IPersonagemBuilder agilidade(int valor);
    IPersonagemBuilder cabeca(String item);
    IPersonagemBuilder peito(String item);
    IPersonagemBuilder maos(String item);
    IPersonagemBuilder pes(String item);
    Personagem build();
}
