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
//Clase usuario
public class Usuario {
    String cuenta;
    String contrasena;
    String nombre;
    int edad;
    //Cuando creamos un usuario tenemos que colocar nombre de la cuenta y la contraseña
    public Usuario(String cuenta,String contrasena){
        this.cuenta = cuenta;
        this.contrasena = contrasena;
    }
    
    //Funciones sacar y meter datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCuenta() {
        return cuenta;
    }
}
