package org.example;

public class Factura extends Documento {

    private String tabla;
    private String firma;

    private Factura(Builder b) {
        this.encabezado = b.encabezado;
        this.tabla = b.tabla;
        this.firma = b.firma;
    }

    @Override
    public String getTipo() {
        return "Factura";
    }

    @Override
    public void mostrar() {
        System.out.println("=== FACTURA ===");
        System.out.println("Encabezado: " + encabezado);
        if (tabla != null) System.out.println("Tabla: " + tabla);
        if (firma != null) System.out.println("Firma: " + firma);
    }

    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder("Encabezado: " + encabezado);
        if (tabla != null) sb.append(" | Tabla: ").append(tabla);
        if (firma != null) sb.append(" | Firma: ").append(firma);
        return sb.toString();
    }

    // ---------- BUILDER INTERNO ----------
    public static class Builder {
        private String encabezado;
        private String tabla;
        private String firma;

        public Builder conEncabezado(String e) { this.encabezado = e; return this; }
        public Builder conTabla(String t)      { this.tabla = t;      return this; }
        public Builder conFirma(String f)      { this.firma = f;      return this; }

        public Factura build() {
            if (encabezado == null) {
                throw new IllegalStateException("La factura necesita un encabezado");
            }
            return new Factura(this);
        }
    }
}
