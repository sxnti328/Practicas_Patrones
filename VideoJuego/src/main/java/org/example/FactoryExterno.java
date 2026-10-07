package org.example;

public class FactoryExterno extends FactoryPersonaje {
    @Override
    public Personaje crearPersonaje() {
        return new AdapterExterno(new PersonajeExterno());
    }
}