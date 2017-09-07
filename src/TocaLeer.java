
public class TocaLeer {
	static String [] alumnos = { "Arkaitz",
            "Erlantz1",
            "Fran",
            "Cristian",
            "Erlantz2",
            "Leire" ,
            "Mikel",
            "Josu",
            "Alberto",
            "Jon",
            "Arantza",
            "Naiara",
            "Lander",
            "Yeray",
            "German"
          };

	static String [] Usugit = { "arkaitzgl",
            "erliglesias",
            "FranPerez92",
            "CristianVar",
            "Erlantzcabrejas",
            "LeireBustin" ,
            "zoroa84",
            "Katakume",
            "amsoria91",
            "alarconsolis",
            "",
            "naiaramateos",
            "LanderAB",
            "LordBlacKhiin",
            ""
          };


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Participante [] listaParticipantes = new Participante[alumnos.length];
		for (int i = 0; i < alumnos.length; i++) {
			listaParticipantes[i] = new Participante(alumnos[i], Usugit[i]);
		}
		int numAleatorio= GenerarNumeroAleatorio (alumnos.length);
		System.out.println("El/la afortunad@ es:" + listaParticipantes[numAleatorio].getNombre());
		
		

	}

	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int GenerarNumeroAleatorio (int max){
		// TODO falta implementar logica
		int resultado = 1;
		resultado = (int)(Math.random()*max);
		//resultado = (int)(Math.random()*max);
		
		return resultado;
	}
	
}
