package tarea12023;

class Comprador{
    private String beber;
    private int monedavuelto;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp){        
        
        monedavuelto=0;
        Bebida a= exp.comprarBebida(m, cualBebida);
        if (a!=null) {
            beber= a.beber();
        }
        while(true){
            Moneda mo = exp.getVuelto();
            if(mo!=null)
                monedavuelto = monedavuelto + mo.getValor();
            else break;
        }
    }

    public int cuantoVuelto(){
        return monedavuelto;
    }
    public String queBebiste() {
        return beber;
    }
}