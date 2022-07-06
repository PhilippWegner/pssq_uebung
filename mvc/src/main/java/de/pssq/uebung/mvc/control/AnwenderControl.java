package de.pssq.uebung.mvc.control;

import java.io.FileNotFoundException;
import java.io.IOException;

import de.pssq.uebung.mvc.model.AnwenderModel;
import de.pssq.uebung.mvc.view.AnwenderView;
import javafx.stage.Stage;

public class AnwenderControl {
	private AnwenderModel anwenderModel;
	private AnwenderView anwenderView;
	

	public AnwenderControl(Stage primaryStage) {
		this.anwenderModel = AnwenderModel.getInstance();
		this.anwenderView = new AnwenderView(this.anwenderModel, this, primaryStage);
		primaryStage.show();
	}
	// Copy+Paste aus Aufgabe
	public String leseDatenAusDatei() {
		String erg = "";
		try {
			erg = anwenderModel.leseDatenAusDatei();
		} catch(FileNotFoundException fnfe) {
			this.anwenderView.zeigeFehlermeldungAn("Datei nicht vorhanden!");
		} catch(IOException ioe) {
			this.anwenderView.zeigeFehlermeldungAn("Fehler beim Lesen der Datei!");
		}
		return erg;
	}
	
	public String getDaten() {
		return anwenderModel.getDaten();
	}
}
