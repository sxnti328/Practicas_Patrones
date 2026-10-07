package org.example;

public class Main {
    public static void main(String[] args) {
        FactoryPersonaje factory;
        Personaje personaje;

        System.out.println("--- Guerrero ---");
        factory = new FactoryGuerrero();
        personaje = factory.crearPersonaje();
        personaje.mostrarInfo();

        System.out.println("--- Mago ---");
        factory = new FactoryMago();
        personaje = factory.crearPersonaje();
        personaje.mostrarInfo();

        System.out.println("--- Arquero ---");
        factory = new FactoryArquero();
        personaje = factory.crearPersonaje();
        personaje.mostrarInfo();

        System.out.println("--- Personaje externo ---");
        factory = new FactoryExterno();
        personaje = factory.crearPersonaje();
        personaje.mostrarInfo();
    }
}