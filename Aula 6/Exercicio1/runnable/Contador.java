package runnable;

public class Contador implements Runnable {
    int posicao;
    public Contador(int posicao){
        this.posicao = posicao;
    }
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("contador: "+posicao+" posicao: "+i);
        }
    }
}
