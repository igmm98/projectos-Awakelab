package Principal;
import java.util.ArrayList;

public class No_perecedero extends Productos {
	
	private String tipoP;
	@SuppressWarnings({ "unused", "rawtypes" })
	private ArrayList[][] productosList;
	
	// GET TIPO DE PRODUCTO
	public String getTipoP() {
		return this.tipoP;
	}
	// SET TIPO DE PRODUCTO
	public void setTipoP(String p) {
		this.tipoP = p;
	}
	
	public void Calcular(int c) {
		
		productosList = new ArrayList[c][c];
	}

}
