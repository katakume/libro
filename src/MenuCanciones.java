import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class MenuCanciones {
	
	
	public static void main(String[] args) {
		boolean salir = true;
		ArrayList<Cancion> listacanciones = new ArrayList <Cancion>();
		listacanciones = iniciarArrayList(listacanciones);
		listarcanciones(listacanciones);
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				imprimirMenu();
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					listarcanciones(listacanciones);
					break;
				case 2:
					listacanciones = eliminarcanciones(listacanciones);
					listarcanciones(listacanciones);
					break;
				case 3:
					listacanciones = anadircanciones(listacanciones);
					listarcanciones(listacanciones);
					break;
				case 4:
					mostrardetalles(listacanciones);
					break;
				case 5:
					salir = false;
					break;
				default:
					System.out.println("Opción no valida");
					break;
				}
			}catch (NullPointerException e) {
				System.out.println("¿Como has metido un null?");
			}catch (InputMismatchException e) {
				System.out.println("Mete un numero entero entre 1-3");					
			}catch (Exception e) {
				System.out.println("Fallo no controlado.");
			}
			
		}while(salir);
		System.out.println("----------------------------");
		System.out.println("-----------Adios------------");
		System.out.println("----------------------------");
	}
	public static ArrayList<Cancion> iniciarArrayList(ArrayList<Cancion> listacanciones) {		
		listacanciones.add(new Cancion("Bombayah","Blakpink","4:02"));
		listacanciones.add(new Cancion("Corazon de mimbre", "Marea", "4:30"));
		listacanciones.add(new Cancion("YMCA", "Villague People", "3:52"));
		listacanciones.add(new Cancion("Barbie Girl", "Aqua", "3:22"));
		listacanciones.add(new Cancion("I will survive", "Gloria Gaynor", "4:32"));
		listacanciones.add(new Cancion("Perro Verde", "Marea", "4:02"));
		listacanciones.add(new Cancion("One", "Jhony Cash", "3:02"));
		listacanciones.add(new Cancion("Rock Star", "NikelBlack", "4:42"));
		listacanciones.add(new Cancion("Song 2", "Blur", "2:59"));
		listacanciones.add(new Cancion("Hitz margotuak", "Su ta gar", "4:52"));
		return listacanciones;
	}
	
	public static void imprimirMenu() {
		System.out.println("");
		System.out.println("Elija su opción:");
		System.out.println("1-Listar");
		System.out.println("2-Eliminar");
		System.out.println("3-Añadir");
		System.out.println("4-Detalles");
		System.out.println("5-Salir");
	}
	
	public static void listarcanciones(ArrayList<Cancion> listacanciones) {
		System.out.println("----------------------------");
		System.out.println("----Listado de canciones----");
		System.out.println("----------------------------");
		for (int i = 0; i < listacanciones.size(); i++) {
			System.out.println(i + " - " + listacanciones.get(i).getTitulo());
		}
	}
	
	public static ArrayList<Cancion> eliminarcanciones(ArrayList<Cancion> listacanciones) {
		int eliminar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numero de la canción que quiera eliminar:");
		try {			
			eliminar = sc.nextInt();
			listacanciones.remove(eliminar);
		} catch (Exception e) {
			if (listacanciones.size() == 0) {
				System.out.println("No hay canciones. Introduzca mas canciones antes de intentar borra.");
			}else {
				System.out.println("Error de valor, vuelva a elegir borrar y escriba un valor de 0 a " + listacanciones.size());
			}
		}
		return listacanciones;
	}
	
	public static ArrayList<Cancion> anadircanciones(ArrayList<Cancion> listacanciones) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el nombre de la canción:");
		String nombre = sc.next();
		System.out.println("Escriba el artista de la canción:");
		String artista = sc.next();
		System.out.println("Escriba la duración de la canción:");
		String duracion = sc.next();
		listacanciones.add(new Cancion(nombre,artista,duracion));
		return listacanciones;
	}
	public static void mostrardetalles(ArrayList<Cancion> listacanciones) {
		int mostrar = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numero de la canción que quiera mostrar:");
		try {			
			mostrar = sc.nextInt();
			listacanciones.remove(mostrar);
			System.out.println(listacanciones.get(mostrar).getTitulo() + " - " + listacanciones.get(mostrar).getArtista() + " - " + listacanciones.get(mostrar).getDuracion());
		} catch (Exception e) {
			System.out.println("Error de valor, vuelva a elegir borrar y escriba un valor de 0 a " + listacanciones.size());
		}
		
	}

}
