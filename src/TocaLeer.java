
public class TocaLeer {
	static String [] alumnos = {"1","2","3","4","5","6"};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAleatorio= GenerarNumeroAleatorio (alumnos.length);
		int largura = alumnos.length;
		boolean estado[]; 
		String alumno = "Ander";
		
		System.out.println("El/la afortunad@ es:" + numAleatorio);
		
		

	}

	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int GenerarNumeroAleatorio (int max){
		// TODO falta implementar logica
		int resultado = 1;
		resultado = (int)(Math.random()*max);
		//resultado = (int)(Math.random()*max);
		
		return resultado;
	}
	
}
