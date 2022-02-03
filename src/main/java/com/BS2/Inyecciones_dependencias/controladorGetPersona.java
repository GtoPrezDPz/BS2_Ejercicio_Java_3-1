package com.BS2.Inyecciones_dependencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controladorGetPersona {
    @Autowired
    personaInt personaInt;

    @PostMapping ("/controladorGetPersona/getPersona")
    public Persona getPersona(){
        Persona personaDoubleEdad =  personaInt.getPersona();
        personaDoubleEdad.setEdad(personaDoubleEdad.getEdad()*2);
        return personaDoubleEdad;
    }
}
