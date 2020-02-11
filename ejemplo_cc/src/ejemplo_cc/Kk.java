package ejemplo_cc;
import java.util.Arrays;

public class Kk {

	public static void main(String[] args) {
		
		int[] arreglo = new int[10];
		for(int a = 0; a<10; a++) {
			arreglo[a]= a+1;
		}
		Arrays.asList(arreglo).forEach(System.out::println);
		//System.out.println(Arrays.asList(arreglo));
		/*for(int i : arreglo) {
			
			System.out.println("Valores (del 1 al 10) = "+i);
		}*/
		//Arrays.asList(arreglo).forEach(System.out::println);
		//Arrays.sort(arreglo);
		
	}

}
