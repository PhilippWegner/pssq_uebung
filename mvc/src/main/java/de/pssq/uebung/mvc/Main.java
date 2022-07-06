package de.pssq.uebung.mvc;

import de.pssq.uebung.mvc.control.AnwenderControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		new AnwenderControl(primaryStage);
	}

}
