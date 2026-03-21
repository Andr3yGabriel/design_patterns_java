package Strategy.Formatter;

public class ImpressaoXML implements ITipoFormatacao{
    @Override
    public void imprimir(String conteudo) {
        IO.println("<?xml version=1.0 encoding=UTF-8>\n<document>\n\t<content>" + conteudo + "</content>\n</document>");
    }
}
