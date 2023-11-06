/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.persistencia;

import excepciones.PersistenciaException;
import excepciones.MsjExep;
import java.io.*;
import obligatorio2016.logica.Clientes;
import obligatorio2016.logica.Proveedores;

/**
 *
 * @author AdminPC
 */
public class LecturaEscritura {
    
//Crea el directorio donde se alojará la persistencia    
    public void crearDirectorio(){
        File folder = new File("C:\\OBLIGATORIO2016\\");
        folder.mkdir();
    }
    
//Guarda en disco la colección de Proveedores que está en memoria    
    public void escribirProvs(Proveedores provs) throws PersistenciaException{
        try (
                FileOutputStream f = new FileOutputStream("C:\\OBLIGATORIO2016\\papeleriaProv.txt");
                ObjectOutputStream o = new ObjectOutputStream(f)) {
                o.writeObject (provs);
            }
        catch (IOException e){
            e.printStackTrace();
            MsjExep msj = new MsjExep(1);
            throw new PersistenciaException(msj.getMsj());
        }
    }

//Carga en memoria la colección de Proveedores que está en disco    
    public Proveedores recuperarProvs() throws PersistenciaException, ClassNotFoundException{
        try{
            FileInputStream f = new FileInputStream("C:\\OBLIGATORIO2016\\papeleriaProv.txt");
            ObjectInputStream o = new ObjectInputStream(f);
            Proveedores provs = (Proveedores) o.readObject();
            o.close();
            f.close();
            return provs;
        }
        catch (IOException e){
            e.printStackTrace();
            MsjExep msj = new MsjExep(2);
            throw new PersistenciaException(msj.getMsj());
        }
    }
    
//Guarda en disco la colección de Clientes que está en memoria    
    public void escribirCtes(Clientes ctes) throws PersistenciaException{
        try (
                FileOutputStream f = new FileOutputStream("C:\\OBLIGATORIO2016\\papeleriaCtes.txt");
                ObjectOutputStream o = new ObjectOutputStream(f)) {
                o.writeObject (ctes);
            }
        catch (IOException e){
            e.printStackTrace();
            MsjExep msj = new MsjExep(1);
            throw new PersistenciaException(msj.getMsj());
        } 
    }
    
//Carga en memoria la colección de Clientes que está en disco    
    public Clientes recuperarCtes() throws PersistenciaException, ClassNotFoundException{
        try{
            FileInputStream f = new FileInputStream("C:\\OBLIGATORIO2016\\papeleriaCtes.txt");
            ObjectInputStream o = new ObjectInputStream(f);
            Clientes ctes = (Clientes) o.readObject();
            o.close();
            f.close();
            return ctes;
        }
        catch (IOException e){
            e.printStackTrace();
            MsjExep msj = new MsjExep(2);
            throw new PersistenciaException(msj.getMsj());
        }
    }
}