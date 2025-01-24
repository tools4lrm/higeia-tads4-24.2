# Listas de Prioridade

## Conceitos Fundamentais

### Definição Formal

Uma **lista de prioridades** é uma estrutura de dados abstrata que armazena um conjunto de elementos, 
cada um associado a uma **chave de prioridade**. Esses elementos são organizados de forma que o elemento 
com a maior (ou menor, dependendo da implementação) prioridade seja sempre o primeiro a ser removido.  

No contexto hospitalar, um exemplo prático de lista de prioridades é a gestão de pacientes em uma fila de emergência médica. 
Pacientes em estado crítico (alta prioridade) devem ser atendidos antes de outros com condições menos graves.

Em outros contextos, podemos mencionar:
 - Sistemas operacionais: Processos aguardando o processador são gerenciados com base na prioridade.

**Características principais:**

 - **Dinâmica:** A lista pode crescer e diminuir conforme elementos são adicionados ou removidos.
 - **Ordenada:** Os elementos são ordenados de acordo com a chave de prioridade.
 - **Acesso ao elemento de maior (ou menor) prioridade:** A operação de remoção sempre retorna o elemento com a maior (ou menor) prioridade.

### Operações Básicas

As principais operações em uma lista de prioridades são:

* **Inserir:** Adiciona um novo elemento à lista, mantendo a ordem de prioridade.
* **Remover:** Remove o elemento com a maior (ou menor) prioridade da lista.
* **Buscar:** Busca por um elemento específico na lista.
* **Atualizar:** Altera a prioridade de um elemento existente na lista.

### Comparação com Outras Estruturas de Dados

| Estrutura de Dados | Características | Diferenças em relação à Lista de Prioridades |
|---|---|---|
| **Pilha** | LIFO (Last In, First Out) | A pilha remove sempre o último elemento inserido, enquanto a lista de prioridades remove o elemento de maior prioridade. |
| **Fila** | FIFO (First In, First Out) | A fila remove sempre o primeiro elemento inserido, enquanto a lista de prioridades remove o elemento de maior prioridade. |
| **Lista Encadeada**  |	Ordem dinâmica, flexível para inserções	| Não organiza os elementos automaticamente por prioridade. | 

**Tabela 1: Comparação entre listas de prioridades e outras estruturas de dados**

### Exemplos no Contexto Hospitalar
  - **Fila de emergência médica**: Pacientes são ordenados pela gravidade do quadro clínico.
    - Operação de remoção: O paciente mais crítico (maior prioridade) é atendido primeiro.
    - Operação de inserção: Pacientes são adicionados conforme chegam à emergência, mas precisam ser classificados por prioridade.
  - **Lista de transplantes de órgãos**: Pacientes são organizados por critérios médicos, como compatibilidade e urgência.


**Em resumo:**

* **Listas de prioridades** se diferenciam das outras estruturas por priorizarem a remoção do elemento mais importante, e não pela ordem de inserção.
* A escolha da estrutura de dados para implementar uma lista de prioridades depende das operações mais frequentes e das exigências de tempo de execução.

**Qual das seguintes implementações de listas de prioridades podemos/queremos explorar ?**

* **Arrays:** Simples, mas com complexidade de tempo variável para inserção e remoção.
* **Listas encadeada:** Flexíveis, mas podem ter maior custo de memória.


## Implementando Listas de Prioridades: Um Mergulho mais Profundo

### Revisando as Opções Básicas
* **Arrays:**
    * **Vantagens:** Simples de implementar e geralmente oferecem bom desempenho para acesso aleatório.
    * **Desvantagens:** A inserção e remoção de elementos no meio do array podem ser custosas, pois envolvem o deslocamento de todos os elementos subsequentes.
    * **Quando usar:** Arrays podem ser uma boa opção para listas de prioridades de tamanho fixo e com poucas inserções e remoções.

* **Listas Ligadas:**
    * **Vantagens:** Flexíveis para inserção e remoção em qualquer posição, sem a necessidade de realocar elementos.
    * **Desvantagens:** A busca por um elemento específico pode ser lenta, pois requer uma varredura sequencial da lista.
    * **Quando usar:** Listas ligadas são úteis quando a ordem de inserção não é importante e quando a frequência de inserções e remoções é alta.

### Implementações 

**Lista Ordenada (Lista Encadeada)**  
Uma maneira de representar uma fila de prioridade é manter uma lista linear encadeada em que os elementos. Os elementos são mantidos ordenados por prioridade.   
  estão ordenados por prioridades decrescentes.  
  - Inserção: O elemento é adicionado na posição correta (complexidade O(n)).
  -   Remoção: Basta remover o primeiro elemento (tempo constante O(1)).  
Exemplo no Hospital:  
No setor de triagem, pacientes são organizados pela gravidade do quadro. Ao remover o paciente mais crítico, ele é automaticamente encaminhado ao médico.

**Lista Não Ordenada**    
Uma maneira muito simples é armazenar de forma aleatória os elementos em uma lista linear seqüencial, sem nenhuma ordem.
  - Inserção: Adicionar no final da lista (complexidade O(1)).
  - Remoção: Percorrer a lista para encontrar o elemento com maior prioridade (complexidade O(n)).
Exemplo no Hospital:  
Uma fila temporária para exames laboratoriais pode armazenar pacientes conforme chegam, mas o mais crítico será encontrado antes da execução.


**Fatores a Considerar na Escolha da Estrutura**

* **Frequência das operações:** Qual operação será realizada com mais frequência? Inserção, remoção ou busca?
* **Tamanho da lista:** Qual será o tamanho máximo da lista?

## Conclusão
As listas de prioridades são essenciais para situações em que a ordem de execução não depende apenas da chegada, 
mas também da importância relativa dos elementos.

No contexto hospitalar, elas se aplicam diretamente a:

  - Triagem de pacientes na emergência, garantindo que os mais críticos sejam atendidos primeiro.
  - Fila de transplantes de órgãos, priorizando pacientes conforme critérios médicos.
  - A implementação correta depende do cenário, como o volume de dados e a frequência de operações.

