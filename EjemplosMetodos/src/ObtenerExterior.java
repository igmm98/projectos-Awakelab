
public class ObtenerExterior {

	private int tamArreglo;
	private int[]arreglo = new int [0];
	
	public int GetTamArreglo() {
		return this.tamArreglo;
	}
	
	public void SetTamArreglo(int tamArreglo) {
		this.tamArreglo = tamArreglo;
	}
	
	public void SetArreglo() {
		arreglo = new int[this.tamArreglo];
	}
	
	public int[] getArreglo() {
		return this.arreglo;
	}
	
	public void SetDatosArreglo(int i,int dato) {
		arreglo[i] = dato;
	}
}
