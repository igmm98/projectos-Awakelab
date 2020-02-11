package Principal;
import java.util.Scanner;

public class Productos {
	
	private String nombreP; // NOMBRE DEL PRODUCTO
	private double precioP;	// PRECIO DEL PRODUCTO
	private String[][] productosList;


	private Scanner s = new Scanner(System.in);
	
	// GET
	public String getNombreP() {
		return this.nombreP;
	}
	public double getPrecioP() {
		return this.precioP;
	}
	 
	// SET
	public void setNombreP(String n) {
		this.nombreP = n;
	}
	public void setPrecioP(double p) {
		this.precioP = p;
	}
	
	void Texto() {
		System.out.println("La información del producto es:");
	}
	
	
	public void Calcular(int c) {
		
		this.productosList = new String[c][3];
		
		for(int i=0; i<c; i++) {
			System.out.println("------------------------");
			System.out.println("- Ingrese nombre "+(i+1)+":");
			
			this.productosList[i][0]= this.s.next();
			
			System.out.println("- Ingrese precio "+(i+1)+":");
			this.productosList[i][1]= this.s.next();

			System.out.println("- Ingrese cantidad "+(i+1)+":");
			this.productosList[i][2]= this.s.next();

		}
		for(int o=0; o<c; o++) {
			System.out.println("------------2------------");
			System.out.println("N:"+this.productosList[o][0]);
			
			
			System.out.println("P:"+this.productosList[o][1]);

			System.out.println("C:"+this.productosList[o][2]);
		}
		
	}
}
