package biblioteca;

import java.util.ArrayList;
import java.util.List;

import livro.Livro;

public class Biblioteca{
	 private List<Livro> biblioteca = new ArrayList<>();
    
    
    public boolean cadastrarLivro(Livro livro) {
    	if (livro == null ) {
			return false;
		}else {
			return biblioteca.add(livro);
		}
    }
    
    public void getLivros(){
    	for (Livro livro : biblioteca) {
			System.out.println(livro.id+"|"+livro.titulo+"|"+livro.autor);
		}
    }
    
    public void removerLivro(Livro livroParaRemover) {
    	for (Livro livro : biblioteca) {
			if (livro == livroParaRemover) {
				biblioteca.remove(livro);
			}else {
				System.out.println("Livro não encontrado");
			}
		}
    }
}
