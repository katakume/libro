package com.ipartek.formacion.javalibro.pojo;
import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
	public void testConstructor() {
		
		Participante p1 = new Participante ("Ander", "anderuraga");
		Participante p2 = new Participante ();
		p1.setEmail ("auraga@ipartek.com");
		
		assertEquals("Ander",p1.getNombre());
		assertEquals("anderuraga",p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com",p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/anderuraga",p1.generarLinkGitHub());
		
		assertEquals("",p2.getNombre());
		assertEquals("",p2.getUsuarioGit());
		assertEquals("",p2.getEmail());
		assertFalse(p2.isTrabajador());
		assertEquals("https://github.com/",p2.generarLinkGitHub());
		
		try {
			Participante matusalem = new Participante("Matu", 235);			
			fail("Deberia haber salido error");
		} catch (Exception e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_100, e.getMessage());
		}
	}
	
	public void testExceptionEdad() {
		Participante p1 = new Participante("ander", "Anderuraga");
		
		try {
			p1.setEdad(88);
		} catch (ParticipanteException e) {
			fail("No debería lanzar excepcion");
			
		}
		try {
			p1.setEdad(-3);
			fail("Deberia haber salido error");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MENOR_0, e.getMessage());
		}
		
		try {
			p1.setEdad(200);
			fail("Deberia haber salido error");
		} catch (ParticipanteException e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_100, e.getMessage());
		}
		
		
	}

}
