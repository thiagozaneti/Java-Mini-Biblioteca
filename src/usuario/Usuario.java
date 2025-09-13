package usuario;

import java.util.List;

import biblioteca.Biblioteca;
import livro.Livro;

public class Usuario extends Individuo {
	Biblioteca lib = new Biblioteca();
	private float multa;
	private  List<Livro> livrosEmprestados;
	
	public Usuario(int id, String nome, String email, TipoDeUsuario tipo) {
		super(id, nome, email, tipo);
	}
	
	public TipoDeUsuario getTipo() {
        return tipo;
    }
	
	public void emprestarLivro(Livro livro) {
		//verificando se é aluno ou professor
		
		if (getTipo() == TipoDeUsuario.ALUNO) {
			//verificando se possui mais de três livros já emprestados
			
			if (livrosEmprestados.size()>=3) {
				System.out.println("Aluno não pode reservar outro livro, limite atingido");
				return;
			}else{
				for (Livro buscaDeLivroNaBiblioteca : lib.biblioteca) {
					//encontrou o livro dentro da biblioteca
					if ((buscaDeLivroNaBiblioteca == livro)&& (buscaDeLivroNaBiblioteca.quantidadeDeExemplares > 0)) {
						//remove o livro de dentro da biblioteca
						buscaDeLivroNaBiblioteca.quantidadeDeExemplares--;
						//adiciona o livro na lista de livros emprestados do Aluno
						livrosEmprestados.add(livro);
					}else {
						System.out.println("Não possui esse livro disponível");
					}
				}
			}
		}
		else if(getTipo() == TipoDeUsuario.PROFESSOR) {
			if (livrosEmprestados.size()>=5) {
				System.out.println("Professor não pode reservar outro livro, limite atingido");
				return;
			}else{
				for (Livro buscaDeLivroNaBiblioteca : lib.biblioteca) {
					//encontrou o livro dentro da biblioteca
					if ((buscaDeLivroNaBiblioteca == livro)&& (buscaDeLivroNaBiblioteca.quantidadeDeExemplares > 0)) {
						//remove o livro de dentro da biblioteca
						buscaDeLivroNaBiblioteca.quantidadeDeExemplares--;
						//adiciona o livro na lista de livros emprestados do Aluno
						livrosEmprestados.add(livro);
					}else {
						System.out.println("Não possui esse livro disponível");
					}
				}
			}
		}
	}
	
	
	public void devolverLivro(Livro livro) {
		livrosEmprestados.remove(livro);
		for (Livro buscaDeLivro : lib.biblioteca) {
			buscaDeLivro.quantidadeDeExemplares++;
		}
		System.out.println("Livro"+livro.titulo+"devolvido com sucesso");
		
	}
	
}
