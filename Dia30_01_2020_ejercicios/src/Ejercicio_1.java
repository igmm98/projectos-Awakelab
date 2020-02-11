import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio_1 {

	public static Scanner leer = new Scanner(System.in);
	
	public static ArrayList<Integer> array = new ArrayList();
	
	
	public static void main(String[] args) {
		
		Arreglo();
	}
	
	public static void Arreglo() {
		
	
		
		for (int a = 0;a<14; a++ ) {
			System.out.println("Ingresar numero "+(a+1)+":");
			array.add(a, leer.nextInt(10));
		}
		leer.close();
		
		System.out.println("\nLos datos son:");
		
		ArregloVer(array);
		
	}
	public static void ArregloVer(ArrayList<Integer> array) {
		
		for(int a : array) {
			System.out.println(a);
		}
	}

}
