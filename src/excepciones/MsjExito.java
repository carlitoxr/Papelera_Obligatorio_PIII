/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author AdminPC
 */
public class MsjExito {
    private int codMsj;
    private String msj;

    public MsjExito(int codMsj) {
        this.codMsj = codMsj;
        this.cargarMsj(codMsj);
    }
    
//Cargará los mensajes correspondientes a cada exito    
    private void cargarMsj(int codMsj){
        switch(codMsj){
            case 1: 
                this.msj = "Cliente agregado con exito";
                break;
            case 2:
                this.msj = "Proveedor agregado con exito";
                break;
            case 3:
                this.msj = "Producto agregado con exito";
                break;
            case 4:
                this.msj = "Compra realizada con exito";
                break;
            default:
                break;
        }
    }

    public String getMsj() {
        return msj;
    }
}
