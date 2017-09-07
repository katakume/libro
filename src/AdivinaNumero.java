import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("------Adivina el Numero------");
		System.out.println("-----------------------------");
		System.out.println("-------Son del 1 al 10-------");
		System.out.println("-----------------------------");
		System.out.println("--Tienes 3 intentos, suerte--");
		System.out.println("-----------------------------");
		
		int numeroAdivinar = (int)(Math.random()*9)+1;
		int intentos = 3;
		int numero = 0;
		String seguir = "Si";
		Scanner sc = new Scanner(System.in);
		do {
			intentos = 3;			
			do {
				try {
					System.out.println("Mete un numero entero entre 1-10.");
					sc = new Scanner(System.in);
					numero = sc.nextInt();
					if (numero == numeroAdivinar) {
						System.out.println("Respuesta correcta, te han sobrado " + (intentos - 1)  + " vidas.");
						break;
					}else {
						--intentos;
						System.out.println("Respuesta incorrecta, te quedan " + intentos + " vidas.");
					}
				}catch (NullPointerException e) {
					--intentos;
					System.out.println("¿Como has metido un null? Una vida menos por liante, te quedan " + intentos);
				}catch (InputMismatchException e) {
					--intentos;
					System.out.println("Mete un numero entero entre 1-10. Una vida menos por tonto, te quedan " + intentos);					
				}catch (Exception e) {
					System.out.println("Fallo no controlado.");
				}		
				
			}while (intentos >0);		
			if (intentos == 0) {
				System.out.println("Tus poderes de adivinación son debiles, la respuesta era " + numeroAdivinar + ". ¿Quieres volver a intetarlo? Si/No");
			}else {
				System.out.println("Buen trabajo joven adivino. ¿Quieres seguir entrenando tus poderes? Si/No");
			}
			sc = new Scanner(System.in);
			seguir = sc.next();
		}while("no".equals(seguir.toLowerCase()) == false);
		System.out.println("Adios");
	}
}
