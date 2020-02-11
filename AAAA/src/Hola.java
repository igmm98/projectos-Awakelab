import java.util.Scanner;
import java.util.Random;
public class Hola {

	public static void main(String[] args) {
		
		 mainMenu();//LLAMAR A FUNCION CON EL MENU PRINCIPAL
	        
    }
    
    //FUNCION QUE CONTIENE MENU PRINCIPAL PARA COMENZAR A JUGAR
    public static void mainMenu(){
        Scanner lector = new Scanner(System.in);
        int n;//VARIABLE DONDE SE GUARDARA LO QUE EL USUARIO INGRESE
        
        //MOSTRAR POR PANTALLA
        System.out.println("--  Juego de piedra, papel o tijeras  --");
        System.out.println("(ingresar numero de la opcion)");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("0. - SALIR -");
        System.out.println(" --  --  --  --  --  --  --  --  --   --  ");
        
         n = lector.nextInt();//ESTA SECCION CORRESPONDE AL 'LEER n' EN PSEUDOCODIGO
         
         //ESTRICTURA CONDICIONAL 'SI' / IF
         if(n==0){
             System.exit(n);//EJECUCION DEL CODIGO TERMINA CON ESTA LINEA DE CODIGO
         }
         System.out.println(" --  --  --  --  --  --  --  --  --   --  ");
         
         //ESTA SECCION VERIFICA SI EL DATO INGRESADO EN 'n' ESTÁ ENTRE LOS VALORES DE 1 Y 3
        while(n<1 || n>3){
            System.out.println("¡Ingrese numero valido!");
            System.out.println(" --  --  --  --  --  --  --  --  --   --  ");
            n = lector.nextInt();//DENTRO DE CADA ITERACION SE LEE NUEVAMENTE 'n' PARA VER SI VUELVE A ENTRAR AL BUCLE O NO
            if(n==0){
             System.exit(n);//EJECUCION DEL CODIGO TERMINA CON ESTA LINEA DE CODIGO
         }
        }
        
        //SE LLAMA A LA FUNCION DEL JUEGO Y SE ENVÍA EL VALOR QUE INGRESÓ EL JUGADOR SEGUN SU ELECCION DEL MENU
        rollGame(n);
    }
    
    //FUNCION PROPIA DEL JUEGO
    public static void rollGame(int n){
        //AL INICIAR ESTA FUNCION 'n' RECIBE EL DATO INGRESADO POR EL USUARIO
        //NUMERO AL AZAR QUE CORRESPONDE A LA ELECCION DE LA CUMPUTADORA PARA COMPETIR CONTRA EL JUGADOR
        Random rolledNum = new Random();//GENERADOR DE NUMEROS AL AZAR
        int num = rolledNum.nextInt(3);//SE COMPRUEBA QUE EL NUMERO SOLO SEA ENTRE 0 Y 2
        /*
                     0 = Piedra
                     1 = Papel
                     2 = Tijeras
         */
        // 'switch' CORRESPONDE AL 'segun' EN PSEUDOCODIGO
        //SEGUN LA ELECCION DEL JUGADOR SE COMPARA CON LA QUE SALIO AL AZAR Y SE INDICA EL RESULTADO DEL JUEGO
        switch (n) {
            
            case 1://USUARIO ELIGIO PIEDRA
                //SWITCH DENTRO DEL SWITCH
                System.out.println("Usuario: Piedra");
                switch(num){
                    case 0: System.out.println("bot: Piedra \n ¡Empate! \n");
                        break;
                    case 1:System.out.println("bot: Papel \n ¡Perdiste! \n");
                        break;
                    case 2:System.out.println("bot: Tijeras \n ¡Ganaste! \n");
                        break;
                    default:
                        break;
                }
                break;
            case 2://USUARIO ELIGIO PAPEL
                //SWITCH DENTRO DEL SWITCH
                System.out.println("Usuario: Papel");
                switch(num){
                    case 0:System.out.println("bot: Piedra \n ¡Ganaste! \n");
                        break;
                    case 1:System.out.println("bot: Papel \n ¡Empate! \n");
                        break;
                    case 2:System.out.println("bot: Tijeras \n ¡Perdiste! \n");
                        break;
                    default:
                        break;
                }
                break;
            case 3://USUARIO ELIGIO TIJERAS
                //SWITCH DENTRO DEL SWITCH
                System.out.println("Usuario: Tijeras");
                switch(num){
                    case 0: System.out.println("bot: Piedra \n ¡Perdiste! \n");
                        break;
                    case 1: System.out.println("bot: Papel \n ¡Ganaste! \n");
                        break;
                    case 2:System.out.println("bot: Tijeras \n ¡Empate! \n");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        
        //SE VUELVE AL MENÚ INCIAL
        mainMenu();
        

	}

}
