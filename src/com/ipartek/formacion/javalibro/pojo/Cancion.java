package com.ipartek.formacion.javalibro.pojo;

public class Cancion {
	private String titulo;
	private String artista;
	private String Duracion;
	
	public Cancion(String titulo, String artista, String duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		Duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	
	//otros metodos

}
