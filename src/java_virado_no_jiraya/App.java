package java_virado_no_jiraya;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Rayanne";
        funcionario.idade = 27;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.salario1 = 2334.00;
        funcionario.salario2 = 3334.00;
        funcionario.salario3 = 1334.00;

        funcionario.imprime();


        System.out.println(funcionario);
        Double media = (funcionario.salario1 + funcionario.salario2 + funcionario.salario3) / 3d;
        System.out.println(media);


    }
}
