# Fila e Pilha

## Fila (Queue)
### Definição:
A **fila** é uma estrutura de dados linear que segue a ordem **FIFO (First In, First Out)**. Uma fila pode ser associada ao processo de **triagem de pacientes** de um hospital, onde os pacientes são atendidos conforme a ordem de chegada. Isso segue o conceito **FIFO (First In, First Out)**, ou seja, o primeiro paciente a chegar é o primeiro a ser atendido. O mesmo conceito pode ser aplicado a um sistema de impressão de documentos ou em um banco.

### Operações:

1. **Enqueue (Inserção)**
   - **Objetivo:** Inserir um elemento (paciente) no final da fila.
   - **Como funciona:** Quando um paciente chega ao hospital e se registra, ele é adicionado ao final da fila de triagem ou de atendimento.
   - **Especificação:** A operação de inserção geralmente leva tempo constante, **O(1)**, se a estrutura de dados for um array ou uma lista encadeada.

   **Exemplo no hospital:**  
   "Paciente João chega e se registra para atendimento. Ele é adicionado à fila."

2. **Dequeue (Remoção)**
   - **Objetivo:** Remover o primeiro elemento da fila (atender o paciente mais antigo).
   - **Como funciona:** O primeiro paciente da fila será o próximo a ser atendido por um médico ou enfermeiro.
   - **Especificação:** A operação de remoção também ocorre em tempo constante, **O(1)**, pois basta retirar o paciente da frente da fila.

   **Exemplo no hospital:**  
   "Paciente João é chamado para triagem e removido da fila."

3. **Peek (Ver o primeiro)**
   - **Objetivo:** Consultar o primeiro elemento da fila sem removê-lo.
   - **Como funciona:** A equipe de triagem pode verificar quem é o próximo paciente sem precisar removê-lo da fila, garantindo que a ordem será respeitada.
   - **Especificação:** A operação de "olhar" o primeiro elemento ocorre em tempo constante, **O(1)**.

   **Exemplo no hospital:**  
   "O médico verifica quem é o próximo paciente na fila sem removê-lo, apenas para se preparar para o atendimento."

4. **IsEmpty (Verificar se está vazia)**
   - **Objetivo:** Verificar se a fila está vazia ou não.
   - **Como funciona:** Esta operação verifica se a lista de pacientes ainda possui algum elemento. Se estiver vazia, significa que não há pacientes na fila.
   - **Especificação:** A operação ocorre em tempo constante, **O(1)**.

   **Exemplo no hospital:**  
   "A recepção verifica se há mais pacientes aguardando na fila. Se não houver, o atendimento pode ser encerrado para aquele período."

### Exemplo Prático de Fila no Hospital:
Imagine que há 3 pacientes na fila de triagem:  
**Fila:** João → Maria → Carlos  
O próximo paciente a ser atendido será o **João**, pois ele é o primeiro da fila


## Pilha (Stack)
### Definição: 
A **pilha** é uma estrutura de dados linear que segue a ordem **LIFO (Last In, First Out)**. Uma pilha pode ser associada ao processo de **histórico de atendimentos** ou **emergências médicas**, onde o último atendimento realizado (ou o último paciente atendido) é o primeiro a ser revisado em caso de uma emergência ou complicação. Isso segue o conceito **LIFO (Last In, First Out)**.

Pense em uma pilha de livros na sua mesa. O último livro colocado no topo da pilha é o primeiro a ser retirado quando você precisar. Este comportamento é muito usado em navegadores de internet (histórico de páginas) e em chamadas de função em linguagens de programação.

### Operações da Pilha

1. **Push (Inserção)**
   - **Objetivo:** Inserir um elemento (informação sobre um atendimento de emergência) no topo da pilha.
   - **Como funciona:** Quando ocorre um atendimento de emergência ou uma ação de urgência, o registro é "empilhado" no topo da pilha.
   - **Especificação:** A operação de inserção ocorre em tempo constante, **O(1)**.

   **Exemplo no hospital:**  
   "Paciente João chegou com uma emergência e foi atendido. O registro do atendimento é empilhado no topo do histórico."

2. **Pop (Remoção)**
   - **Objetivo:** Remover o elemento do topo da pilha (último atendimento realizado).
   - **Como funciona:** O atendimento mais recente é retirado do topo da pilha, sendo o primeiro a ser revisado.
   - **Especificação:** A operação de remoção também ocorre em tempo constante, **O(1)**, já que é preciso apenas remover o item do topo da pilha.

   **Exemplo no hospital:**  
   "A equipe médica precisa revisar o último atendimento feito a um paciente de emergência. O registro do último atendimento (no topo da pilha) é removido."

3. **Peek (Ver o topo)**
   - **Objetivo:** Consultar o elemento no topo da pilha sem removê-lo.
   - **Como funciona:** A equipe médica pode verificar rapidamente o atendimento mais recente sem precisar removê-lo do histórico.
   - **Especificação:** A operação de "olhar" o topo da pilha ocorre em tempo constante, **O(1)**.

   **Exemplo no hospital:**  
   "O médico verifica rapidamente o último atendimento de emergência registrado, sem precisar removê-lo, apenas para entender o contexto da situação."

4. **IsEmpty (Verificar se está vazia)**
   - **Objetivo:** Verificar se a pilha está vazia, ou seja, se há atendimentos no histórico.
   - **Como funciona:** Se a pilha estiver vazia, significa que não há mais atendimentos registrados. Caso contrário, há um histórico de emergências a ser revisado.
   - **Especificação:** A operação ocorre em tempo constante, **O(1)**.

   **Exemplo no hospital:**  
   "A equipe médica verifica se há atendimentos registrados no histórico de emergências. Se a pilha estiver vazia, não há mais emergências para revisar."

### Exemplo Prático de Pilha no Hospital:
Imagine que a equipe médica tenha atendido 3 emergências no hospital, e o histórico de emergências é empilhado da seguinte forma:  
**Pilha (Histórico de Emergências):** João → Maria → Carlos  
A próxima revisão será do atendimento de **Carlos**, pois ele é o último atendimento realizado.

--- 

**Conclusão:**  
As operações de fila e pilha são fundamentais no contexto hospitalar para organizar e otimizar o atendimento e o registro de informações. A fila garante que a ordem de chegada seja respeitada, enquanto a pilha permite que os atendimentos mais recentes sejam revisados com prioridade.
