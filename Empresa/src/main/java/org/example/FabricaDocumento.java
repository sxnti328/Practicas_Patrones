package org.example;

public abstract class FabricaDocumento {
    public abstract Documento crearDocumento();

    // Crea el documento, lo muestra y lo exporta con la herramienta recibida

    public void generar(Exportador exportador) {
        Documento doc = crearDocumento();
        doc.mostrar();
        exportador.exportar(doc);
        System.out.println();
    }
}
