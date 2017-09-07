
public class Participante {
	
	//Atributos
	
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	
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
	}

	public Participante(String nombre, String usuarioGit) {
		super();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		this.email = "";
		this.trabajador = false;
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
	
	
	
	
	//otros Metodos
	public String generarLinkGitHub() {
		String link = "https://github.com/"+ this.usuarioGit;
		return link;
	}

}
