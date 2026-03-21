package Strategy.Formatter;

public class ImpressaoTXT implements ITipoFormatacao{
    @Override
    public void imprimir(String conteudo) {
        IO.println(conteudo);
    }
}
