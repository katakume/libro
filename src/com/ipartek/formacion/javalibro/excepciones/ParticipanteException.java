package com.ipartek.formacion.javalibro.excepciones;
/**
 * Exception personalizada para el POJO de Participante
 * @see https://es.wikipedia.org/wiki/Plain_Old_Java_Object
 * @author Administrador
 *
 */
public class ParticipanteException extends Exception {

	public ParticipanteException(String mensajeException) {
		super(mensajeException);
	}
	private static final long serialVersionUID = -8821611785143582692L;
	
	//Siempre que queramos usar un metodo o un objeto sin instanciar un objeto tiene que ser static
	public final static String EXCEPTION_MENOR_0 = "La edad no puede ser menor de 0";
	public final static String EXCEPTION_MAYOR_100 = "Eres demasiado viejo, carcamal";

}
