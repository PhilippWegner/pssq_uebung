module de.pssq.uebung.mvc {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens de.pssq.uebung.mvc to javafx.fxml;
    exports de.pssq.uebung.mvc;
}
