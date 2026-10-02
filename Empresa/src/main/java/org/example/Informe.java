package org.example;


public class Informe extends Documento {

    private String tabla;
    private String grafico;

    private Informe(Builder b) {
        this.encabezado = b.encabezado;
        this.tabla = b.tabla;
        this.grafico = b.grafico;
    }

    @Override
    public String getTipo() {
        return "Informe";
    }

    @Override
    public void mostrar() {
        System.out.println("=== INFORME ===");
        System.out.println("Encabezado: " + encabezado);
        if (tabla != null) System.out.println("Tabla: " + tabla);
        if (grafico != null) System.out.println("Grafico: " + grafico);
    }

    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder("Encabezado: " + encabezado);
        if (tabla != null) sb.append(" | Tabla: ").append(tabla);
        if (grafico != null) sb.append(" | Grafico: ").append(grafico);
        return sb.toString();
    }

    // ---------- BUILDER INTERNO ----------
    public static class Builder {
        private String encabezado;
        private String tabla;
        private String grafico;

        public Builder conEncabezado(String e) { this.encabezado = e; return this; }
        public Builder conTabla(String t)      { this.tabla = t;      return this; }
        public Builder conGrafico(String g)    { this.grafico = g;    return this; }

        public Informe build() {
            if (encabezado == null) {
                throw new IllegalStateException("El informe necesita un encabezado");
            }
            return new Informe(this);
        }
    }
}