package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class Main{

    public static void main(String[] args){
        Main m = new Main();// precisei instanciar para conseguir usar o metodo printList.
        ArrayList<Subject>subjectsList = new ArrayList<Subject>();

        subjectsList.add(new Subject("CDP",990));
        subjectsList.add(new Subject("LP", 103));
        subjectsList.add(new Subject("ED", 378));
        subjectsList.add(new Subject("ATP",120));
        subjectsList.add(new Subject("ES", 841));
        subjectsList.add(new Subject("BD", 452));

        System.out.println("\n\t\t LISTA SEM ORDENACAO \n");
        m.printList(subjectsList);
        
        System.out.println("\n\t\t LISTA ORDENADA POR NOME\n");
        Collections.sort(subjectsList, new CompareByName());
        m.printList(subjectsList);

        System.out.println("\n\t\t LISTA ORDENADA POR ID\n");
        Collections.sort(subjectsList, new CompareByID());
        m.printList(subjectsList);
    }
   

    public void printList(ArrayList<Subject> subjectsList){
        Iterator<Subject> itSubj = subjectsList.iterator();
        while(itSubj.hasNext()){

            Subject aux = itSubj.next();
            System.out.println("Materia -> "+aux.getName()+
                                "\tid-> "+aux.getID());
        }
    }
}