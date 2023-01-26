package exercicios.monitoria.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<>();

    public List<Contato> getContatos() {
        return contatos;
    }

    //Adiciona um contato por vez e não a lista toda
    public void addContato(Contato contato) {
        contatos.add(contato);
    }
}
