import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);//Lector de ingresos por teclado
		// TODO Auto-generated method stub
		
		ObtenerExterior arreglos = new ObtenerExterior(); //Llamada a la clase exterior
		
		System.out.println("Defina tamaño arreglo:");
		
		int x = lector.nextInt();
		
		arreglos.SetTamArreglo(x);
		
		for(int i = 0; i<arreglos.GetTamArreglo(); i++) {
			
			System.out.println("Ingrese numero "+(i+1)+":");
			int dato = lector.nextInt();
			arreglos.getArreglo();
			arreglos.SetDatosArreglo(i, dato);
			
		}
	}	
}
