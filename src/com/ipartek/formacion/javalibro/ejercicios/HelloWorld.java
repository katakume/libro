package com.ipartek.formacion.javalibro.ejercicios;
import java.nio.charset.Charset;

public class HelloWorld {

	final int DIAS_SEMANAS = 7;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String [] alumnos = {"1","2","3","4","5","6"};
		System.out.println("----------Listado Alumnos--------");
		for (int i = 0; i<alumnos.length; i++){
			System.out.println(alumnos[i]);
		}
		System.out.println("\u2713");
	}
	

}
