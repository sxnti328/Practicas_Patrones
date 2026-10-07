package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonajeEstandar implements Personaje {
    private Arma arma;
    private List<Habilidad> habilidades;
    private List<Accesorio> accesorios;

    private PersonajeEstandar(Builder builder) {
        this.arma = builder.arma;
        this.habilidades = builder.habilidades;
        this.accesorios = builder.accesorios;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Arma: " + arma.getNombre());
        System.out.println("Habilidades:");
        for (Habilidad h : habilidades) {
            System.out.println("  - " + h.getNombre());
        }
        System.out.println("Accesorios:");
        for (Accesorio a : accesorios) {
            System.out.println("  - " + a.getNombre());
        }
    }

    public static class Builder {
        private Arma arma;
        private List<Habilidad> habilidades = new ArrayList<>();
        private List<Accesorio> accesorios = new ArrayList<>();

        public Builder agregarArma(Arma arma) {
            this.arma = arma;
            return this;
        }

        public Builder agregarHabilidad(Habilidad habilidad) {
            habilidades.add(habilidad);
            return this;
        }

        public Builder agregarAccesorio(Accesorio accesorio) {
            accesorios.add(accesorio);
            return this;
        }

        public PersonajeEstandar construir() {
            return new PersonajeEstandar(this);
        }
    }
}
