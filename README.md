# Disciplina Estrutura de Dados Lineares (2024.2)

### Procedimento Metodológico para trabalharmos a Disciplina

Para conectar a teoria à prática de forma natural, criaremos um contexto fictício neste repositório 
(ver [Conteúdo do Curso](/documentacao/curso/README.md)) 
que será utilizado com intuito de provocar discussões sobre conceitos e práticas de Estrutura de Dados Lineares com a turma 
( [137684 - TEC.0020 - Estrutura de Dados Lineares](https://suap.ifrn.edu.br/edu/meu_diario/137684/1/)). 
Para isso, a proposta é que o período de dois encontros represente uma **iteração** sobre o problema em questão e 
o conteúdo da disciplina com intuito de compreendermos o assunto para **incrementar** a solução por meio do que foi trabalhado em sala 
(ver [Modelo de Desenvolvimento de Software Interativo e Incremental](https://pt.wikipedia.org/wiki/Desenvolvimento_iterativo_e_incremental)). 

# Higeia - Sistema Hospitalar

## Uma Breve Descrição do Contexto / Problema

**FPenha Corporation**, uma holding familiar com participação em grandes empresas espalhadas pelo mundo, 
nos contratou para desenvolvermos uma solução no qual pudesse **organizar, computacionalmente, os dados** referente aos serviços prestados pelo **Hospital FPenha**, 
assim como a sua estrutura e fluxos realizados nesses dados. 
Então, após a discussão com os envolvidos/interessados, os seguintes requisitos foram brevemente capturados para projetarmos um sistema que permitisse acompanhar 
o paciente da acolhida até a sua alta, registrando todos os dados e oferecendo informações para direcionarmos os procedimentos.

## Iteração-I: Controle dos Leitos e Pacientes

o hospital precisa de um sistema simples que armazene os dados dos leitos e pacientes em diferentes alas. 
O sistema deverá permitir o armazenamento de um número fixo, já que cada ala tem um número limitado de leitos.


## Iteração-II: Controle de entrada e saída da triagem 

No nosso último encontro com o cliente-pagante, momento no qual apresentamos a implementação e conceitos abstraídos de como os leitos serão controlados, 
O Hospital informou da necessidade de um sistema mais flexível para o setor de triagem, onde pacientes entram e saem continuamente. 
O número de pacientes varia ao longo do dia, e o sistema deve ser capaz de adicionar novos pacientes à lista ou remover aqueles que foram atendidos.

> parece que uma lista encadeada é ideal para esse caso, já que o número de pacientes é dinâmico, e inserir ou remover um paciente deve ser feito de forma eficiente.  
>
> Na triagem, cada paciente será representado por um nó na lista, contendo informações pessoais e o próximo paciente na fila. A lista poderá crescer e diminuir conforme pacientes são atendidos ou transferidos.  
