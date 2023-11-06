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
public class Producto implements Serializable{
    private long codProd;
    private String nomProd;
    private float preUni;

    public Producto(long codProd, String nomProd, float preUni) {
        this.codProd = codProd;
        this.nomProd = nomProd;
        this.preUni = preUni;
    }

    public long getCodProd() {
        return codProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public float getPreUni() {
        return preUni;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public void setPreUni(float preUni) {
        this.preUni = preUni;
    }
}
