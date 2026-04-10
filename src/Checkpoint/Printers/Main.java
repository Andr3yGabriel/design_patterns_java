package Checkpoint.Printers;

public class Main {
    void main() {
        AdministradorImpressoras admin = AdministradorImpressoras.uniqueInstance;
        Documento d1 = new Documento("Relatório Anual", "PDF");
        Documento d2 = new Documento("Apresentação de Vendas", "PPTX");
        Documento d3 = new Documento("Logo da empresa", "PNG");

        admin.addDocumento(d1);
        admin.addDocumento(d2);
        admin.addDocumento(d3);

        admin.listarDocumentos();

        admin.priorizaDocumento(d2);
        admin.listarDocumentos();

        admin.despriorizaDocumento(d1);
        admin.listarDocumentos();

        admin.removeDocumento(d1);
        admin.listarDocumentos();
    }
}
