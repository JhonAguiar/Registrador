/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrador;

/**
 *
 * @author user
 */
public class App {
    public static void main(String[] args){
        Creador crear = new Creador();
        
        Registrador r = crear.getRegistrador("consola");
        r.registrarMensaje("hola consola");
        
        Registrador f = crear.getRegistrador("archivo_texto");
        f.registrarMensaje("hola consola");
    }
}
