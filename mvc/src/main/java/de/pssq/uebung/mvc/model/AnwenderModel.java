package de.pssq.uebung.mvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnwenderModel {
	
	private static class SingletonHelper {
		private static final AnwenderModel INSTANCE = new AnwenderModel();
	}
	
	public static AnwenderModel getInstance(){
	    return SingletonHelper.INSTANCE;
	}
	
	private AnwenderModel() {}
	
	// Copy+Paste aus Aufgabe
	public String leseDatenAusDatei() throws IOException, FileNotFoundException {
		String input = "";
		BufferedReader br = new BufferedReader(new FileReader("Testdatei.txt"));
		String buffer;
		while((buffer = br.readLine()) != null) {
			input += buffer + ";";
		}
		System.out.println(input);
		br.close();
		return input;
	}
	// Copy+Paste aus Aufgabe
	public String getDaten() {
		return "in getDaten";
	}
}
