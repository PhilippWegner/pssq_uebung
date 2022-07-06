package de.pssq.uebung.jni;

public class Summieren {
	static {
		System.loadLibrary("JNI_C_DLL_Kurzanleitung");
	}

	public native double summiere(double zahl1, double zahl2);
	public native String summiereAsString(double zahl1, double zahl2);
	public native void summiereCallback(double zahl1, double zahl2);
	
	public void ergebnisAusgeben(String ergebnis) {
		System.out.println(ergebnis);
	}
}
