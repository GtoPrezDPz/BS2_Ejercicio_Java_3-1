package com.BS2.Inyecciones_dependencias;

public interface personaInt {
     Persona createPersona(String nombre, int edad, String poblacion);

    Persona getPersona();
}