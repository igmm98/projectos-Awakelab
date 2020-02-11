package Principal;
import java.util.Random;

public class Password {
	
	
	private int longitud = 8; //LONGITUD DE LA CONTRASEÑA, QUE SE INICIA CON VALOR 8 POR DEFECTO
	private String contraseña; //OBJETO QUE TENDRÁ LA CONTRASEÑA CREADA
	private char[] auxiliar; // PERMITE DESCOMPONER LA CONTRASEÑA EN LOS CARACTERES QUE LA COMPONEN UTILIZANDO BUCLE
	
	
	//CONSTRUCTOR VACIO
	public Password() {
		
	}
	//CONSTRUCTOR CON LONGITUD 
	public Password(int Longitud) {
		longitud = Longitud;
	}
	public int getLongitud() {
		return this.longitud;
	}
	
	//METODO PARA OBTENER EL VALOR DE LA CONTRASEÑA
	public String getContra() {
		return contraseña;
	}
	//METODO PARA DEFINIR LA CONTRASEÑA
	public void setContra(String Contrasena) {
		contraseña = Contrasena;
	}
	
	
	/*---------------------------------------------------------------------------
	 * GENERADOR DE CONTRASEÑAS ALEATORIAS src= https://code.sololearn.com/cYbJ69AmaS8S/#java
	 */
	public String generarPassword(int len)
    {
        
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // CARACTERES MAYUSCULAS
        String chars = "abcdefghijklmnopqrstuvwxyz"; // CARACTERES MINUSCULAS
        String nums = "0123456789"; // CARACTERES DE NUMEROS

        String passSymbols = charsCaps + chars + nums; // VARIABLE QUE CONTIENE TODOS LOS NUMEROS, LETRAS MAYUS Y LETRAS MINUS
        Random rnd = new Random(); // GENERADOR DE NUMERO RANDOM
        
        char[] password = new char[len]; // SE LIMITA EL LARGO DE LA CONTRASEÑA QUE SE GENERARÁ CON 'len'
        for (int i = 0; i < len; i++) 
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length())); // SE OBTIENE UN CARACTER ESPECIFICO (DENTRO DE 'passSymbols') DE FORMA ALEATORIA
            
         /*
          * passSymbols.lengh PERMITE LIMITAR EL NUMERO RANDOM QUE SE GENERA PARA QUE EL CARACTER BUSCADO
          *  SÍ EXISTA DENTRO DEL RANGO DE CARACTERES QUE CONTIENE NUESTRO STRING 'passSymbols'
          */
            
        }
        contraseña = String.copyValueOf(password); // SE TRANSFORMA EL CONTENIDO DE NUESTRO ARREGLO DE CARACTERES EN UN STRING
        return contraseña; //RETORNAMOS EL STRING
        
    }
	/*
	 * ---------------------------------------------------------------------------
	 */

	
	//METODO QUE VERIFICA SEGURIDAD DE LA CONTRASEÑA
	public Boolean esFuerte(String password) {
		boolean respuesta=false;
		int auxInt, contadorInt=0, contadorCharUpp=0, contadorCharLow=0;
		char auxChar;
		String auxString;
		
			auxiliar = new char[password.length()]; // SE GENERA ARREGLO CON EL LARGO DE NUESTRA CONTRASEÑA
			for(int i=0;i<password.length();i++) {
				auxiliar[i] = password.charAt(i); // SE DESCOMPONE LA CONTRASEÑA CARACTÉR POR CARACTÉR
			}
			
			for(int i=0;i<auxiliar.length;i++) { // COMIENZA EL RECORRIDO DE NUESTRA CONTRASEÑA DESCOMPUESTA EN CARACTERES
				
				auxString = Character.toString(auxiliar[i]); //SE TRANSFORMAN TODOS LOS CARACTERES EN UN STRING
				
				try {
					auxInt = Integer.parseInt(auxString); // UTILIZANDO UN TRY CATCH COMO 'CONDICIONAL' SE INTENTA TRANSFORMAR EL CARACTER EN ENTERO
					contadorInt += 1;					 // UNICAMENTE SE TRANSFORMARAN EN ENTERO, LOS CARACTERES QUE SEAN NUMEROS, 
														// EL TRY CATCH EVITA QUE SE PUEDA TRANSFORMAR UNA LETRA EN UN ENTERO
				}
				catch(Exception e){
				}
				
				try {
					auxChar = auxString.charAt(0);
					if(Character.isUpperCase(auxChar)) { // ESTA SENTENCIA 'IF' SE REALIZA DENTRO DEL TRY CATCH
						contadorCharUpp += 1;			// AL ESTAR LA SENTENCIA DENTRO DEL TRY CATCH
													   // DE FORMA 'AUTOMATICA' SOLO SE PODRAN CONTAR CARACTERES SI EL TRY CATCH
													  // RECONOCE QUE LA FUNCION 'isUpperCase' PUEDE FUNCIONAR SIN ERROR YA QUE SE RECONOCE UN CARACTER VALIDO
					}
					else if(Character.isLowerCase(auxChar)) {
						contadorCharLow += 1;
					}
				}
				catch(Exception e) {
				}
			}
			/*
			 *  SE VALIDA LA CONDICION PARA QUE LA CONTRASEÑA SEA TOMADA COMO FUERTE O DEBIL
			 */
			if(contadorCharUpp>=2 & contadorCharLow>=1 & contadorInt>=5) {
				respuesta = true;
			}
			else {
				respuesta = false;
			}	
		return respuesta;
	}
	
	//MUESTRA LA CONTRASEÑA OBTENIDA
		public void Muestra() {
			System.out.println("---------------------- ");
			System.out.println("Your Password:");
			System.out.println(generarPassword(longitud));
			System.out.println(esFuerte(generarPassword(longitud)));
		}
	

}
