
public class Participante {
	
	//Atributos
	
	private String nombre;
	private String usuarioGit;
	private String email;
	
	//Constructores
	
	public Participante(String nombre, String usuarioGit) {
		super();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		this.email = "";
	}
	
	//Getters y Setters
	
	String getNombre() {
		return this.nombre;
	}
	
	void setNombre(String pNombre) {
		this.nombre = pNombre;
	}
	
	String getusuarioGit() {
		return this.usuarioGit;
	}
	
	void setusuarioGit(String pusuarioGit) {
		this.usuarioGit = pusuarioGit;
	}
	
	String getEmail() {
		return this.email;
	}
	
	void setEmail(String pEmail) {
		this.email = pEmail;
	}
	
	//otros Metodos

}
