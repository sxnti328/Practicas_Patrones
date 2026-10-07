package org.example;

public class FactoryArquero extends FactoryPersonaje {
    @Override
    public Personaje crearPersonaje() {
        return new PersonajeEstandar.Builder()
                .agregarArma(new Arma("Arco"))
                .agregarHabilidad(new Habilidad("Disparo certero"))
                .agregarHabilidad(new Habilidad("Lluvia de flechas"))
                .agregarAccesorio(new Accesorio("Carcaj"))
                .construir();
    }
}