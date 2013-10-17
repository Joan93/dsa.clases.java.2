package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class ej9main {

	public static void main(String args[]) {
		ejercicio9 t1 = new ejercicio9("ID1", 4);
		ejercicio9 t2 = new ejercicio9("ID2", 7);
		ejercicio9 t3 = new ejercicio9("ID3", 8);

		t1.start();
		t2.start();
		t3.start();
	}
}
