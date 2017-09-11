package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesString {

	/**
	 * Cuenta las plabras que estén contenidas en el texto, separadas por cualquier
	 * serparador no alfanumerico
	 * @param texto String en el que buscar la palabra
	 * @param palabra String a contar
	 * @return Int numero de veces que está la palabra
	 */
	static int buscarPalabra(String texto, String palabra) {
		//TODO implementar despues del texto
		if (texto == null) {
			return 0;
		}else {
			String [] separado = texto.toLowerCase().split("\\W");
			int cuenta = 0;
			for (int i = 0; i < separado.length; i++) {
				if (separado[i].equals(palabra)) {
					++cuenta;
				}
			}
			return cuenta;
		}
	}

}
