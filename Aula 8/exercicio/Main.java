import java.util.ArrayList;
import java.util.List;

import funcionarios.*;

public class Main {
    
    public static void reajustaSalario(List<? extends Funcionario> list){
        for(Funcionario funcionario : list){
            funcionario.reajustaSalario();
        }
    }
    public static void dadosFuncionario(List<? extends Funcionario> list){
        for(Funcionario funcionario : list){
                System.out.println("Funcionario:"+funcionario.getNome()+
                                    " ID:"+funcionario.getID()+
                                    " Salario:"+funcionario.getSalario());
            }
        }
    
    public static void main (String args[]){

        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Administrativo("Gustavo", "2344", 495.50));
        funcionarios.add(new Funcional("Fernando", "3404", 230.45));

        reajustaSalario(funcionarios);
        dadosFuncionario(funcionarios);
    }
}
