package Principal;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//SCANNER
		Scanner l = new Scanner(System.in);
		
		//CODIGO PRINCIPAL DE EJECUCION 
		System.out.println("Indicar largo para contraseņa: ");
		Password p = new Password(l.nextInt());
		p.Muestra();
		System.out.println("----------------------\nIndicar largo para arreglo de contraseņas: ");
		ArrayPasswords a = new ArrayPasswords(l.nextInt());
		a.VerArray();
		
		//CERRAR SCANNER
		l.close();
	}
	
}
