package Controllers;

import java.util.Arrays;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 */
public class PersonaController {

    public void ordenarPorEdadAscendente (Persona [] personas ){
        for( int i= 0; i< personas.length -1; i++){
            int max = i;
            for( int j=i+1; j<personas.length;j++){
                if (personas[j].getEdad()>personas[max].getEdad()) {
                    max = j;   
                }
               
            }
            Persona temp = personas[max];
            personas [max]= personas[i];
            personas[i]= temp;
        }
    }

    public Persona buscarPorEdad (Persona [] personas, int edad){
        for( int i =0 ; i < personas.length; i++){
            if(personas[i].getEdad()==edad){
                return personas[i];
            }
        }
        return null;
    }

    public void ordenarPorNombreAscendente (Persona[] personas){
        for( int i = 1; i<personas.length; i++){
            Persona key = personas[i];
            int j = i-1;
            while (j >= 0 && personas[j].getNombre().compareTo(key.getNombre()) > 0) {
                personas[j+1]= personas[j];
                j--;
            }
            personas[j+1]= key;


        }
    }


    public Persona buscarPorNombre (Persona[] personas, String nombre){
        for( int i = 0; i< personas.length;i++){
            if(personas[i].getNombre().equalsIgnoreCase(nombre)){
                return personas [i];
            }
        }
        return null;
    }

    public void imprimirArreglo(Persona[] personas){
        Arrays.stream(personas).forEach(persona -> 
        System.out.println(persona.getNombre() + " - " + persona.getEdad())
        );
    }










}
