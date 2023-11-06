/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ceibal
 */
public class Cliente implements Serializable{
    private long RUT_CI;
    private String nomCte;
    private String apeCte;
    private String fechaIng;
    private ComprasCliente compras;
    private Telefonos telCle;
    private Direcciones dirCle;

    public Cliente(long RUT_CI, String nomCte, String apeCte, String fechaIng) {
        this.RUT_CI = RUT_CI;
        this.nomCte = nomCte;
        this.apeCte = apeCte;
        this.fechaIng = fechaIng;
        this.compras = new ComprasCliente();
        this.telCle = new Telefonos();
        this.dirCle = new Direcciones();
    }

    public long getRUT_CI() {
        return RUT_CI;
    }

    public String getNomCte() {
        return nomCte;
    }

    public String getApeCte() {
        return apeCte;
    }

    public String getFechaIng() {
        return fechaIng;
    }

    public ComprasCliente getCompras() {
        return compras;
    }

    public Telefonos getTelCle() {
        return telCle;
    }

    public Direcciones getDirCle() {
        return dirCle;
    }

    public void setNomCte(String nomCte) {
        this.nomCte = nomCte;
    }

    public void setApeCte(String apeCte) {
        this.apeCte = apeCte;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public void setCompras(ComprasCliente compras) {
        this.compras = compras;
    }

    public void setTelCle(Telefonos telCle) {
        this.telCle = telCle;
    }

    public void setDirCle(Direcciones dirCle) {
        this.dirCle = dirCle;
    }
}
