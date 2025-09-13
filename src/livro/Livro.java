package livro;

public abstract class Livro {
	public int id;
	public String titulo;
	public String autor;
	public String descricao;
	public int ano;
	public String genero;
	public int quantidadeDeExemplares;
	
	public Livro(int id, String titulo, String autor, String descricao, int ano, String genero, int quantidadeDeExemplares) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.descricao = descricao;
		this.ano = ano;
		this.genero = genero;
		this.quantidadeDeExemplares = quantidadeDeExemplares;
	}
	
}
