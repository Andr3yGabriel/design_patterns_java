package Builder.Roupas;

public class Main {
    void main() {
        Roupa calca = new CalcaBuilder().cor("azul").tamanho("M").botao().build();
        IO.println(calca);

        Roupa blusa = new BlusaBuilder().cor("branco").tamanho("G").broche().estampa("floral").build();
        IO.println(blusa);

        Roupa top = new TopBuilder().cor("preto").tamanho("P").estampa("listrado").build();
        IO.println(top);

        Roupa shorts = new ShortsBuilder().cor("verde").tamanho("GG").build();
        IO.println(shorts);

        IO.println("");

        FabricaRoupas fabrica = new FabricaRoupas();
        Roupa calcaBasica = fabrica.confeccionar(new CalcaBuilder(), "cinza", "G");
        IO.println(calcaBasica);

        Roupa blusaCompleta = fabrica.confeccionarComAcessorios(new BlusaBuilder(), "vermelho", "M");
        IO.println(blusaCompleta);
    }
}
