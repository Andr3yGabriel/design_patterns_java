package Strategy.Formatter;

public class ImpressaoHTML implements ITipoFormatacao {
    @Override
    public void imprimir(String conteudo) {
        IO.println("<html>\n\t<body>\n\t<p>" + conteudo + "</p>\n\t</body>\n</html>");
    }
}
