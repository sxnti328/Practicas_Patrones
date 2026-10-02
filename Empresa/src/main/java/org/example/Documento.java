package org.example;

public abstract class Documento {
    protected String encabezado;

    public abstract String getTipo();

    public abstract void mostrar();


    public abstract String getContenido();

    @Override
    public String toString() {
        return "Documento{" +
                "encabezado='" + encabezado + '\'' +
                '}';
    }
}
