import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr =  Ejercicio_1.array;
		/*
		Scanner leer = new Scanner(System.in);
		
		int[] arreglo = new int [10];
		for(int a=0; a<10; a++) {
			System.out.println("Ingrese algo:");	
			arreglo[a]=leer.nextInt();
		}
		for(int i : arreglo) {
		System.out.println(i);	
		}*/
		for(int a : arr) {
			System.out.println(a);
		}
 	}

}
