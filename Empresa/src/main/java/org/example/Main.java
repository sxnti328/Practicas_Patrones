package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Herramientas de exportación: una propia y una externa adaptada
        Exportador texto = new ExportadorTexto();
        Exportador pdf = new PDFAdapter(new LibreriaPDF());

        // Factory Method: cada fábrica decide qué documento crear
        FabricaDocumento fabricaFactura = new FabricaFactura();
        FabricaDocumento fabricaContrato = new FabricaContrato();
        FabricaDocumento fabricaInforme = new FabricaInforme();

        System.out.println("##### Exportador propio (texto) #####");
        fabricaFactura.generar(texto);

        System.out.println("##### Biblioteca externa de PDF (via Adapter) #####");
        fabricaContrato.generar(pdf);
        fabricaInforme.generar(pdf);

        // Builder: documento personalizado (solo los elementos que se necesitan)
        System.out.println("##### Documento personalizado con el Builder #####");
        Documento personalizado = new Informe.Builder()
                .conEncabezado("Informe trimestral (sin tabla)")
                .conGrafico("Grafico de lineas")
                .build();
        personalizado.mostrar();
        pdf.exportar(personalizado);
    }
}