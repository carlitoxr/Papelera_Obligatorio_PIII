/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ceibal
 */
public class Telefonos implements Serializable{
    
    private ArrayList <Telefono> hTel;

    //Constructor de la colección Telefonos
    public Telefonos() {
        hTel = new ArrayList <Telefono> ();
    }
    
    //Indica si la colección es vacía
    public boolean EsVacio(Telefonos tel){
        return tel == null;
    }
    
    //Indica si un teléfono ya pertenece a la colección
    public boolean Pertenece(int tel){
        for(int i = 0; i < hTel.size(); i++){
            if(tel == hTel.get(i).getNumTel())
                return true;
        }
        return false;
    }
    
    /* 
        Precondición: El teléfono que se desea agregar no debe de existir
        Inserta un nuevo teléfono a la colección
    */
    public void Insertar(Telefono tel){
        hTel.add(tel);
    }
    
    /*
        Precondición: El teléfono especificado debe pertenecer a la colección.
        Devuelve la colección sin el teléfnno especificado.
    */
    public void Borrar(Telefono tel){
        hTel.remove(tel);
    }
    
    public ArrayList <Telefono> getColeccion(){
        return hTel;
    }
}
