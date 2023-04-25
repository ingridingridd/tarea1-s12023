package tarea12023;

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoVuelto dv;
    private int precio;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    
    public Expendedor(int numBebidas, int precioBebidas){
        precio=precioBebidas;
        coca= new Deposito();
        sprite= new Deposito();
        dv= new DepositoVuelto();
        this.precio=precio;
              
        for (int i = 0; i < numBebidas; i++) {
            CocaCola a= new CocaCola(100+i);
            coca.addBebida(a);
            Sprite b = new Sprite(200+i);
            sprite.addBebida(b);        
        }
    }
    
    public Bebida comprarBebida(Moneda m, int cual){
        /*Vuelto en multiplos de 100*/
        Bebida beb = null;
        if( m==null ){
            return beb;
         }
        if((cual != COCA && cual != SPRITE) || m.getValor() < precio){
            dv.addMoneda(m);
            return null;
        }
        if(cual==COCA){
            beb= coca.getBebida();
        }
        if (cual==SPRITE){
            beb=sprite.getBebida();
        }
        if(beb!=null){
           int vuelto= m.getValor()- precio;
                  
            while(vuelto > 0){
                dv.addMoneda(new Moneda100() );
                vuelto = vuelto - 100;
            }
            return beb;
        }
              
        else{
            dv.addMoneda(m);
            return null;
        }    
    }
          
    public Moneda getVuelto(){
        return dv.getMoneda();    
    }     
}
