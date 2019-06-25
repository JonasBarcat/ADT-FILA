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
public class Fila {
    
    
    private Nodo front;
    private Nodo end;

    public Fila() {
    }
    
    
    public static Fila FILAVACIA(){
    Fila nueva=new Fila();
    return nueva;
    }
    
    public boolean ESFILAVACIA(Fila fila){
        return fila.front==null;
    }
    
    public Fila ENFILA(Fila fila,Nodo node){
        if(ESFILAVACIA(fila)){
            fila.front=node;
            fila.end=node;
        }else{
            Nodo aux=new Nodo(node.getNombre());
            this.end.setSiguiente(aux);
            this.end=aux;  
        }
    return fila;
    }
    
    
    public Fila DEFILA(Fila fila){
        if(ESFILAVACIA(fila)){
            return fila;
        }else if(fila.front==fila.end){
            fila.front=null;
            fila.end=null;
        }
        else{
            fila.front=fila.front.getSiguiente();
        }
    return fila;
    }
    
    
    public Nodo FRENTE(Fila fila){
        if(ESFILAVACIA(fila)){
            return null;
        }else{
            return fila.front;
        }
    }
    
    
    public void VERFILA(Fila fila){
        Nodo aux=this.front;
        while(aux!=null){
            System.out.print(" :"+aux.getNombre());
            aux=aux.getSiguiente();
        }
    }
    
}
