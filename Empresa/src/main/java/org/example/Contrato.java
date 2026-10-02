package org.example;

public class Contrato extends Documento {

    private String clausulas;
    private String firma;

    private Contrato(Builder b) {
        this.encabezado = b.encabezado;
        this.clausulas = b.clausulas;
        this.firma = b.firma;
    }

    @Override
    public String getTipo() {
        return "Contrato";
    }

    @Override
    public void mostrar() {
        System.out.println("=== CONTRATO ===");
        System.out.println("Encabezado: " + encabezado);
        if (clausulas != null) System.out.println("Clausulas: " + clausulas);
        if (firma != null) System.out.println("Firma: " + firma);
    }

    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder("Encabezado: " + encabezado);
        if (clausulas != null) sb.append(" | Clausulas: ").append(clausulas);
        if (firma != null) sb.append(" | Firma: ").append(firma);
        return sb.toString();
    }

    // ---------- BUILDER INTERNO ----------
    public static class Builder {
        private String encabezado;
        private String clausulas;
        private String firma;

        public Builder conEncabezado(String e) { this.encabezado = e; return this; }
        public Builder conClausulas(String c)  { this.clausulas = c;  return this; }
        public Builder conFirma(String f)      { this.firma = f;      return this; }

        public Contrato build() {
            if (encabezado == null) {
                throw new IllegalStateException("El contrato necesita un encabezado");
            }
            return new Contrato(this);
        }
    }
}
