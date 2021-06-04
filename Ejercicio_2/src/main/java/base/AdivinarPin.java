/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import java.util.Random;

/**
 *
 * @author Edy
 */

public class AdivinarPin {
    
    Random rnd= new Random();
    
    //Llamamos a este metodo para buscar el pin original de manera ordenada
    public String Ordenado(String Pin)
    {
        int valor = Integer.parseInt(Pin);
        int encontrado=0;
        for (Integer i = 0; i < 9999; i++) {
            if(valor==i)
            {
                encontrado=i;
            }
        }
        return PinFormat(encontrado);
    }
    
    //Cree este metodo que lo adivina de manera random, no lo puse
    public String Random (String Pin)
    {
        int valor = Integer.parseInt(Pin);
        boolean encontrado=false;
        int ran=0;
        
        while(!encontrado)
        {
            ran = rnd.nextInt();
            if(valor==ran)
            {
                valor=ran;
            }
            encontrado=true;
        }
        return PinFormat(ran);
    }
    
    //Como convertimos el el int el string de numeros, por si tenia ceros
    //tenemos que acomodar los numeros reales en un arreglo de 4 ceros para ponerlos de vuelta en el formato
    protected String PinFormat(int valor){
        char[] num = Integer.toString(valor).toCharArray();
        char[] pin = "0000".toCharArray();
        int posicion =3;
        for (int i = num.length-1; i > -1 ; i--) {
            pin[posicion]= num[i];
            posicion--;
        }
        return String.valueOf(pin);
    }
}
