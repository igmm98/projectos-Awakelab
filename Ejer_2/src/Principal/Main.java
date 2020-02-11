package Principal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Productos p = new Productos();
		p.Texto();
		p.Calcular(s.nextInt());
		
		s.close();
	}

}
