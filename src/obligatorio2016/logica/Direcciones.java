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
public class Direcciones implements Serializable{
    private ArrayList <Direccion> hDir;
    
    //Constructor de la colección Direcciones
    public Direcciones(){
        hDir = new ArrayList <Direccion> ();
    }
    
     /* 
        Precondición: La dirección que se desea agregar no debe de existir en la colección.
        Inserta un nuevo teléfono a la colección
    */
    public void Insertar(Direccion dir){
        hDir.add(dir);
    }
    
    //Determina si la colección está vacia o no.
    public boolean EsVacio(Direcciones dirs){
        return dirs == null;
    }
    
    //Determina si la dirección forma parte de la colección o no.
    public boolean Pertenece(Direccion dir){
        return hDir.contains(dir);
    }
    
    /*
        Precondición: la dirección especificada pertenece a la colección.
        Devuelve la colección sin la dirección especificada.
    */
    public void Borrar(Direccion dir){
        hDir.remove(dir);
    }
    
    public ArrayList <Direccion> getColeccion(){
        return hDir;
    }
}
