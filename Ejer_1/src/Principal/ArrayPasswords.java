package Principal;


public class ArrayPasswords {
	
	private String contrasenas[]; //ARREGLO QUE GUARDAR� TODAS LAS CONTRASE�AS QUE SE INGRESEN
	private String validacionContra[];
	private int longitud = 8; //LONGITUD DE LA CONTRASE�A, QUE SE INICIA CON VALOR 8 POR DEFECTO
	
	Password util = new Password();
	
	public ArrayPasswords() {
		
	}
	public ArrayPasswords(int Longitud) {
		this.longitud = Longitud;
	}
	
	private void setArray() {
		this.contrasenas = new String [this.longitud];
	}
	
	private void ArrayGenerator() {
		
		setArray();
		validacionContra = new String[contrasenas.length];
		for(int i = 0; i < contrasenas.length; i++) {
			
			contrasenas[i] = util.generarPassword(util.getLongitud());
			validacionContra[i] = ""+util.esFuerte(contrasenas[i]);
			
			
		}
	}
	
	public void VerArray() {
		
		ArrayGenerator();
		System.out.println("---------------------- ");
		System.out.println("Arreglo de contrase�as generadas:");
		for(int i = 0; i<contrasenas.length; i++) {
			System.out.println(contrasenas[i]);
			System.out.print("�Es fuerte? = "+validacionContra[i]+"\n");
		}
	}
	

}
