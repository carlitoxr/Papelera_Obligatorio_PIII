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
public class Proveedores implements Serializable
{
    private Hashtable <String, Proveedor> hProv;//= new Hashtable <> ();

    public Proveedores() {
        hProv = new Hashtable <String, Proveedor> ();
    }
    
    public boolean member(long codProv){
        return hProv.containsKey(String.valueOf(codProv));
    }
    
    public void insert(Proveedor p){
        hProv.put(String.valueOf(p.getCodProv()), p);
    }
    
    public Proveedor find(long codProv){
        return hProv.get(String.valueOf(codProv));
    }
    
//    public Proveedor find(long codProv){
//        Enumeration e = hProv.keys();
//        Object clave;
//        Object valor;
//        while( e.hasMoreElements() ){
//            clave = e.nextElement();
//            if(clave.equals(codProv)){
//                return hProv.get(clave);
//            }
//            
//            //valor = hProv.get( clave );
//        }
//        return null;
//    }
    
//    public boolean member(long codProv){
//        return hProv.get(String.valueOf(codProv)).getCodProv() == codProv;
//    }
    
    public void modify(Proveedor p){
        delete(p.getCodProv());
        hProv.put(String.valueOf(p.getCodProv()),p);
    }
    
    public void delete(long codProv){
        hProv.remove(String.valueOf(codProv));
    }
    
    /*
        Precondición: El teléfono se esta buscando debe de existir.
        Retorna el proveedor que contenga el teléfono indicado.
    */
    public Proveedor getProvXTel(int tel){
        Enumeration<Proveedor> eProv = hProv.elements();
        Proveedor prov;
        
        while(eProv.hasMoreElements()){
            prov = eProv.nextElement();
            
            if(prov.getTelProv().Pertenece(tel))
                return prov;
        }
        return null;
    }
    
    /*
        Precondición: El proveedor debe de tener algún producto.
        Retorna la colección de productos que tiene el proveedor indicado con el código indicado.
    */
    public Productos getProdXProv(long codProv){
        return hProv.get(String.valueOf(codProv)).getProds();
    }
    
//Retorna la colección Proveedores    
    public Hashtable<String, Proveedor> getColeccion() {
        return hProv;
    }
    
//Dado el nombre de un proveedor se retorna su código    
    public long getCodProv(String nomProv){
        Enumeration<Proveedor> eProv = hProv.elements();
        Proveedor prov;
        
        while(eProv.hasMoreElements()){
            prov = eProv.nextElement();
            if(prov.getNomProv().equals(nomProv)){
                return prov.getCodProv();
            }
        }
        return 0;
    }
}
