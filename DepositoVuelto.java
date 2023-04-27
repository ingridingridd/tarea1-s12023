package tarea12023;

import java.util.ArrayList;

class DepositoVuelto{//Monedero Ok
    private ArrayList<Moneda> arl;
    public DepositoVuelto(){
        arl = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda m){
        arl.add(m);
        
}
    public Moneda getMoneda(){
       
        if(arl.size()!=0){
            Moneda m =arl.remove(0);
            return m;
        }
        else return null;
        
    }
}

