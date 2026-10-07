package org.example;

public class FactoryGuerrero extends FactoryPersonaje {
    @Override
    public Personaje crearPersonaje() {
        return new PersonajeEstandar.Builder()
                .agregarArma(new Arma("Espada"))
                .agregarHabilidad(new Habilidad("Golpe fuerte"))
                .agregarHabilidad(new Habilidad("Grito de guerra"))
                .agregarAccesorio(new Accesorio("Escudo"))
                .construir();
    }
}