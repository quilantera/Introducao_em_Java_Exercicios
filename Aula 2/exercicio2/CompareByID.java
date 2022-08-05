package exercicio2;

import java.util.Comparator;


public class CompareByID implements Comparator <Subject>{

    @Override
    public int compare(Subject subj1, Subject subj2){
        if(subj1.getID() > subj2.getID()){
            return 1;
        }
        else 
            return -1;
    }
}
