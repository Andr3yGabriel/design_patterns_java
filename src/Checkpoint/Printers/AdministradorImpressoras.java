package Checkpoint.Printers;

import java.util.ArrayList;
import java.util.List;

public class AdministradorImpressoras {
    public static volatile AdministradorImpressoras uniqueInstance = new AdministradorImpressoras();
    private List<Documento> documentos;

    private AdministradorImpressoras() {
        documentos = new ArrayList<>();
    }

    public static AdministradorImpressoras getInstance() {
        if (uniqueInstance == null) {
            synchronized (AdministradorImpressoras.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new AdministradorImpressoras();
                }
            }
        }

        return uniqueInstance;
    }

    public void addDocumento(Documento documento) {
        IO.println("\nAdicionando novo documento" + documento.getTipoDocumento() + ": " + documento.getNome());
        documentos.add(documento);
    }

    public void removeDocumento(Documento documento) {
        IO.println("\nRemovendo documento: " + documento.getNome());
        documentos.remove(documento);
    }

    public void priorizaDocumento(Documento documento) {
        IO.println("\nPriorizando documento: " + documento.getNome());
        if (documentos.remove(documento)) {
            documentos.addFirst(documento);
        }
    }

    public void despriorizaDocumento(Documento documento) {
        IO.println("\nDespriorizando documento: " + documento.getNome());
        if (documentos.remove(documento)) {
            documentos.addLast(documento);
        }
    }

    public void listarDocumentos() {
        IO.println("\nListando documentos");
        int indice = 1;
        for (Documento documento : documentos) {
            IO.println(indice + "-" + "Nome: " + documento.getNome() + "\nTipo do Documento: " + documento.getTipoDocumento());
            indice++;
        }
    }
}
