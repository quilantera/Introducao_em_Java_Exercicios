package thread;

public class Main {
    public static void main(String args[]){
        for(int c=1; c < 10; c++ ){
        Contador cont = new Contador(c);
        cont.start();
        }
    }
}

class Contador extends Thread{
    private int contador;
    public Contador(int contador){
        this.contador = contador;

    }
    public void run(){
        for(int posicao= 0; posicao<= contador; posicao++){
            System.out.println("Contador"+contador+" posicao: "+posicao);
        }
    }

}