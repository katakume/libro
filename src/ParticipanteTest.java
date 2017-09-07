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
	}

}
