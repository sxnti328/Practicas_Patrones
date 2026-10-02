package org.example;

public class FabricaInforme extends FabricaDocumento{
    @Override
    public Documento crearDocumento() {
        return new Informe.Builder()
                .conEncabezado("Informe mensual de ventas")
                .conTabla("Ventas por region")
                .conGrafico("Grafico de barras")
                .build();
    }
}
