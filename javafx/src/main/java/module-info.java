module de.pssq.uebung.javafx {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens de.pssq.uebung.javafx to javafx.fxml, javafx.control, javafx.graphics;
    exports de.pssq.uebung.javafx;
    
    opens de.pssq.uebung.javafx.control to javafx.fxml, javafx.control, javafx.graphics;
    exports de.pssq.uebung.javafx.control;
    
    exports de.pssq.uebung.javafx.model;
}
