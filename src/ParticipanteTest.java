import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
	public void testConstructor() {
		
		Participante p1 = new Participante ("Ander", "anderuraga");
		p1.setEmail ("auraga@ipartek.com");
		
		assertEquals("Ander",p1.getNombre());
		assertEquals("anderuraga",p1.getusuarioGit());
		assertEquals("auraga@ipartek.com",p1.getEmail());
	}

}
