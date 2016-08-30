package teste_novo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class AppController implements Initializable {
	
	@FXML
	TableView<Pessoa> tabela;
		
	
	@FXML
	TableColumn<Pessoa, String> colNome;
	
	@FXML 
	Button btnSair;
	
	@FXML 
	Button btnAdd;	
	
	@FXML 
	TextField txtNome;

	private ObservableList<Pessoa> items;
	
	
			

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		items = tabela.getItems();
				
		colNome.setCellValueFactory(cellValue -> cellValue.getValue().getNomeProp());			
		
//		
//		Pessoa p1 = new Pessoa("Alosio");
//		Pessoa p2 = new Pessoa("Lilian");
//		Pessoa p3 = new Pessoa("Clara");
//		
//		items.addAll(p1, p2, p3);

		
		btnSair.setOnAction(sair -> {
			Platform.exit();
		});
		
		
		btnAdd.setOnAction(add -> {			
			items.add( new Pessoa( txtNome.getText() ) );
		});
					
		tabela.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				if ( (event.getCode().equals(KeyCode.DOWN)) || (event.getCode().equals(KeyCode.UP)) ){
					int i = tabela.getSelectionModel().getSelectedIndex();			
					Pessoa p = tabela.getItems().get(i);			
					System.out.println(p.getNome());	
				}
				
			}
			
		});
		
			
		tabela.setOnMouseClicked(t -> {
			
			int i = tabela.getSelectionModel().getSelectedIndex();			
			Pessoa p = tabela.getItems().get(i);			
			System.out.println(p.getNome());			
			
		});
		
	}


	public ObservableList<Pessoa> getItems() {
		return items;
	}




	public void setItems(ObservableList<Pessoa> items) {
		this.items = items;
	}

}
