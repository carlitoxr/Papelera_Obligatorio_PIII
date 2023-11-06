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
public abstract class Direccion implements Serializable{
    private String nomCalle;
    private String esq;
    private String barrio_localidad;
    private String depart;
    private int codPostal;
    
    public Direccion(String nomCalle, String esq, String barrio_localidad, String depart, int codPostal){
        this.nomCalle=nomCalle;
        this.esq=esq;
        this.barrio_localidad=barrio_localidad;
        this.depart=depart;
        this.codPostal=codPostal;
    }

    public String getNomCalle() {
        return nomCalle;
    }

    public String getEsq() {
        return esq;
    }

    public String getBarrio_localidad() {
        return barrio_localidad;
    }

    public String getDepart() {
        return depart;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setNomCalle(String nomCalle) {
        this.nomCalle = nomCalle;
    }

    public void setEsq(String esq) {
        this.esq = esq;
    }

    public void setBarrio_localidad(String barrio_localidad) {
        this.barrio_localidad = barrio_localidad;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }
    
    public abstract String tipoDir();
    
    public void imprimir(){
        System.out.println(getNomCalle() + getEsq() + getBarrio_localidad() + getDepart() + getCodPostal());
    }
}
