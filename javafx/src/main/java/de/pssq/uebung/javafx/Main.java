package de.pssq.uebung.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			// Der Titel des ersten Fensters (primaryStage) wird gesetzt.
			primaryStage.setTitle("Anwendersystem Personen");
			// Die fxml-Datei, welche die GUI-Daten
			// zu dem Fenster enthaelt, wird geladen.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("AnwendersystemView.fxml"));
			// Eine grundlegende Scheibe (pane) fuer die GUI wird geladen.
			BorderPane root = loader.load();
			// Setzen des Scenegraphen
			Scene scene = new Scene(root, 480, 240);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}