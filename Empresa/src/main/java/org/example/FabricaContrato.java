package org.example;

public class FabricaContrato extends FabricaDocumento {
    @Override
    public Documento crearDocumento() {
        return new Contrato.Builder()
                .conEncabezado("Contrato de prestacion de servicios")
                .conClausulas("1. Objeto | 2. Duracion | 3. Valor y forma de pago")
                .conFirma("Cliente y representante de la empresa")
                .build();
    }
}
