package exercicios.monitoria.view;

import com.sun.source.tree.BreakTree;
import exercicios.monitoria.controller.AgendaController;
import exercicios.monitoria.model.Contato;
import exercicios.monitoria.model.Endereco;
import exercicios.monitoria.model.Telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaView {
    Scanner sc = new Scanner(System.in);
    AgendaController controller = new AgendaController();

    public void mostrarMenu() {
         Boolean continuar = true;
         do {
             System.out.println("1- Adicionar Contato");
             System.out.println("2- Listar Contatos");
             System.out.println("0- Sair");

             String opcao = sc.nextLine();
             switch (opcao) {
                 case "1" -> adicionarContato();
                 case "2" -> listarContato();
                 case "0" -> continuar = false;
                 default -> System.out.println("Opção inválida");
             }
         } while(continuar);
     }

    public List<Endereco> mostrarMenuCadastroEndereco() {
        Boolean continuar = true;
        List<Endereco> enderecos = new ArrayList<>();
        do {
            System.out.println("Deseja adicionar endereço?");
            System.out.println("1- Sim");
            System.out.println("0- Não");

            String opcao = sc.nextLine();

            if (opcao.equals("0")) {
                break;
            }
            Endereco endereco = new Endereco();

            System.out.println("Digite o estado do endereço do contato: ");
            endereco.setEstado(sc.nextLine());
            System.out.println("Digite o município do endereço do contato: ");
            endereco.setMunicipio(sc.nextLine());
            System.out.println("Digite o bairro do endereço do contato: ");
            endereco.setBairro(sc.nextLine());
            System.out.println("Digite o complemento do endereço do contato: ");
            endereco.setComplemento(sc.nextLine());
            System.out.println("Digite o cep do endereço do contato: ");
            endereco.setCep(sc.nextLine());

            enderecos.add(endereco);

        } while (continuar);
        return enderecos;
    }

    public List<Telefone> mostrarMenuCadastroTelefone() {
        Boolean continuar = true;
        List<Telefone> telefones = new ArrayList<>();
        do {
            System.out.println("Deseja adicionar telefone?");
            System.out.println("1- Sim");
            System.out.println("0- Não");

            String opcao = sc.nextLine();

            if (opcao.equals("0")) {
                break;
            }

            Telefone telefone = new Telefone();

            System.out.println("Digite o ddd do telefone: ");
            telefone.setDdd(sc.nextInt());
            System.out.println("Digite o número do telefone: ");
            telefone.setNumero(sc.nextInt());
            sc.nextLine();

            telefones.add(telefone);

        } while (continuar);
        return telefones;
    }

    public void mostrarContato(Contato contato) {
        System.out.println("Nome completo: "+contato.getNomeCompleto());
        System.out.println("Email :" + contato.getEmail());
        System.out.println("Telefones:");
        contato.getTelefones().forEach(telefone -> {
            Integer id = contato.getTelefones().indexOf(telefone);
            System.out.println("Identificador: " + id);
            System.out.println("DD: " + telefone.getDdd());
            System.out.println("Número: " + telefone.getNumero());
            System.out.println("/n");
        });
        System.out.println("Endereços:");
        contato.getEndereco().forEach(endereco -> {
            Integer id = contato.getEndereco().indexOf(endereco);
            System.out.println("Indetificador: "+ id);
            System.out.println("Estado: " + endereco.getEstado());
            System.out.println("Município: " + endereco.getMunicipio());
            System.out.println("Bairro: " + endereco.getBairro());
            System.out.println("Complemento: " + endereco.getComplemento());
            System.out.println("Cep: " + endereco.getCep());
            System.out.println("/n");
        });
    }

    public void adicionarContato() {
        Contato contato = new Contato();

        System.out.println("Digite o nome do contato: ");
        contato.setNomeCompleto(sc.nextLine());

        System.out.println("Digite o email do contato: ");
        contato.setEmail(sc.nextLine());

        contato.setEndereco(mostrarMenuCadastroEndereco());
        contato.setTelefones(mostrarMenuCadastroTelefone());

        controller.adicionarContato(contato);
    }

    //Como os métodos não são estáticos, ele só entra nesse método quando tem uma instância. Quando passo o this estou passando minha agendaview.
    public void listarContato() {
        controller.listarContatos(this);
    }
}
