/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.*;


/**
 *
 * @author Edy
 */
public class Indentificador {
    //Metodo para identificar el objeto
    public String indentificar(Object cosa)
    {
        //Lista para guardar los objetos que son numeros
        ArrayList<Class<?>> numeros = new ArrayList<>();
        numeros.add(Byte.class);
        numeros.add(Short.class);
        numeros.add(Integer.class);
        numeros.add(Long.class);
        numeros.add(Float.class);
        numeros.add(Double.class);
        
        //Lista para guardar los objetos que son listas
        ArrayList<Class<?>> listas = new ArrayList<>();
        listas.add(ArrayList.class);
        listas.add(List.class);
        listas.add(LinkedList.class);
        listas.add(Stack.class);

        //Se compara el objeto por todos los tipos de objetos 
        //y se devuelve un string del tipo de objeto que es
        if(String.class.isAssignableFrom(cosa.getClass())){
            return "Eres una palabra";
        }
        for (Class<?> numero : numeros) {
            if(numero.isAssignableFrom(cosa.getClass())){
                return "Eres un numero";
            }
        }
        for (Class<?> lista : listas) {
            if(lista.isAssignableFrom(cosa.getClass())){
                return "Eres una lista";
            }
        }
        return "Es otra cosa";
    }
    
}
