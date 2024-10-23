
# O que é uma Lista Encadeada?

Uma lista encadeada é uma estrutura de dados linear que representa uma sequência de nós, todos do mesmo tipo, na memória RAM do computador. 
Cada elemento da sequência é armazenado em um nó (estrutura) da lista; o primeiro elemento na primeira célula, o segundo na segunda, e assim por diante.
Cada nó (estrutura) contém dois elementos principais:

1. Dados: A informação que o nó armazena (por exemplo, o paciente).
2. Ponteiro: Uma referência (ou "ponteiro") que indica o próximo nó na sequência.

Diferente de um vetor, onde os elementos são armazenados em posições consecutivas da memória, 
os nós de uma lista encadeada podem estar espalhados em diferentes locais da memória. 
O importante é que cada nó "aponte" para o próximo, criando a estrutura da lista.

<img width="900" alt="image" src="https://github.com/user-attachments/assets/b2a7512b-8a79-4900-aa90-735ee94a1a90" />

### Principais Características de uma Lista Encadeada:
**Tamanho Dinâmico**: Ao contrário dos vetores, o tamanho de uma lista encadeada pode crescer ou diminuir conforme novos nós são adicionados ou removidos.  
**Inserção e Remoção Eficiente**: Adicionar ou remover elementos no início, fim ou meio da lista é feito de forma eficiente, sem a necessidade de deslocar 
outros elementos, como em um vetor.  
**Flexibilidade**: Ela é ideal para situações onde o número de elementos varia de forma imprevisível, como o número de pacientes no hospital.  

### Tipos de Listas Encadeadas:
**Lista Simplesmente Encadeada**: Cada nó contém um ponteiro que aponta para o próximo nó.   
**Lista Duplamente Encadeada**: Cada nó contém dois ponteiros, um apontando para o próximo nó e outro apontando para o nó anterior, 
permitindo a navegação em ambas as direções.  
**Lista Circular**: A última célula da lista aponta para a primeira, formando um ciclo.   

