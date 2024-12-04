package org.example;

import com.models.Persona; // Importa la clase Persona

public class App
{
    public static void main( String[] args ) {
        // Crear una instancia de Persona
        Persona persona = new Persona();

        // Asignar valores con los setters
        persona.setNombre("Mark");
        persona.setEdad(33);

        // Obtener y mostrar valores con los getters
        System.out.println( "Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
