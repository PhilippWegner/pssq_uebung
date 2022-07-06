package de.pssq.uebung.mvc.view;


import de.pssq.uebung.mvc.control.AnwenderControl;
import de.pssq.uebung.mvc.model.AnwenderModel;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// Aus Vorlage (docx) kopiert!
// Klasse angepasst
public class AnwenderView {
	
	private AnwenderModel anwenderModel;
	private AnwenderControl anwenderControl;


	// ---Anfang Attribute der grafischen Oberflaeche---
	private Pane pane = new Pane();
	private TextField txtTextfeld = new TextField();
	private Button btnLeseAusDatei = new Button("Lese aus Datei");
	private Button btnHolen = new Button("Holen");
	// -------Ende Attribute der grafischen Oberflaeche-------

	public AnwenderView(AnwenderModel anwenderModel, AnwenderControl anwenderControl, Stage stage) {
		this.anwenderModel = anwenderModel;
		this.anwenderControl = anwenderControl;
		Scene scene = new Scene(this.pane, 300, 150);
		stage.setScene(scene);
		this.initKomponenten();
		this.initListener();
	}
	
	
	private void initKomponenten() {
		// Textfelder
		this.txtTextfeld.setLayoutX(20);
		this.txtTextfeld.setLayoutY(40);
		pane.getChildren().addAll(txtTextfeld);
		// Buttons
		this.btnLeseAusDatei.setLayoutX(180);
		this.btnLeseAusDatei.setLayoutY(40);
		this.btnLeseAusDatei.setPrefWidth(100);
		this.btnHolen.setLayoutX(180);
		this.btnHolen.setLayoutY(80);
		this.btnHolen.setPrefWidth(100);
		pane.getChildren().addAll(btnLeseAusDatei, btnHolen);
	}

	private void initListener() {
		this.btnLeseAusDatei.setOnAction(aEvent -> {
			String output = this.anwenderControl.leseDatenAusDatei();
			this.txtTextfeld.setText(output);
		});
		
		this.btnHolen.setOnAction(aEvent -> {
			String output = this.anwenderControl.getDaten();
			this.txtTextfeld.setText(output);
		});
	}

	public void zeigeInformationsfensterAn(String meldung) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setContentText(meldung);
		alert.showAndWait();
	}

	public void zeigeFehlermeldungAn(String meldung) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Fehlermeldung");
		alert.setContentText(meldung);
		alert.showAndWait();
	}
}
