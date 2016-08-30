package teste_novo;

import javafx.beans.property.SimpleStringProperty;

public class Pessoa {

	private SimpleStringProperty nome = new SimpleStringProperty("");

	public Pessoa(String nome) {
		this.nome.set(nome);		
	}

	public SimpleStringProperty getNomeProp() {
		return nome;
	}
	
	public String getNome() {
		return nome.get();
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}
	
	
	
	
	
	
	
}
