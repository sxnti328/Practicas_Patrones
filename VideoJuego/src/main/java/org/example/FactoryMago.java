package org.example;

public class FactoryMago extends FactoryPersonaje {
    @Override
    public Personaje crearPersonaje() {
        return new PersonajeEstandar.Builder()
                .agregarArma(new Arma("Bastón"))
                .agregarHabilidad(new Habilidad("Bola de fuego"))
                .agregarHabilidad(new Habilidad("Teletransporte"))
                .agregarAccesorio(new Accesorio("Capa"))
                .construir();
    }
}