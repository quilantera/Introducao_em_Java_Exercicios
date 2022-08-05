package runnable;

public class Main {
    public static void main(String args[]){
    for (int i =0; i<10; i++){
        Contador cont = new Contador(i);
        Thread contador = new Thread(cont);
        contador.start();
    }
}
}
