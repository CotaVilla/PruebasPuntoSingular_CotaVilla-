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
public class Combinar {
    //Arreglo de arreglos para guardar las combinaciones posibles
    ArrayList<ArrayList<Integer>> combinaciones = new ArrayList<>();
    
    //Este metodo llama a Explorar que es metodo recursivo
    public ArrayList<ArrayList<Integer>> BuscarCombinaciones(ArrayList<Integer> lista, int objetivo){
        Explorar(lista, objetivo);//Metodo recursivo
        return combinaciones;
    }
    
    //
    //Metodo recursivo para explorar las combinaciones
    public void Explorar(ArrayList<Integer> lista, int objetivo)
    {
        int suma =0;
        if(lista.size()>0){
            //Suma los valores para ver si llegan a la meta
            for(int num: lista)
                suma+=num;
            
            //Si es igual al objetivo se agrega a la lista
            if (suma == objetivo)
            {
                Collections.sort(lista);
                if (!combinaciones.contains(lista))
                    combinaciones.add(lista);
            }
            else//Si no se le va quitando un numero al arreglo y se vuelve a pasar por el metodo
            {
                //Mientras que haya numeros en las listas seguira buscando
                for (int i = 0; i < lista.size(); ++i) {
                    ArrayList<Integer> nuevalista = new ArrayList<>(lista);
                    nuevalista.remove(i);
                    Explorar(nuevalista, objetivo);//Se vuelve a llamar a si mismo
                }
            }
        }
    }
}
