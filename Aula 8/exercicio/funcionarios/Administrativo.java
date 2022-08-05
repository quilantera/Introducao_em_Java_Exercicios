package funcionarios;

public class Administrativo extends Funcionario {
    
    public Administrativo(String nome, String id, double salario){
        super(nome,id,salario);
    }
    @Override
    public void reajustaSalario() {
       salario += salario * 0.015;
    }
}
