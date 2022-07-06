package de.pssq.uebung.javafx.model;

import javafx.collections.*;

public final class AnwendersystemModel {
	
	// Anstatt mit null muss personen mit einer ObservableList gefuellt werden.
  	private final ObservableList<Person> personen = FXCollections.observableArrayList();
  	
  	public AnwendersystemModel() {
  	}
		
	public ObservableList<Person> getPersonen() {
		System.out.println(personen);
		return personen;
	}
	 	 
}
