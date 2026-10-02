package org.example;

public class FabricaFactura extends FabricaDocumento{
    @Override
    public Documento crearDocumento() {
        return new Factura.Builder()
                .conEncabezado("Empresa XYZ - NIT 900.123.456")
                .conTabla("Producto A x2 | Producto B x1 | Total $150.000")
                .conFirma("Contador general")
                .build();
    }
}
