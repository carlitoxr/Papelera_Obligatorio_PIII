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
public class MsjExep {
    private int codMsj;
    private String msj;
    
    public MsjExep(int codMsj) {
        this.codMsj = codMsj;
        this.cargarMsj(codMsj);
    }
    
//Cargará los mensajes correspondientes a cada error
    private void cargarMsj(int codMsj){
        switch(codMsj){
            case 1: 
                this.msj = "Error de escritura";
                break;
            case 2:
                this.msj = "No se puede cargar el archivo";
                break;
            default:
                this.msj = "Error desconocido";
                break;
        }
    }

    public String getMsj() {
        return msj;
    }
}
