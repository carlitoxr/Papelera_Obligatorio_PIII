/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import java.io.Serializable;

/**
 *
 * @author ceibal
 */
public class Compra implements Serializable{
    private int anio;
    private long codProd;
    private int cant;

    public Compra(int anio, long codProd, int cant) {
        this.anio = anio;
        this.codProd = codProd;
        this.cant = cant;
    }
    
    public int getAnio(){
        return anio;
    }

    public long getCodProd() {
        return codProd;
    }

    public int getCant() {
        return cant;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setCodProd(long codProd) {
        this.codProd = codProd;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
