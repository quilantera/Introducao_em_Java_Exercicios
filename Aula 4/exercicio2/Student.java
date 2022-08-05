package exercicio2;

public class Student {
    private String name;
    private double p1;
    private double p2;
    private double media;

    public Student(String name, double p1, double p2){
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.media = (p1 +p2)/2;
        
    }
   
    public String getName(){
        return name;
    }
    public double getP1(){
        return p1;
    }
    public double getP2(){
        return p2;
    }
    public double getMedia(){
        return media;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setP1(double p1){
        this.p1 = p1;
    }
    public void setP2(double p2){
        this.p2 = p2;
    }
    public void mediaCalculator(){
        this.media = (this.p1+this.p2)/2;
    }
    public String isApproved(){
        if(this.media > 5){
            return ("Aprovado");
        }
        else return ("Reprovado");

    }
}
