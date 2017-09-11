package com.ipartek.formacion.javalibro.ejercicios;

public class VariablesReferenciayValor {
/**
 * las variables primitivas se pasan por valor
 * las variables de clase se pasan por referencia
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primitiva = 1;
		int primitiva2 =sumar(primitiva);
		System.out.println("primitiva " + primitiva);
		System.out.println("primitiva2 " + primitiva2);
		
		//TODO probarlo bien para que cambien el valor de las 2 variables
		String referencia = "1";
		String referencia2 = sumar(referencia);
		System.out.println("referencia " + referencia);
		System.out.println("referencia2 " + referencia2);
	}
	static int sumar(int i) {
		return ++i;
	}
	static String sumar(String s) {
		s ="2";
		return s;
	}
	
}
