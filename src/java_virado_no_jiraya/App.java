package java_virado_no_jiraya;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rayanne");
        funcionario.setIdade(27);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});


        funcionario.imprime();


    }
}
