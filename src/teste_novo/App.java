package teste_novo;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/teste_novo/tela.fxml"));
		
		Parent parent = loader.load();
		
		AppController ctr = loader.getController();
		
		
		ctr.getItems().add(new Pessoa("Pedro"));
				
		Scene cena = new Scene(parent, Color.TRANSPARENT);

						 		
		primaryStage.setScene(cena);
		
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
