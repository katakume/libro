
public class JugandoConString {
	public static void main(String[] args) {
		
		String manolo = "Manolo Kabezabolo";
		
		//convertir a minusculas
		String minus = manolo.toLowerCase();
		System.out.println(minus);
		
		//Convertir a MAYUSCULAS
		String mayus = manolo.toUpperCase();
		System.out.println(mayus);
		
		//mostrar numero de caracteres
		int cont = manolo.length();
		System.out.println(cont);
		//mostrar posición de la letra K
		
		int pos = manolo.indexOf('K');
		System.out.println(pos);
		
		//separar en 2 variables el nombre y el apellido
		
		int pos2 = manolo.indexOf(' ');
		String nombre = manolo.substring(0, pos2);
		String apellido = manolo.substring(pos2+1);
		System.out.println(nombre);
		System.out.println(apellido);
		
		/* comparando */
		
		String c1 = "casa";
		String c2 = "caSa";
		
		//comparar con ecuals y equalIgnoreCase
		
		boolean comp1 = c1.equals(c2);
		boolean comp2 = c1.equalsIgnoreCase(c2);
		System.out.println(comp1);
		System.out.println(comp2);
		
		/* Limpiando entradas de datos */
		
		String c3 = "Perro";
		String c4 = "            Perro       ";
		
		//las dos variables deben ser igualesf
		
		System.out.println(c3);
		System.out.println(c4.trim());
		
		/**/
		
		String lore = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam blandit non leo sed euismod. Integer maximus magna libero, vel egestas tortor tristique ac. Suspendisse convallis ligula sed tortor rutrum, eget blandit leo tincidunt. Nullam arcu tortor, pharetra eget ultricies nec, auctor id nunc. Integer facilisis vulputate quam, a viverra nisl faucibus id. Nulla consectetur egestas tempus. Pellentesque porttitor purus ac mauris elementum luctus. Nam faucibus ipsum vel tellus aliquet sodales. Donec rutrum congue suscipit. Vestibulum quis feugiat nisi. Morbi non euismod nunc. In ullamcorper mauris id sem auctor, sit amet sollicitudin arcu iaculis. Donec feugiat eleifend hendrerit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque at scelerisque quam. Proin sed magna risus.";
		
		//Mostrar longitud
		int cont2 = lore.length();
		System.out.println(cont2);
		
		//contar palabras
		int cont3 = lore.split(" ").length;
		System.out.println(cont3);
		
		//contar las vocales
		char [] vocales = {'a','e','i','o','u'};
		int [] cuentaVocales = new int [vocales.length];
		int cuenta = 0;
		String lLower = lore.toLowerCase();
		char cActual;
		for (int i = 0; i < lLower.length(); i++) {
			cActual = lLower.charAt(i);
			for (int j = 0; j < vocales.length; j++) {
				if (vocales[j] == cActual) {
					++cuentaVocales[j];
					++cuenta;
					break;
				}
			}
		}
		System.out.println("Las vocales aparecen " + cuenta +" veces, de las cuales:");
		for (int i = 0; i < vocales.length; i++) {
			System.out.println("La vocal " + vocales[i] + " sale " + cuentaVocales[i] + " veces.");
		}
		//contar las venes que aparece 'at'
		cuenta = 0;
		String buscar = "at";
		String texto = lLower;
		while (texto.indexOf(buscar) != -1) {
			++cuenta;
			texto = texto.substring(texto.indexOf(buscar)+1);
		}
		System.out.println("La sección \"" + buscar + "\" sale " + cuenta + " veces.");
		
		//sustituir a por 4
		buscar = "a";
		texto = lLower;
		while (texto.indexOf(buscar) != -1) {
			texto = texto.substring(0,texto.indexOf(buscar))+ "4" + texto.substring(texto.indexOf(buscar)+1);
		}
		System.out.println(texto);
		
	}
}
