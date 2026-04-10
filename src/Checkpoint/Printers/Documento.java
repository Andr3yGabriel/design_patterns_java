package Checkpoint.Printers;

public class Documento {
    private final String nome;
    private final String tipoDocumento;

    public Documento(String nome, String tipoDocumento) {
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
}
