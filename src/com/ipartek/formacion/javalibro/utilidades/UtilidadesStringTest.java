package com.ipartek.formacion.javalibro.utilidades;
import junit.framework.TestCase;

public class UtilidadesStringTest extends TestCase {

	public void testBuscarPalabra() {
		
		assertEquals(0,UtilidadesString.buscarPalabra(null, null));
		assertEquals(0,UtilidadesString.buscarPalabra(null, "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca descansodescanso", null));
		
		assertEquals(1,UtilidadesString.buscarPalabra("Ahora toca descanso", "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca desc.anso", "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca desc9anso", "descanso"));
		assertEquals(1,UtilidadesString.buscarPalabra("Ahora toca descanso.", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso descanso", "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca descansodescanso", "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca descanso9descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso-descanso", "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca descanso9descanso", "descanso"));
		assertEquals(0,UtilidadesString.buscarPalabra("Ahora toca desc-ansodescanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso!descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso@descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso/descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso+descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso)descanso", "descanso"));
		assertEquals(2,UtilidadesString.buscarPalabra("Ahora toca descanso&descanso", "descanso"));
		
		assertEquals(1,UtilidadesString.buscarPalabra("987 45 63 21", "63"));
		assertEquals(2,UtilidadesString.buscarPalabra("987 45 63 21 63", "63"));
		assertEquals(0,UtilidadesString.buscarPalabra("987 45 6363 21", "63"));
		assertEquals(2,UtilidadesString.buscarPalabra("987 45 63-63 21", "63"));
		assertEquals(0,UtilidadesString.buscarPalabra("987 45 6-3 21", "63"));
	}

}
