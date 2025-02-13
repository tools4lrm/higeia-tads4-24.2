package estrutura.linear.dicionario;

import estrutura.linear.NoComChave;
import estrutura.linear.Processo;

/**
 * Implementa um Dicionário de Dados utilizando uma Tabela Hash com CPF como chave.
 */
public class DicionarioDados {

    private NoComChave[] tabela;
    private int capacidade;

    public DicionarioDados(int capacidade) {
        this.capacidade = capacidade;
        this.tabela = new NoComChave[capacidade];
    }

    /**
     * Função de hash para converter o CPF em um índice do vetor.
     */
    private int hash(String cpf) {
        return Math.abs(cpf.hashCode()) % capacidade;
    }

    /**
     * Adiciona um novo processo ao dicionário usando CPF como chave.
     * @param cpf CPF do paciente.
     * @param processo Objeto Processo a ser armazenado.
     */
    public void adicionarProcesso(String cpf, Processo processo) {
        int indice = hash(cpf);
        NoComChave novaEntrada = new NoComChave(cpf, processo);
        
        if (tabela[indice] == null) {
            tabela[indice] = novaEntrada;
        } else {
        	NoComChave atual = tabela[indice];
            while (atual.proximo != null) {
                if (atual.cpf.equals(cpf)) {
                    atual.processo = processo;
                    return;
                }
                atual = atual.proximo;
            }
            if (atual.cpf.equals(cpf)) {
                atual.processo = processo;
            } else {
                atual.proximo = novaEntrada;
            }
        }
    }

    /**
     * Remove um processo pelo CPF.
     * @param cpf CPF do paciente.
     */
    public void removerProcesso(String cpf) {

    }

    /**
     * Busca um processo pelo CPF.
     * @param cpf CPF do paciente.
     * @return Objeto Processo encontrado ou null se não existir.
     */
    public Processo buscarProcesso(String cpf) {

        return null;
    }

    /**
     * Imprime todos os processos armazenados.
     */
    public void imprimirProcessos() {

    }

    /**
     * Método principal para demonstração do funcionamento do dicionário.
     */
    public static void main(String[] args) {
        DicionarioDados dicionario = new DicionarioDados(10);
        
        dicionario.adicionarProcesso("12345678900", new Processo("Paciente A"));
        dicionario.adicionarProcesso("98765432100", new Processo("Paciente B"));
        dicionario.adicionarProcesso("11122233344", new Processo("Paciente C"));
        
        System.out.println("Processos armazenados:");
        dicionario.imprimirProcessos();
        
        dicionario.removerProcesso("98765432100");
        System.out.println("Após remover Paciente B:");
        dicionario.imprimirProcessos();
    }
}
