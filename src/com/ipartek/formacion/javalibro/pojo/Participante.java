package com.ipartek.formacion.javalibro.pojo;
import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

public class Participante {
	
	//Atributos
	
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	private int edad;
	
	//Constructores
	
	public boolean isTrabajador() {
		return trabajador;
	}

	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}
	
	public Participante() {
		super();
		this.nombre = "";
		this.usuarioGit = "";
		this.email = "";
		this.trabajador = false;
		this.edad = 0;
	}
	
	public Participante(String nombre, String usuarioGit) {
		this();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		
	}
	
	public Participante(String nombre, int edad) throws ParticipanteException {
		this();
		this.nombre = nombre;
		setEdad(edad);
	}

	public String toString() {
		return "Participante [nombre=" + nombre + ", usuarioGit=" + usuarioGit + ", email=" + email + ", trabajador="
				+ trabajador + "]";
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuarioGit() {
		return usuarioGit;
	}

	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getEdad() {
		return edad;
	}

	

	public void setEdad(int edad) throws ParticipanteException {
		
		if (edad < 0) {
			throw new ParticipanteException(ParticipanteException.EXCEPTION_MENOR_0);
		}else if (edad>100) {
			throw new ParticipanteException(ParticipanteException.EXCEPTION_MAYOR_100);
		}
			
		this.edad = edad;
	}
	
	
	
	
	//otros Metodos
	public String generarLinkGitHub() {
		String link = "https://github.com/"+ this.usuarioGit;
		return link;
	}

}
