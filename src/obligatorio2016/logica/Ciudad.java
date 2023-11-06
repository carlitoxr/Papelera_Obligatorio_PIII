/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2016.logica;

/**
 *
 * @author ceibal
 */
public class Ciudad extends Direccion{
    private int numPuerta;

    public Ciudad(int numPuerta, String nomCalle, String esq, String barrio_localidad, String depart, int codPostal) {
        super(nomCalle, esq, barrio_localidad, depart, codPostal);
        this.numPuerta = numPuerta;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public void setNumPuerta(int numPuerta) {
        this.numPuerta = numPuerta;
    }
    
    public String tipoDir(){
        return "Ciudad";
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println(numPuerta);
    }
}
