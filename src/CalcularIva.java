import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;;

public class CalcularIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String seguir;
		float importe = 0;
		boolean importeCorrecto;
		do {
			System.out.println("Por favor, dame el importe en € para que te calcule el importe dle IVA:");
			
			importeCorrecto = false;
			do {
				try {
					sc = new Scanner(System.in);
					importe = sc.nextFloat();
					importeCorrecto= true;
					/*sc = null;
					sc.equals("hola");*/
					//importe = 9/0;
				}catch (NullPointerException e) {
					System.out.println("¿Como has metido un null?");
				}catch (InputMismatchException e) {
					System.out.println("Valor incorrecto. Introduzca un valor  numerico con los decimales delimitados por . en caso de tenderlos, como por ejemplo 123.45");
				}catch (Exception e) {
					System.out.println("Fallo no controlado.");
				}
			}while (importeCorrecto == false);
			
			System.out.println("Su IVA es de " + importe*0.21);
			System.out.println("¿Quiere meter otro numero?");
			seguir = sc2.nextLine();
			System.out.println(seguir.toLowerCase());
		}while (seguir.toLowerCase().equals("no") == false);
		System.out.println("Agur");
	
	}

}
