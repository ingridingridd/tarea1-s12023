package tarea12023;

import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> deposito;
    
    public Deposito(){
        deposito = new ArrayList<Bebida>();
    }
    
    public void addBebida(Bebida bebida){
        deposito.add(bebida);
    }
    
    public Bebida getBebida(){
        if(deposito.size()== 0){
             return null;
        }
        else{
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }
   
}