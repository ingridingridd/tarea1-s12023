package tarea12023;

class Comprador{
    private String beber;
    private int monedavuelto;
    
    public Comprador(Moneda moneda, int cualBebida, Expendedor exp){        
        this.monedavuelto=0;
        //Bebida a = exp.comprarBebida(moneda, cualBebida);
        
        Bebida varbebida;
        try{
            varbebida = exp.comprarBebida(moneda, cualBebida);
            beber = varbebida.beber();
            System.out.println("Compra realizada");
        } catch(PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e){
            beber = null;
            System.out.println(e.getMessage());
        }
        
        Moneda vMoneda = exp.getVuelto();
        while(vMoneda != null){
            monedavuelto = monedavuelto + vMoneda.getValor();
            vMoneda = exp.getVuelto();
        }
    }
    
    //vuelto del comprador
    public int cuantoVuelto(){
        return monedavuelto;
    }
    
    //devuelve cuál bebida compró (coca o sprite)
    public String queBebiste() {
        return beber;
    }
}