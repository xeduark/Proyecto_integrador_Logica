package com.example.application.views.grupo5;

class Hotel {
    String nombre;
    int habitacionesDisponibles;
    double precioPorNoche;

    public Hotel(String nombre, int habitacionesDisponibles, double precioPorNoche) {
        this.nombre = nombre;
        this.habitacionesDisponibles = habitacionesDisponibles;
        this.precioPorNoche = precioPorNoche;
    }

    public boolean reservarHabitacion(int cantidad) {
        if (cantidad <= habitacionesDisponibles) {
            habitacionesDisponibles -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double calcularCostoTotal(int noches) {
        return precioPorNoche * noches;
    }

    public String toString() {
        return nombre;
    }

    public String mostrarDisponibilidad() {         
        return "Habitaciones disponibles en " +  String.valueOf(nombre) + ": " + String.valueOf(habitacionesDisponibles);
    }
}
