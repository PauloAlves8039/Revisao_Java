/*
 * Arquivo: Classe - Arvore
 * Autor: Paulo Alves
 * Descri��o: respons�vel por representar uma arvore bin�ria 
 * Data: 19/01/2020
*/

package br.com.revisao.estruturadados.parte4;

public class Arvore<T> {

	private NoArvore<T> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return this.raiz;
	}

	public void inserir(NoArvore<T> no) {
		no.setNoDireito(null);
		no.setNoEsquerdo(null);
		if (this.raiz == null) {
			this.raiz = no;
		} else {
			this.inserir(this.raiz, no);
		}
	}

	private void inserir(NoArvore<T> ref, NoArvore<T> novoNo) {
		if (ref.peso() < novoNo.peso()) {
			if (ref.getNoDireito() == null) {
				ref.setNoDireito(novoNo);
			} else {
				inserir(ref.getNoDireito(), novoNo);
			}
		} else {
			if (ref.getNoEsquerdo() == null) {
				ref.setNoEsquerdo(novoNo);
			} else {
				inserir(ref.getNoEsquerdo(), novoNo);
			}
		}
	}
	
	public NoArvore<T> buscar(NoArvore<T> noBusca){
		return this.buscar(this.raiz, noBusca);
	}
	
	private NoArvore<T> buscar(NoArvore<T> ref, NoArvore<T> noBusca){
		if(ref.getValor().equals(noBusca.getValor())) {
			return ref;
		}else {
			if(ref.peso() < noBusca.peso()) {
				if(ref.getNoDireito() == null) {
					throw new IllegalArgumentException("Elemento n�o encontrado na �rvore!");
				}else {
					System.out.println("Navegando a direita do n� " + ref.getValor().toString());
					return buscar(ref.getNoDireito(), noBusca);
				}
			}else {
				if(ref.getNoDireito() != null) {
					throw new IllegalArgumentException("Elemento n�o encontrado na �rvore!");
				}else {
					System.out.println("Navegando a esquerda do n� " + ref.getValor().toString());
					return buscar(ref.getNoEsquerdo(), noBusca);
				}
			}
		}
	}

	@Override
	public String toString() {
		return this.raiz == null ? "[(X)]" : raiz.toString();
	}
}
