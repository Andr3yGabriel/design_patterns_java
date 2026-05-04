package Builder.Roupas;

import java.util.ArrayList;
import java.util.List;

public class Roupa {
    String tipo;
    String cor;
    String tamanho;
    List<String> acessorios;

    Roupa() {
        acessorios = new ArrayList<>();
    }

    @Override
    public String toString() {
        String acc = acessorios.isEmpty() ? "nenhum" : String.join(", ", acessorios);
        return tipo + " | Cor: " + cor + " | Tamanho: " + tamanho + " | Acessórios: " + acc;
    }
}
