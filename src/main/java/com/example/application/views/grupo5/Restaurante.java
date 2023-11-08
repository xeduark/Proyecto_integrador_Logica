package com.example.application.views.grupo5;

public class Restaurante {
    private boolean[] mesasDisponibles;

    public Restaurante(int numMesas) {
        mesasDisponibles = new boolean[numMesas];
        for (int i = 0; i < numMesas; i++) {
            mesasDisponibles[i] = true;
        }
    }

    public String mostrarMesasDisponibles() {
        String mesas = "";
        for (int i = 0; i < mesasDisponibles.length; i++) {
            if (mesasDisponibles[i]) {
                mesas += "Mesa " + String.valueOf(i + 1) + ", ";
            }
        }
        return mesas;
    }

    public String reservarMesa(int numeroMesa) {
        String resultado = "";
        if (numeroMesa >= 1 && numeroMesa <= mesasDisponibles.length) {
            if (mesasDisponibles[numeroMesa - 1]) {
                mesasDisponibles[numeroMesa - 1] = false;
                resultado = "Mesa " + String.valueOf(numeroMesa) + " reservada con éxito.";
                return resultado;
            } else {
                resultado = "Lo siento, la mesa " + String.valueOf(numeroMesa) + " ya está reservada.";
            }
        } else {
            resultado = ("Número de mesa inválido.");
        }
        return resultado;
    }
}
