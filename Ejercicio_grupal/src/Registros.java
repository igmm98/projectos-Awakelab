
public class Registros {
	
	
	//VARIABLES UNICAMENTE ACCESIBLES Y MODIFICABLES A TRAVÉS DE AQUI
	private String rut; 
	private String nombre;
	private String apellidos;
	
	
	//	Al ser variables private, la unica forma de accederlas desde la MainVista, es a través de estos metodos
	// estos metodos definen o muestran las variables
	
	public void SetNombre(String nombre) {
		this.nombre = nombre;
	}
	public String GetNombre() {
		return this.nombre;
	}
	
	public void SetRut(String rut) {
		this.rut = rut;
	}
	public String GetRut() {
		return this.rut;
	}
	
	public void SetApellido(String apellidos) {
		this.apellidos =  apellidos;
	}
	public String GetApellido() {
		return this.apellidos;
	}

}
