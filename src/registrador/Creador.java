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
public class Creador {
    
    public Registrador getRegistrador(String registrador){
        if(registrador.equalsIgnoreCase("consola")){
            return new Consola();
        }else{
            return new ArchivoTexto();
        }
        
    }
    
}
