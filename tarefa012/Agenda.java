import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> agenda = new ArrayList<Contato>();

    public void addContato(Contato contato){
        this.agenda.add(contato);
    }

    public void removeContato(String nome){
        for(Contato contato : this.agenda){
            if(contato.getNome().equals(nome)) this.agenda.remove(contato);
        }
    }

    public Contato buscarContato(String busca){
        for(Contato contato : this.agenda){
            if(contato.getEmail().equals(busca) || contato.getNome().equals(busca)) return contato;
        }
        return null;
    }

    public String listarContatos(){
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Conatatos: \n");
        for(Contato contato : this.agenda){
            sb.append(++i)
            .append(" - ")
            .append("Nome: " + contato.getNome())
            .append(" | Email: " + contato.getEmail())
            .append("\n");
        }
        return sb.toString();
    }
}
