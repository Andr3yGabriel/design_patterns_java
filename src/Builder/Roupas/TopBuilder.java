package Builder.Roupas;

public class TopBuilder implements IRoupaBuilder {
    private final Roupa roupa;

    public TopBuilder() {
        roupa = new Roupa();
        roupa.tipo = "Top";
    }

    @Override public IRoupaBuilder cor(String cor) { roupa.cor = cor; return this; }
    @Override public IRoupaBuilder tamanho(String tamanho) { roupa.tamanho = tamanho; return this; }
    @Override public IRoupaBuilder broche() { roupa.acessorios.add("broche"); return this; }
    @Override public IRoupaBuilder botao() { roupa.acessorios.add("botão"); return this; }
    @Override public IRoupaBuilder estampa(String estampa) { roupa.acessorios.add("estampa: " + estampa); return this; }
    @Override public Roupa build() { return roupa; }
}
