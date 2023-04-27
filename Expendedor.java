package tarea12023;

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoVuelto dv;
    private int precio;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    
    public Expendedor(int numBebidas, int precioBebidas){
        this.precio=precioBebidas;
        coca= new Deposito();
        sprite= new Deposito();
        dv= new DepositoVuelto();
        this.precio=precio;
              
        //Rellenar máquina con bebidas
        for (int i = 0; i < numBebidas; i++) { 
            CocaCola a= new CocaCola(100+i);
            coca.addBebida(a);
            Sprite b = new Sprite(200+i);
            sprite.addBebida(b);        
        }
    }
    
    public Bebida comprarBebida(Moneda moneda, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException{
        /*Vuelto en multiplos de 100*/
        Bebida bebida = null;
        
        if(moneda == null){
            throw new PagoIncorrectoException("Inserte dinero para comprar");
        }
        else{
            if(moneda.getValor() >= precio){
            //if( moneda == null ){
            //    return bebida;
            //}
                switch(cual){
                    case 1 :
                        bebida = coca.getBebida();
                        if(bebida != null){
                            //calcularVuelto
                            int vuelto= moneda.getValor()- precio;
                            while(vuelto > 0){
                                dv.addMoneda(new Moneda100());
                                vuelto = vuelto - 100;
                            }
                            return bebida;
                        }
                        else{
                            throw new NoHayProductoException("Bebida no disponible");
                        }
                    case 2 :
                        bebida = sprite.getBebida();
                        if(bebida != null){
                            //calcularVuelto
                            int vuelto= moneda.getValor()- precio;
                            while(vuelto > 0){
                                dv.addMoneda(new Moneda100() );
                                vuelto = vuelto - 100;
                            }
                            return bebida;
                        }
                        else{
                            throw new NoHayProductoException("Bebida no disponible");
                        }  
                    //case 3 :
                    //caso numero erroneo
                    default:
                        throw new NoHayProductoException("No hay bebida disponible");
                } //switch
            }
            else{
                throw new PagoIncorrectoException("Saldo insuficiente");
            }

        } //else
    }
    
    public Moneda getVuelto(){
        return dv.getMoneda();    
    }     
    
    public int getPrecioBebida(){
        return this.precio;
    }
}
