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
public class Balneario extends Direccion{
    private String manzana;
    private int solar;
  
    public Balneario(String manzana, int solar, String nomCalle, String esq, String barrio_localidad, String depart, int codPostal) {
        super(nomCalle, esq, barrio_localidad, depart, codPostal);
        this.manzana = manzana;
        this.solar = solar;
    }

    public String getManzana() {
        return manzana;
    }

    public int getSolar() {
        return solar;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public void setSolar(int solar) {
        this.solar = solar;
    }
    
    public String tipoDir(){
        return "Balneario";
    }
}
