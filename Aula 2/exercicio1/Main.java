package exercicio;

import  java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int choose = 0;
        Ascii ascii = new Ascii();
        char Cvalue;
        int Ivalue;
        while(choose != 3){
            System.out.println("\t\t\tMenu");
            System.out.println("\n Digite 1 - para ver a tabela ASCII");
            System.out.println("\n Digite 2 - para fazer a conversao");
            System.out.println("\n Digite 3 - para sair");
            Scanner rChoose = new Scanner(System.in); 
            choose = rChoose.nextInt();
            if (choose == 1){
                ascii.showTable();
            }
            if (choose == 2){
                System.out.println("\n Insere um numero ou caractere");
                Scanner read = new Scanner(System.in);
                try{
                    Ivalue = read.nextInt();
                    ascii.convertIntToChar(Ivalue);
                }
                catch(Exception e){
                    Cvalue = read.next().charAt(0);
                    ascii.convertCharToInt(Cvalue);
                  }
            }
        }
    }
}
