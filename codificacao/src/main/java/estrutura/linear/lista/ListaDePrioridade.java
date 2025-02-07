package estrutura.linear.lista;

import estrutura.linear.NoComUnicaLigacao;
import estrutura.linear.Processo;

/**
 * Classe que representa uma Lista de Prioridade. Os elementos são inseridos de 
 * forma ordenada conforme a prioridade do processo.
 */
public class ListaDePrioridade {
    private NoComUnicaLigacao cabeca;
    
    public ListaDePrioridade() {
        this.cabeca = null;
    }
    
    /**
     * Insere um novo processo na lista de acordo com a prioridade.
     * @param processo O processo a ser inserido.
     */
    public void inserir(Processo processo) {

    }
    
    /**
     * Remove o processo de maior prioridade (menor valor numérico).
     */
    public void remover() {
        if (cabeca != null) {
            cabeca = cabeca.proximo;
        }
    }
    
    /**
     * Imprime todos os processos na lista na ordem de prioridade.
     */
    public void imprimir() {
        NoComUnicaLigacao atual = cabeca;
        while (atual != null) {
            System.out.println(atual.processo.getIdentificador());
            atual = atual.proximo;
        }
    }
    
    /**
     * Método principal para demonstrar o funcionamento da lista de prioridade.
     */
    public static void main(String[] args) {
        ListaDePrioridade lista = new ListaDePrioridade();
        
        lista.inserir(new Processo("Processo 1", 1));
        lista.inserir(new Processo("Processo 2", 2));
        lista.inserir(new Processo("Processo 3", 3));
        
        System.out.println("Lista de prioridade após inserções:");
        lista.imprimir();
        
        lista.remover();
        System.out.println("Lista de prioridade após remoção do mais prioritário:");
        lista.imprimir();
    }
}
