package tarea12023;

import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> arl;
    public Deposito(){
        arl = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida a){
        arl.add(a);
        
}
    public Bebida getBebida(){
       
        if(arl.size()!=0){
            Bebida a =arl.remove(0);
             return a;
        }
        else return null;
        
    }
}