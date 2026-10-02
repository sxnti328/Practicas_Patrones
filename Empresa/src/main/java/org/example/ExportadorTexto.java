package org.example;

public class ExportadorTexto implements Exportador {

    @Override
    public void exportar(Documento doc) {
        System.out.println("[Texto] Exportando " + doc.getTipo() + " a archivo .txt");
        System.out.println("[Texto] " + doc.getContenido());
    }
}