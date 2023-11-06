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
public class Proveedor implements Serializable
{
    private long codProv;
    private String nomProv;
    private String nomCont;
    private Telefonos telProv;
    private Direcciones dirProv;
    private Productos prodXProv;

    public Proveedor(long codProv, String nomProv, String nomCont) {
        this.codProv = codProv;
        this.nomProv = nomProv;
        this.nomCont = nomCont;
        this.telProv = new Telefonos();
        this.dirProv = new Direcciones();
        this.prodXProv = new Productos();
    }

    public long getCodProv() {
        return codProv;
    }

    public String getNomProv() {
        return nomProv;
    }

    public String getNomCont() {
        return nomCont;
    }

    public Direcciones getDirProv() {
        return dirProv;
    }

    public void setNomProv(String nomProv) {
        this.nomProv = nomProv;
    }

    public void setNomCont(String nomCont) {
        this.nomCont = nomCont;
    }

    public void setTelProv(Telefonos telProv) {
        this.telProv = telProv;
    }

    public void setDirProv(Direcciones dirProv) {
        this.dirProv = dirProv;
    }
    
    public Telefonos getTelProv() {
        return telProv;
    }
    
    public Productos getProds() {
        return prodXProv;
    }

    public void setProdXProv(Productos prodXProv) {
        this.prodXProv = prodXProv;
    }
}
