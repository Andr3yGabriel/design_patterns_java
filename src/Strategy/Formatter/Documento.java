package Strategy.Formatter;

public class Documento {
    private String conteudo;
    private ITipoFormatacao tipoFormatacao;

    public Documento(String c) {
        conteudo = c;
    }

    public void setTipoFormatacao(ITipoFormatacao t) {
        tipoFormatacao = t;
    }

    public void imprimir() {
        try {
            tipoFormatacao.imprimir(conteudo);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
