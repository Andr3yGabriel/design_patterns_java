package Builder.RPG;

public class Main {
    void main() {
        Personagem guerreiro = new GuerreiroBuilder()
                .nome("Aragorn")
                .forca(30).destreza(10).inteligencia(5).agilidade(5)
                .cabeca("Elmo de Ferro").peito("Armadura de Placas").maos("Luvas de Couro").pes("Botas de Aço")
                .build();
        IO.println(guerreiro);

        IO.println("");

        Personagem mago = new MagoBuilder()
                .nome("Gandalf")
                .forca(5).destreza(5).inteligencia(35).agilidade(5)
                .cabeca("Chapéu de Mago").peito("Manto Arcano").maos("Luvas Mágicas").pes("Sandálias Encantadas")
                .build();
        IO.println(mago);

        IO.println("");

        Personagem arqueiro = new ArqueiroBuilder()
                .nome("Legolas")
                .forca(5).destreza(30).inteligencia(5).agilidade(10)
                .cabeca("Capuz de Couro").peito("Colete de Couro").maos("Braçadeiras").pes("Botas Leves")
                .build();
        IO.println(arqueiro);

        IO.println("");

        Personagem ladrao = new LadraoBuilder()
                .nome("Bilbo")
                .forca(5).destreza(10).inteligencia(10).agilidade(25)
                .cabeca("Capuz Negro").peito("Gibão de Sombra").maos("Luvas Finas").pes("Botas Silenciosas")
                .build();
        IO.println(ladrao);
    }
}
