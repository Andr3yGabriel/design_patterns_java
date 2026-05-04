package Builder.RPG;

public class Personagem {
    String nome;
    String classe;
    int forca;
    int destreza;
    int inteligencia;
    int agilidade;
    String cabeca;
    String peito;
    String maos;
    String pes;

    @Override
    public String toString() {
        return "Personagem: " + nome + " [" + classe + "]\n" +
               "Atributos - Força: " + forca + " | Destreza: " + destreza +
               " | Inteligência: " + inteligencia + " | Agilidade: " + agilidade + "\n" +
               "Vestimentas - Cabeça: " + cabeca + " | Peito: " + peito +
               " | Mãos: " + maos + " | Pés: " + pes;
    }
}
