package exercicio2;

import java.util.Comparator;



public class CompareByName implements Comparator<Subject>{
    
    @Override
    public int compare(Subject subj1, Subject subj2){
        if(subj1.getName().compareTo(subj2.getName()) >0){
            return 1;
        }
        else 
            return -1;
    }
}
