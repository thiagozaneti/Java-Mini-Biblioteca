package usuario;

public abstract class Usuario {
	public int id;
	public String nome;
	public String email;
	public TipoDeUsuario tipo;
	
	
	public Usuario(int id, String nome, String email, TipoDeUsuario tipo) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
	}
}
