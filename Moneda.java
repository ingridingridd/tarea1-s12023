package tarea12023;

abstract class Moneda{
    public Moneda(){
        
    }
    public Moneda getSerie (){
        return this;
    }
    public abstract int getValor(); //retorna la cantidad que devuelve la moneda
}