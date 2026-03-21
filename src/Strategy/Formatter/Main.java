package Strategy.Formatter;

public class Main {
    void main() {
        Documento doc = new Documento("Olá, mundo!");
        ITipoFormatacao formatacao = new ImpressaoHTML();

        doc.setTipoFormatacao(formatacao);
        doc.imprimir();

        formatacao = new ImpressaoDOC();
        doc.setTipoFormatacao(formatacao);
        doc.imprimir();

        formatacao = new ImpressaoTXT();
        doc.setTipoFormatacao(formatacao);
        doc.imprimir();

        formatacao = new ImpressaoXML();
        doc.setTipoFormatacao(formatacao);
        doc.imprimir();
    }
}
