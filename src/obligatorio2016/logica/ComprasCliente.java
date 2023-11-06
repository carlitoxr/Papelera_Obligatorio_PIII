/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author ceibal
 */
public class ComprasCliente implements Serializable{
    ArrayList <Compra> hCompCte;

    public ComprasCliente() {
        hCompCte = new ArrayList <Compra> ();
    }
    
    public boolean pertenece(int anio, long codProd){
        for(int i = 0; i < hCompCte.size(); i++)
            if(hCompCte.get(i).getAnio() == anio && hCompCte.get(i).getCodProd() == codProd)
                return true;
 
        return false;
    }
    
    public boolean perteneceProd(long codProd){
        for(int i = 0; i < hCompCte.size(); i++)
            if(hCompCte.get(i).getCodProd() == codProd)
                return true;
 
        return false;
    }
    
    public boolean perteneceAnio(int anio){
        for(int i = 0; i < hCompCte.size(); i++)
            if(hCompCte.get(i).getAnio() == anio)
                return true;
 
        return false;
    }
    
    public void insertar(Compra comp){
        hCompCte.add(comp);
    }
    
    public boolean esVacio(ComprasCliente comps){
        return comps == null;
    }
    
    public void Borrar(Compra comp){
        hCompCte.remove(comp);
    }
    
    public ArrayList <Compra> getColeccion(){
        return hCompCte;
    }
}