package com.BS2.Inyecciones_dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controladorAñadirPersona {

    @Autowired
    personaInt personInt;

    @GetMapping ("/ControladorAñadirPersona/añadirPersona")
    public Persona getPersona (@RequestHeader(value = "nombre") String nombre, @RequestHeader(value = "edad")int edad, @RequestHeader(value = "poblacion")String poblacion){
        return personaInt.createPersona(nombre, edad, poblacion);

    }


}
