package controllers;

import models.Persona;

public class PersonaController {

    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[i].getCodigoDireccion() < personas[j].getCodigoDireccion()) {

                    Persona aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;
                }
            }
        }
    }

    public Persona findByCodigo(Persona[] personas, int codigo) {
        for (Persona persona : personas) {
            if (persona.getDireccion().getCodigo() == codigo) {
                return persona;
            }
        }
        return null;
    }

    public Persona findPersonByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int center = (bajo + alto) / 2;
            if (personas[center].equalsByCodigoDireccion(codigo)) {
                return personas[center];
            } else if (personas[center].equalsByCodigoDireccion2(codigo)) {
                bajo = center + 1;
            } else {
                alto = center - 1;
            }
        }
        return null;
    }

}
