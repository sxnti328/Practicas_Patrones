package org.example;

public class AdapterExterno implements Personaje {
    private PersonajeExterno externo;

    public AdapterExterno(PersonajeExterno externo) {
        this.externo = externo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Adaptando personaje externo...");
        externo.obtenerFicha();
    }
}