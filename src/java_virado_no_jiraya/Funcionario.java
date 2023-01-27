package java_virado_no_jiraya;

public class Funcionario {

    private String nome;
    private Integer idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null) {
            return;
        }
        for (double salario: salarios) {
            System.out.print(salario + " ");
        }
        imprimemediaSalario();

    }

    public void imprimemediaSalario(){
        if(salarios == null) {
            return;
        }

        for (double salario : salarios) {
               media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial " + media);
    }


}
