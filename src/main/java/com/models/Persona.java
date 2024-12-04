package com.models;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para "nombre"
    public String getNombre() {
        return nombre;
    }

    // Setter para 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para 'edad'
    public int getEdad() {
        return edad;
    }

    // Setter para 'edad'
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
