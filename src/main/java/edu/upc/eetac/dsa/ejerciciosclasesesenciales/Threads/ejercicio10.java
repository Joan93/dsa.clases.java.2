package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class ejercicio10 extends Thread{

	public String nombre;
	public int s;
	public int ultimaescritura;

	public ejercicio10(String nom, int seg) {
		nombre = nom;
		s = seg;
	}
	public static String id;
	public String id2;
	
	public synchronized void run() {
		
		while (s >= 0) {

			if (id!=null){
			System.out.println("" + nombre + " - " + s+" - Ultima Escritura "
					+id+ " ");
			}
			else{
				System.out.println("" + nombre + " - " + s+" - Ultima Escritura "
						 );
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}
			id=nombre;
			id2=nombre;
			s--;
		}
		int cuenta = Thread.activeCount()-2;
		System.out.println(+ cuenta + " Threads activos" );
	}
}
