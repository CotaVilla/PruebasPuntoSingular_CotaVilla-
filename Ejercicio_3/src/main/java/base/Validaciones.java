/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author Edy
 */
import java.util.ArrayList;
import java.util.regex.*;

//Clase para realizar validaciones y buscar usuarios
public class Validaciones {
    
    //Para validar contraseñas
    public boolean contrasena(String texto){
        String regex = "^(?=.*[0-9])" //Tiene que tener un digito
                       + "(?=.*[a-z])(?=.*[A-Z])" //Tiene que tener una minuscula y mayuscula
                       + "(?=.*[@#$%^&+=_.])"//Tiene que tener un caracter especial (@#$%^&+=)
                       + "(?=\\S+$).{8,30}$";//Sin espacios y un largo de 8 a 30 
        
        Pattern p = Pattern.compile(regex);

        Matcher resutado =  p.matcher(texto);
        return resutado.matches();
    }
    
//Para validar nombre de usuario
    public boolean usuario(String texto){
        String regex = "^[A-Za-z]"//Tiene que empezar con una letra
                + "\\w{1,29}$";//caracteres de a-z, A-Z, 0-9, incluyendo el _ y un largo de 30
        
        Pattern p = Pattern.compile(regex);

        Matcher resutado =  p.matcher(texto);
        return resutado.matches();
    }
    
    //Para buscar usuarios en la lista de usuarios
    public int buscarUsuario(String cuenta, String pass, ArrayList<Usuario> lista){
        for (int i = 0; i < lista.size(); i++) {
            String a=lista.get(i).getCuenta();
            
            String b=lista.get(i).getContrasena();
            if (a.equals(cuenta) && b.equals(pass)) {
                return i;
            }
        }
        return -1;
    }
    
    //Para ver si existe en una lista de usuarios
    public boolean existeUsuario(String cuenta, ArrayList<Usuario> lista){
        for (int i = 0; i < lista.size(); i++) {
            String a=lista.get(i).getCuenta();
            if (a.equals(cuenta)) {
                return false;//El usuario si existe
            }
        }
        return true;//El usuario no existe
    }
    
    //Para validar los años
    public Boolean Edad(String texto){
        int num;
        try
        {
           num = Integer.parseInt(texto);
            if (num<4 && num<120) {
                return false;
            }
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
        return true;
    }
}
