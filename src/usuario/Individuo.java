package usuario;

public abstract class Individuo {
	private int id;
	private String nome;
	private String email;
	protected TipoDeUsuario tipo;
	
	
	public Individuo(int id, String nome, String email, TipoDeUsuario tipo) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
	}
}
