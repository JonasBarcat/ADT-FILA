/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author jonas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo maria=new Nodo("MARIA");
        Nodo jose=new Nodo("JOSE");
        Nodo tomas=new Nodo("TOMAS");
        
        Fila mifila=Fila.FILAVACIA();
        
        
        if(mifila.ESFILAVACIA(mifila)){
            System.out.println("Es fila vacia");
        }
        
        mifila.ENFILA(mifila, maria);
        mifila.ENFILA(mifila, jose);
        mifila.ENFILA(mifila, tomas);
        
        mifila.DEFILA(mifila);
        mifila.DEFILA(mifila);
        mifila.DEFILA(mifila);
        mifila.DEFILA(mifila);
        
        mifila.VERFILA(mifila);
    }
    
}
