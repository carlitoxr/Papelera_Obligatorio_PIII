/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author ceibal
 */
    public class Productos implements Serializable{
    private Hashtable <String, Producto> hProd = new Hashtable <> ();;
    
    //Constructor de la colección Productos.
    public Productos(){
    }
    
    //Determina si en la colección existe un producto con el código especificado.
    public boolean member(long codProd){
        return hProd.containsKey(String.valueOf(codProd));
    }
    
    /*
        Precodición: el proveedor a insertar no es miembro de la colección.
        Inserta un producto en la colección.
    */
    public void insert(Producto p){
        hProd.put(String.valueOf(p.getCodProd()), p);
    }
    
    /*
        Precondición: el producto es miembro de la colección.
        Dado el código devuelve un producto con dicho código.
    */
    public Producto find(long codProd){
        return hProd.get(String.valueOf(codProd));
    }
    
    /*
        Precondición: el producto a sustituir pertenece a la colección.
        Sustituye el viejo producto en la colección por un nuevo producto.
    */
    public void modify(Producto p){
        delete(p.getCodProd());
        hProd.put(String.valueOf(p.getCodProd()), p);
    }
    
    /*
        Precodición: el producto debe ser miembro de la colección.
        Dado el código, borra el producto con dicho código de la colección.
    */
    public void delete(long codProd){
        hProd.remove(String.valueOf(codProd));
    }
    
    public void imprimir(){
    }
    
    public Hashtable <String, Producto> getColeccion(){
        return hProd;
    }
}
