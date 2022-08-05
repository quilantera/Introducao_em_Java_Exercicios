package funcionarios;

public class Funcional extends Funcionario{

    public Funcional(String nome, String id, double salario){
        super(nome,id,salario);
    }
    @Override
    public void reajustaSalario() {
       salario += salario * 0.02;
    }

}