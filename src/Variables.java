import java.text.NumberFormat;

//ejercicio para probar las variables de Java
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio con variables");
		
		
		System.out.println("1.Enteros");
		System.out.println("2. Reales");
		System.out.println("3. Boleanas");
		System.out.println("4. Char");
		
		System.out.println("Enteros");
		
		//TODO terminar de poner el resto
		System.out.println("Int "+ Integer.BYTES +" bytes entero de " + Integer.MIN_VALUE +" a " + Integer.MAX_VALUE );
		System.out.println("Byte "+ Byte.BYTES +" bytes entero de " + Byte.MIN_VALUE +" a " + Byte.MAX_VALUE );
		System.out.println("Short "+ Short.BYTES +" bytes entero de " + Short.MIN_VALUE +" a " + Short.MAX_VALUE );
		System.out.println("Long "+ Long.BYTES +" bytes entero de " + Long.MIN_VALUE +" a " + Long.MAX_VALUE );
		
		System.out.println("Enteros:");
		float sueldoMesGerman = 1200.25f;
		float sueldoMesLander = (float)2400.50;
		
		System.out.println("Float "+ Float.BYTES +" bytes entero de " + Float.MIN_VALUE +" a " + Float.MAX_VALUE );
		System.out.println("Double "+ Double.BYTES +" bytes entero de " + Double.MIN_VALUE +" a " + Double.MAX_VALUE );
		
		System.out.println("German cobra "+ NumberFormat.getInstance().format(sueldoMesGerman));
		
		//char caracter = 'c';
		char [] caracteres = {'a', 'F', '3', 'j'};
		boolean [] resultados = {false, false, false, false};
		System.out.println("\t dig \t letra \t MAYUS \t minus \n");
		
		for (int i = 0; i< caracteres.length; i++) {
			System.out.print(caracteres[i] + "\t");
			resultados[0] = Character.isDigit(caracteres[i]);
			resultados[1] = Character.isAlphabetic(caracteres[i]);
			resultados[2] = Character.isUpperCase(caracteres[i]);
			resultados[3] = Character.isLowerCase(caracteres[i]);
			for (int j = 0; j< caracteres.length; j++) {
				if (resultados[j] == true){
					System.out.print("\u2713\t");
				}else {
					System.out.print("\u2716\t");
				}				
			}
			System.out.println();
		}
		
		//TODO 
	}

}
