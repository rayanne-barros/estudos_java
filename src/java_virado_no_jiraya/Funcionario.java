package java_virado_no_jiraya;

public class Funcionario {

    String nome;
    Integer idade;
    Double salario1;
    Double salario2;
    Double salario3;
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

    @Override
    public String toString() {
        return (
                "nome='" + nome + '\'' +
                        ", idade=" + idade +
                        ", salario1=" + salario1 +
                        ", salario2=" + salario2 +
                        ", salario3=" + salario3
        );
    }
}
