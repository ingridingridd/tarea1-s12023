package tarea12023;

abstract class Bebida{
    private int serie; //codigo bebida
    
    public Bebida(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}