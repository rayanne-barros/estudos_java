package exercicios.monitoria.controller;

import exercicios.monitoria.model.Agenda;
import exercicios.monitoria.model.Contato;
import exercicios.monitoria.view.AgendaView;

public class AgendaController {
    private Agenda agenda = new Agenda();

    public void adicionarContato(Contato contato) {
        agenda.addContato(contato);
    }

    public void listarContatos(AgendaView view) {
        agenda.getContatos().forEach(contato -> view.mostrarContato(contato));


    }


}
