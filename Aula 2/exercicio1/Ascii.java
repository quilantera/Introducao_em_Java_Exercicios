package exercicio;
public class Ascii{
   
    public void convertCharToInt(char value){
        System.out.println(value+"adjffanfa"+(int)value);
        
    }
    public void convertIntToChar(int value){
        System.out.println(value+"--->"+(char)value);
    }
    public void showTable(){
        System.out.println("\t\t\t Tabela ASCII \n\n ");
        for(int begin = 33; begin  <= 126; begin++){
            System.out.print(begin+ " --> "+(char)begin+"\t");
            if(begin%4 == 0){
                System.out.print("\n");
            }
        }
        System.out.println("\n");
    }
}
