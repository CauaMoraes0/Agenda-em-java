package appAgenda;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<ContatoBasico>contatos;
	Agenda(){
		contatos = new ArrayList<>();
	}
	public void inserir(ContatoBasico C) {
		contatos.add(C);
	}
	public ContatoBasico buscar(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			ContatoBasico c = contatos.get(i);
		if (c.getNome().equalsIgnoreCase(nome))
			return contatos.get(i);
	}
	return null;

}

   public Contato[] buscarGeral(String palavraChave) {
	   ArrayList<ContatoBasico> todos = new ArrayList<>();
	    for (int i=0;i<contatos.size();i++) {
	    	ContatoBasico c = contatos.get(i);
	    	if(c.getDados().contains(palavraChave))
	    		todos.add(c);
	    }
	    
	    ContatoBasico[] vet = new ContatoBasico[todos.size()];
        return (Contato[]) todos.toArray(vet);
   }
   public Contato[] buscarTodos() {
	   Contato[] vet = new Contato [contatos.size()];
	   
	   return contatos.toArray(vet);
   }
   
   public int getQuantidade() {
	   return contatos.size();
      }
   }
