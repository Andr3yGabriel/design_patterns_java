package Builder.Roupas;

public class FabricaRoupas {
    public Roupa confeccionar(IRoupaBuilder builder, String cor, String tamanho) {
        return builder.cor(cor).tamanho(tamanho).build();
    }

    public Roupa confeccionarComAcessorios(IRoupaBuilder builder, String cor, String tamanho) {
        return builder.cor(cor).tamanho(tamanho).broche().botao().estampa("floral").build();
    }
}
