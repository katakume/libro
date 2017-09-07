/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {
	
	public static void main(String[] args) {
		
		float compra= 1326.24f, pago = 2000, vueltas;
		float [] dinero = {50,20,10,5,2,1,0.5f,0.20f,0.10f,0.05f,0.02f,0.01f};
		int [] vueltasFinales = new int[dinero.length];
		vueltas = pago - compra;
		for (int i = 0; i < dinero.length;i++) {
			if (vueltas >= dinero[i]) {
				vueltasFinales[i]=(int)( vueltas/dinero[i]);
				vueltas = vueltas - (dinero[i] * vueltasFinales[i]);
			}
		}
		
		System.out.println("Devolvemos " + vueltasFinales[0] + " billetes de 50");
		System.out.println("Devolvemos " + vueltasFinales[1] + " billetes de 20");
		System.out.println("Devolvemos " + vueltasFinales[2] + " billetes de 10");
		System.out.println("Devolvemos " + vueltasFinales[3] + " billetes de 5");
		System.out.println("Devolvemos " + vueltasFinales[4] + " monedas de 2");
		System.out.println("Devolvemos " + vueltasFinales[5] + " monedas de 1");
		System.out.println("Devolvemos " + vueltasFinales[6] + " monedas de 0.50");
		System.out.println("Devolvemos " + vueltasFinales[7] + " monedas de 0.20");
		System.out.println("Devolvemos " + vueltasFinales[8] + " monedas de 0.10");
		System.out.println("Devolvemos " + vueltasFinales[9] + " monedas de 0.05");
		System.out.println("Devolvemos " + vueltasFinales[10] + " monedas de 0.02");
		System.out.println("Devolvemos " + vueltasFinales[11] + " monedas de 0.01");
	}
	 
}
