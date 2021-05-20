/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ArchivoTexto implements Registrador {

    @Override
    public void registrarMensaje(String a) {
        
        //Para mostrar el mensaje en un archivo me base de este post https://geekytheory.com/como-crear-y-modificar-ficheros-con-java
        String ruta = "C:\\clases jhon\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(a);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
