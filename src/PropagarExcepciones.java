
public class PropagarExcepciones {
	
	public static void main(String[] args) throws Exception {
		comoMarron();
	}
	
	private static void lanzoExcepcion() throws Exception{
		System.out.println("lanzoExcepcion Entro");
		throw new Exception();		
		//System.out.println("lanzoExcepcion Salgo");
	}
	
	private static void pasoMarron() throws Exception{
		System.out.println("pasoMarron Entro");
		lanzoExcepcion();
		System.out.println("pasoMarron Salgo");
			
	}
	private static void comoMarron() throws Exception{
		System.out.println("comoMarron Entro");
		pasoMarron();
		/*try {
			pasoMarron();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ya me encargo yo de gestionar la Excepcion");
		}*/
		System.out.println("comoMarron Salgo");
		
	}

}
