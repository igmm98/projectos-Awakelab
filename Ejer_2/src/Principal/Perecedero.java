package Principal;
import java.util.ArrayList;

public class Perecedero extends Productos{
	
	private int diasCaducar;
	@SuppressWarnings({ "unused", "rawtypes" })
	private ArrayList[][] productosList;
	
	// GET DIAS A CADUCAR
	public int getDiasCaducar() {
		return this.diasCaducar;
	}
	// SET DIAS A CADUCAR
	public void setDiasCaducar(int d) {
		this.diasCaducar = d;
	}
	
	public void Calcular(int c) {
		
		productosList = new ArrayList[c][c];
	}

}
