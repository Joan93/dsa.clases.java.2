package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class CuentaAtras extends Thread {

	public String nombre;
	public int s;
	public int ultimaescritura;

	public CuentaAtras(String nom, int seg) {
		nombre = nom;
		s = seg;
	}
	public static String id=null;
	
	public void run() {
		
		while (s >= 0) {
			System.out.println(id);
			
			System.out.println("Contador: " + nombre + " quedan " + s
					+ " segundos");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}
			id=nombre;
			s--;
		}
		int cuenta = Thread.activeCount()-2;
		System.out.println(+ cuenta + " Threads activos" );
	}
}
