
public class TablaAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tabla de Ascii");
		char cAscii =0;
		for (int i = 0; i <= 255; i++) {
			System.out.println(i + "\t\t"+ cAscii);	
			++cAscii;
		}
	}

}
