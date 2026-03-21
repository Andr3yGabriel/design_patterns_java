package Strategy.Formatter;

public class ImpressaoDOC implements ITipoFormatacao{
    @Override
    public void imprimir(String conteudo) {
        IO.println("Documento criado com conteudo: " + conteudo);
    }
}
