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
public class Telefono implements Serializable{
    
    private int numTel;
    private String tipoTel;

    public Telefono(int numTel, String tipoTel) {
        this.numTel = numTel;
        this.tipoTel = tipoTel;
    }

    public int getNumTel() {
        return numTel;
    }

    public String getTipoTel() {
        return tipoTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public void setTipoTel(String tipoTel) {
        this.tipoTel = tipoTel;
    }
}
