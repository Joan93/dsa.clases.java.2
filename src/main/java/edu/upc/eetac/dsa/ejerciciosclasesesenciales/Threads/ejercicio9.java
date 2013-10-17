package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class ejercicio9 implements Runnable {
	public String nombre;
	public int s;

	public ejercicio9(String nom, int seg) {
		nombre = nom;
		s = seg;
	}

	public void run() {
		while (s >= 0) {
			System.out.println("Contador: " + nombre + " quedan " + s
					+ " segundos");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}
			s--;
		}
	}

	public void start() {
		// TODO Auto-generated method stub

	}
}
