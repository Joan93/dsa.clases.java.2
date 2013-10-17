package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class ej10main {

	public static void main(String args[]) {
		ejercicio10 t1 = new ejercicio10("ID1", 4);
		ejercicio10 t2 = new ejercicio10("ID2", 7);
		ejercicio10 t3 = new ejercicio10("ID3", 8);

		t1.start();
		t2.start();
		t3.start();
	}
}
