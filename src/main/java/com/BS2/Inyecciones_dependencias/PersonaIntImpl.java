package com.BS2.Inyecciones_dependencias;

import org.springframework.stereotype.Service;

@Service
public class PersonaIntImpl implements personaInt{
    Persona persona = new Persona();

    @Override
    public Persona createPersona(String nombre, int edad, String poblacion) {
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setPoblacion(poblacion);
        return persona;
    }

    @Override
    public Persona getPersona() {
        return persona;
    }
}