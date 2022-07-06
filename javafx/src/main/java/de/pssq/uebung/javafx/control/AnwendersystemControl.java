package de.pssq.uebung.javafx.control;

import de.pssq.uebung.javafx.model.AnwendersystemModel;
import de.pssq.uebung.javafx.model.Person;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AnwendersystemControl {
	
	private AnwendersystemModel anwModel;
	
	@FXML private TableView<Person> tblPersonen;	
	@FXML private TableColumn<Person, String> clmnVorname;
	@FXML private TableColumn<Person, String> clmnNachname;
	@FXML private TextField txtVorname;
	@FXML private TextField txtNachname;
	
	public AnwendersystemControl(){
		anwModel = new AnwendersystemModel();
	}
	
	@FXML
	private void bearbeiteEingabe(){
		// Hinzufuegen eines Objekts vom Typ Person mittels Methode
		// add aus ObservableList<E>
		Person person = new Person(this.txtVorname.getText(), this.txtNachname.getText());
		this.anwModel.getPersonen().add(person);
		this.refreshPersonen();
	}  
	
	@FXML
	private void loescheZeile(){
		// Selektieren einer markierten Zeile mittels getSelectionModel
		// aus TableView und getSelectedIndex aus TableViewSelectionModel.
		// Loeschen einer Zeile mittels remove aus ObservableList<E>.
		
		if(this.tblPersonen.getSelectionModel().getSelectedItem() != null) {
			Person person = this.tblPersonen.getSelectionModel().getSelectedItem();
			this.anwModel.getPersonen().remove(person);
		}

	}
	   
	@FXML
	private void initialize() {
         // Tabellenspalten erstellen und fuellen
	     this.tblPersonen.setEditable(true);
	     this.clmnVorname.setCellValueFactory(
	         new PropertyValueFactory<Person,String>("vorname"));
         // Hinzufuegen weiterer Spalten
	     this.clmnNachname.setCellValueFactory(
		         new PropertyValueFactory<Person,String>("nachname"));
         // Hinzufuegen von Zeilen mittels setItems aus TableView
	
	}
	
	public void refreshPersonen() {
		this.tblPersonen.setItems(this.anwModel.getPersonen());
	}
		
}


