package Principal;
import java.util.Scanner;

public class ArregloProductos {
	
	private String arreglo[][];
	private int diasCad[];
	private Scanner l = new Scanner(System.in);
	
	public ArregloProductos() {
		
	}
	

	public void agregarProductos(int c) {
		
		this.arreglo = new String[c][2];
		
		for(int i = 0; i<this.arreglo.length; i++) {
			System.out.println("Ingrese producto:");
			this.arreglo[i][0] = l.next();
			System.out.println("Ingrese cantidad:");
			this.arreglo[i][1] = l.next();
			
			
		}
		
	}
	
	public void diasCaducar(int d) {
		this.diasCad = new int[d];
		
		for(int i = 0; i<d; i++) {
		}
		
	}
}
