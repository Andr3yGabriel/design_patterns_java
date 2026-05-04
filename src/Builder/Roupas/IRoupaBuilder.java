package Builder.Roupas;

public interface IRoupaBuilder {
    IRoupaBuilder cor(String cor);
    IRoupaBuilder tamanho(String tamanho);
    IRoupaBuilder broche();
    IRoupaBuilder botao();
    IRoupaBuilder estampa(String estampa);
    Roupa build();
}
