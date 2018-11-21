package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	public static Main singleton;
	private Stage stage;
	private BorderPane root;

	@Override
	public void start(Stage primaryStage) {
		try {
			singleton = this;
			stage = primaryStage;
			root = (BorderPane)FXMLLoader.load(getClass().getResource("Top.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false);		//画面サイズの変更不可
			primaryStage.sizeToScene();				//微妙な余白を調整
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Main getInstance(){
		return singleton;
	}

	//画面遷移用メソッド、引数は遷移対象のfxml
	public void setPage(String fxml){
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource(fxml));
			stage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
