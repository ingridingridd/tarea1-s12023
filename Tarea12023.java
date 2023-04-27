package tarea12023;

public class Tarea12023 {

    public static void main(String[] args) {
        // TODO code application logic here
        Expendedor exp = new Expendedor(2,500);
        Moneda moneda1 = new Moneda1000();
        Moneda moneda2 = new Moneda100();
        Moneda moneda3 = new Moneda500();
        CocaCola cc = new CocaCola(2);
        Sprite sp = new Sprite(2);
        //Fanta f = new Fanta(3);
        
        System.out.println("Valor de la Bebidas: $" + exp.getPrecioBebida() + "\n");
        //System.out.println("-----Compra-----");
        //simular compra compradorUno
        Comprador compradorUno = new Comprador(moneda1, 1, exp);
        //System.out.println("-----Compra 1-----");
        System.out.println("Moneda: " + moneda1.getValor());
        System.out.println("Sabor: " + compradorUno.queBebiste());
        System.out.println("Vuelto: " + compradorUno.cuantoVuelto());
        System.out.println();
        
        //simular compra comprador2
        Comprador compradorDos = new Comprador(moneda2, 2, exp);
        //System.out.println("-----Compra 2-----");
        System.out.println("Moneda: " + moneda2.getValor());
        System.out.println("Sabor: " + compradorDos.queBebiste());
        System.out.println("Vuelto: " + compradorDos.cuantoVuelto());
        System.out.println();
                
        Comprador compradorTres = new Comprador(moneda3, 1, exp);
        //System.out.println("-----Compra 3-----");
        System.out.println("Moneda: " + moneda2.getValor());
        System.out.println("Sabor: " + compradorDos.queBebiste());
        System.out.println("Vuelto: " + compradorDos.cuantoVuelto());
        System.out.println();
        /*
        Deposito d = new Deposito();
        DepositoVuelto dvuelto = new DepositoVuelto();
        Expendedor exp2 = new Expendedor(3,400);
        
        System.out.println("compra 1-------");
        System.out.println("Precio: " + exp.getPrecioBebida());
        int beb = cc.getSerie();
        if(beb == 1) System.out.println("Coca Cola");
        else if(beb == 2) System.out.println("Sprite");
        else if(beb == 3) System.out.println("Fanta");
        
        System.out.println("Moneda: " + dvuelto.getMoneda());
        System.out.println("vuelto: " + exp.getVuelto());
        
        System.out.println("compra 2-------");
        System.out.println("Precio: " + exp2.getPrecioBebida());
 //       int beb2 = f.getSerie();
 //       if(beb2 == 1) System.out.println("Coca Cola");
 //       else if(beb2 == 2) System.out.println("Sprite");
 //       else if(beb2 == 3) System.out.println("Fanta");
        DepositoVuelto dvuelto2 = new DepositoVuelto();
        System.out.println("Moneda: " + dvuelto2.getMoneda());
        System.out.println("vuelto: " + exp2.getVuelto());
*/
    }
    
}
