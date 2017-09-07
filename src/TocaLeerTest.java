import junit.framework.TestCase;


public class TocaLeerTest extends TestCase {

	public void testGenerarNumeroAleatorio() {
		int numaleatorio = 0;
		boolean [] aChek = new boolean[TocaLeer.alumnos.length];
		for(int i = 0; i< 1000; i++){
			numaleatorio = TocaLeer.GenerarNumeroAleatorio(TocaLeer.alumnos.length);
			aChek[numaleatorio] = true;
		}
		for (int i = 0; i< aChek.length; i++){
			assertTrue(aChek[i]);
		}
	}

}
