package java_virado_no_jiraya;

public class Funcionario {

    String nome;
    Integer idade;
    double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: salarios) {
            System.out.print(salario + " ");
        }
        imprimemediaSalario();

    }

    public void imprimemediaSalario(){
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;
        System.out.println("\nMedia salarial " + media);

    }


}
