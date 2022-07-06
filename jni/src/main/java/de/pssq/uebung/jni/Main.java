package de.pssq.uebung.jni;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ergebnis Double: " + new Summieren().summiere(7.5, 3.4));

		System.out.println("Ergebnis String: " + new Summieren().summiereAsString(7.5, 3.4));
		
		new Summieren().summiereCallback(7.5, 3.4);
	}

}
