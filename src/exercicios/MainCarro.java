package exercicios;

import exercicios.modelo.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Volkswagen");
        carro.setAno("2000");
        carro.setModelo("Gol");

        System.out.println("Nome: " +  carro.getNome() + " " + "Modelo: " + carro.getModelo() + " " + "Ano: " + carro.getAno());
    }


}
