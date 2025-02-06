package estrutura.linear.lista;

import estrutura.linear.Processo;

public class ListaDuplamente {

	public static void main(String[] args) {
		ListaLigada listaDuplamenteLigada = new ListaLigada();
		
		listaDuplamenteLigada.inserir(new Processo("Processo-1"));
		listaDuplamenteLigada.inserir(new Processo("Processo-2"));
		listaDuplamenteLigada.inserir(new Processo("Processo-3"));
	}

}	
	
	class No {
		
		Processo processo;
		No anterior;
		No proximo;
		
		public No(Processo processo, No anterior, No proximo) {
			this.processo = processo;
			this.anterior = anterior;
			this.processo = processo;
		}
		
		public Processo getProcesso() {
			return processo;
		}
		
		public void setProcesso(Processo processo) {
			this.processo = processo;
		}
		
		public No getAnterior() {
			return anterior;
		}
		
		public void setAnterior(No anterior) {
			this.anterior = anterior;
		}
		
		public No getProximo() {
			return proximo;
		}
		
		public void setProximo(No proximo) {
			this.proximo = proximo;
		}
	}

	class ListaLigada {

		private No cabeca = null;
		private No cauda = null;
		
		public void inserir(Processo processo) {
			No novoNo = new No(processo, null, null);
			
			if(this.cabeca == null) {
				this.cabeca = novoNo;
				this.cauda = novoNo;
			} else {
				novoNo.setAnterior(this.cauda);
				novoNo.setProximo(novoNo);
				this.cauda.setProximo(novoNo);
				this.cauda = novoNo;
			}
		}
		
		public void remove(int data) {
			No currentNode = this.cabeca;
			
			while(currentNode != null) {
				
			}
		}
		
	}
	

