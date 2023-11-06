/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author ceibal
 */
public class Clientes implements Serializable{
    private Hashtable <String, Cliente> hCte = new Hashtable <>();

    public Clientes() {
    }
    
    public boolean member(long RUT_CI){
        return hCte.containsKey(String.valueOf(RUT_CI));
    }
    
    public void insert(Cliente c){
        hCte.put(String.valueOf(c.getRUT_CI()), c);
    }
    
    public Cliente find(long RUT_CI){
        return hCte.get(String.valueOf(RUT_CI));
    }
    
    public void delete(long RUT_CI){
        hCte.remove(String.valueOf(RUT_CI));
    }
    
    public void modify(Cliente c){
        delete(c.getRUT_CI());
        hCte.put(String.valueOf(c.getRUT_CI()), c);
    }
    
    public Hashtable<String, Cliente> getColeccion() {
        return hCte;
    }
    

//De aquí en más son métodos específicos que no poudimos utilizar. Creo que el problema es cuando retorna    
    
    /*
        Dado un año retorna los clientes que ingresaron dicho año.
        Se utiliza una variable auxiliar (auxCtes) para ir guardando en dicha
        los clientes que mencionados anteriormente.
    */
//    public Clientes getCtesXAño(int anio){
//        Enumeration<Cliente> eCte = hCte.elements();
//        Cliente cte;
//        Clientes ctes = new Clientes();
//        
//        while(eCte.hasMoreElements()){
//            cte = eCte.nextElement();
//            
////            if(obtenerAnio(cte.getFechaIng()) == anio)
//System.out.println(Integer.parseInt(cte.getFechaIng()) + " - " + anio);
//            if(Integer.parseInt(cte.getFechaIng()) == anio){
//                System.out.println("cte " + cte.getRUT_CI());
//                ctes.insert(cte);
//                System.out.println("nom insert " + ctes.find(cte.getRUT_CI()).getNomCte());
//            }
//        }
//        return ctes;
//    }
//    public Hashtable <String, Cliente> getCtesXAño(int anio){
//        Enumeration<Cliente> eCte = hCte.elements();
//        Cliente cte;
//        Hashtable <String, Cliente> ctes = new Hashtable <>();
//        
//        while(eCte.hasMoreElements()){
//            cte = eCte.nextElement();
//            if(Integer.parseInt(cte.getFechaIng()) == anio){
//                System.out.println("cte " + cte.getRUT_CI());
//                ctes.put(String.valueOf(cte.getRUT_CI()), cte);
//                //System.out.println("nom insert " + ctes.find(cte.getRUT_CI()).getNomCte());
//            }
//        }
//        return ctes;
//    }
    
    
//    public Clientes getCtesXProd(long codProd){
//        Enumeration<Cliente> eCte = hCte.elements();
//        Cliente cte;
//        Clientes ctes = new Clientes();
//        
//        while(eCte.hasMoreElements()){
//            cte = eCte.nextElement();
//            
//            if(cte.getCompras().perteneceProd(codProd))
//                ctes.insert(cte);
//        }
//        return ctes;
//    }
//    
//    public Clientes getCtesNoCompXAño(int anio){
//        Enumeration<Cliente> eCte = hCte.elements();
//        Cliente cte;
//        Clientes ctes = new Clientes();
//        
//        while(eCte.hasMoreElements()){
//            cte = eCte.nextElement();
//            
//            if(!cte.getCompras().perteneceAnio(anio))
//                ctes.insert(cte);
//        }
//        return ctes;
//    }
    
    
}
