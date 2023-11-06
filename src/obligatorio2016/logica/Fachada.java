/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import excepciones.PersistenciaException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import obligatorio2016.persistencia.LecturaEscritura;

/**
 *
 * @author ceibal
 */
public class Fachada {
    private static Fachada instancia;
    private Proveedores diccioProv;
    private Productos diccioProd;
    private Clientes diccioCtes;
    
    private Fachada(){
        this.diccioProv = new Proveedores();
        this.diccioProd = new Productos();
        this.diccioCtes = new Clientes();
    }
    
    public static Fachada getInstancia(){
        if(instancia == null){
            instancia = new Fachada();
        }
        return instancia;
    }

    public Proveedores getDiccioProv() {
        return diccioProv;
    }
    
    public Proveedor find(long codProv){
        return diccioProv.find(codProv);
    }
    
    public void insert(Proveedor prov){
        this.diccioProv.insert(prov);
    }
    
    public Proveedor getProvXTel(int numTel){
        return diccioProv.getProvXTel(numTel);
    }
    
    public Productos getProdXProv(long codProv){
        return diccioProv.getProdXProv(codProv);
    }
    
    public Clientes getDiccioCtes(){
        return diccioCtes;
    }
    
    public void insertCte(Cliente cte){
        diccioCtes.insert(cte);
    }
    
    public Cliente findCte(long rutCI){
        return diccioCtes.find(rutCI);
    }
    
//    public Clientes getCtesXProd(long codProd){
//        return diccioCtes.getCtesXProd(codProd);
//    }
    
//    public Clientes getCtesXAño(int anio){
//        return diccioCtes.getCtesXAño(anio);
//    }
    
//    public Clientes getCtesNoCompXAño(int anio){
//        return diccioCtes.getCtesNoCompXAño(anio);
//    }

    public void setDiccioProv(Proveedores diccioProv) {
        this.diccioProv = diccioProv;
    }
    
    public void guardar() throws PersistenciaException {
        LecturaEscritura per = new LecturaEscritura();
        per.escribirProvs(diccioProv);
        per.escribirCtes(diccioCtes);
    }
    public void recuperar() throws PersistenciaException, ClassNotFoundException{
        LecturaEscritura per = new LecturaEscritura();
        this.diccioProv = per.recuperarProvs();
        this.diccioCtes = per.recuperarCtes();
    }

//    public Productos getDiccioProd() {
//        return diccioProd;
//    }
    
    /*
        Dada una fecha en tipo de dato date obtiene el año de dicha fecha.
        Retorna la fecha como un entero.
    */
    public String obtenerAnio(Date date){
        if (null == date)
            return null;
        else{
            String formato="yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            return String.valueOf(dateFormat.format(date));
        }
    }
    
    public void crearDirectorio(){
        LecturaEscritura p = new LecturaEscritura();
        p.crearDirectorio();
    }
}
