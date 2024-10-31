
# O que é uma Lista Encadeada?

Uma lista encadeada é uma estrutura de dados linear que representa uma sequência de nós, todos do mesmo tipo, na memória RAM do computador. 
Cada elemento da sequência é armazenado em um nó (estrutura) da lista; o primeiro elemento na primeira célula, o segundo na segunda, e assim por diante.
Cada nó (estrutura) contém dois elementos principais:

1. Dados: A informação que o nó armazena (por exemplo, o paciente).
2. Ponteiro: Uma referência (ou "ponteiro") que indica o próximo nó na sequência.

Diferente de um vetor, onde os elementos são armazenados em posições consecutivas da memória, 
os nós de uma lista encadeada podem estar espalhados em diferentes locais da memória. 
O importante é que cada nó "aponte" para o próximo, criando a estrutura da lista.  

Cada elemento tem um único predecessor e um único sucessor, 
exceto o primeiro (não tem predecessor) e o último (não tem sucessor).

![image](https://github.com/user-attachments/assets/94eb72f2-9eb9-4572-96e0-35718221e16c)

### Tipos de Listas Encadeadas:
**Lista Simplesmente Encadeada**: Cada nó contém um ponteiro que aponta para o próximo nó.   
  
**Lista Duplamente Encadeada**: Cada nó contém dois ponteiros, um apontando para o próximo nó e outro apontando para o nó anterior, 
permitindo a navegação em ambas as direções.  

***Lista Circular***: A última célula da lista aponta para a primeira, formando um ciclo.   

### Principais Características de uma Lista Encadeada:
**Tamanho Dinâmico**: Ao contrário dos vetores, o tamanho de uma lista encadeada pode crescer ou diminuir conforme novos nós são adicionados ou removidos.  

**Inserção e Remoção Eficiente**: Adicionar ou remover elementos no início, fim ou meio da lista é feito de forma eficiente, sem a necessidade de deslocar outros elementos, como em um vetor.  

**Flexibilidade**: Ela é ideal para situações onde o número de elementos varia de forma imprevisível, como o número de pacientes no hospital.  

### Desvantagem:  

A maior desvantagem deste tipo de implementação é a utilização de memória extra para
armazenar os ponteiros.  


