package Builder.Roupas;

public class ShortsBuilder implements IRoupaBuilder {
    private final Roupa roupa;

    public ShortsBuilder() {
        roupa = new Roupa();
        roupa.tipo = "Shorts";
    }

    @Override public IRoupaBuilder cor(String cor) { roupa.cor = cor; return this; }
    @Override public IRoupaBuilder tamanho(String tamanho) { roupa.tamanho = tamanho; return this; }
    @Override public IRoupaBuilder broche() { roupa.acessorios.add("broche"); return this; }
    @Override public IRoupaBuilder botao() { roupa.acessorios.add("botão"); return this; }
    @Override public IRoupaBuilder estampa(String estampa) { roupa.acessorios.add("estampa: " + estampa); return this; }
    @Override public Roupa build() { return roupa; }
}
