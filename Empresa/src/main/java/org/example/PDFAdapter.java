package org.example;

public class PDFAdapter implements Exportador{
    private final LibreriaPDF libreria;

    public PDFAdapter(LibreriaPDF libreria) {
        this.libreria = libreria;
    }

    @Override
    public void exportar(Documento doc) {
        libreria.crearPdf(doc.getTipo(), doc.getContenido());
    }
}
