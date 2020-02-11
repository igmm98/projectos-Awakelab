import java.sql.*;

public class Manipulador {
	
	private static Connection c = null;

	public static void main(String[] args) throws SQLException {
		
		
		
		Conectar();
		
		IngresoDeDatos();
		
	}
	
	public static void Conectar() {
		try 
		{
			Class.forName("org.sqlite.JDBC");
			c=DriverManager.getConnection("jdbc:sqlite:bdone.db");
			System.out.println("Donee!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void IngresoDeDatos() throws SQLException {
		
		/*if(c == null) {
			c.
		}*/
			try 
			{
				PreparedStatement prep = c.prepareStatement("INSERT INTO registro VALUES ('19000001', 'Ignacio', 'Millanao M')");
				prep.execute();
				
				System.out.println("Executed");
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		
		
	}
	
}
