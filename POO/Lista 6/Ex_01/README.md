# Lista de exercícios 6

Os exercícios utilizam: Polimorfismo.

## Questões

1) Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo
100 itens. O pedido deverá ser capaz de receber vários tipos produtos (superclasse),
como frios, pães, doces, etc (subclasses). Ao final da entrada dos produtos o pedido
deverá ter um método que calcule o valor total do pedido, onde ele varrerá o vetor de
produtos somando seus valores. Desafio: implementar a quantidade de produtos vezes
seu valor, no cálculo do valor do pedido. Implemente as classes para do modelo
abaixo:
 <div align="center">
      <img src="https://github.com/babimingatos/java/assets/72284498/f602701a-22fa-492c-bd84-66097b333d4e" width=40%>
    </div>

2) Se a mãe natureza pudesse criar um programa em Java para criar plantas de uma
floresta e as plantas sendo conhecidas por seus nomes e espécie, podendo ser de 3
tipos: Árvore, que pode ou não ser frutífera; Flor, que tem a cor dos suas flores e Carnívora, que pode ou não ser venenosa. Como seria a criação de uma floresta? Criar uma classe para criar uma floresta (main). Nesta classe deverá haver um menu
para cadastrar plantas, listar plantas, mostrar quantidade de plantas na floresta e
mostrar a quantidade de plantas de cada tipo (Árvore, Flor e Carnívora).

3) Uma empresa de recursos humanos, especializada em recolocações no mercado
(vagas de emprego), solicita a criação de um sistema para informatizar suas ações.
Assim, ela deseja cadastrar os candidatos com seu nome (String) e idade (int). Os
candidatos podem ser desempregados, que tem o tempo em meses (int) que não
trabalha ou empregados, que tem o nome da empresa (String), onde está atualmente.
As vagas tem a descrição (String) e o salário oferecido (double). As vagas podem ser
de estágio, que em o tempo em meses (int) ou contrato, que pode ser temporário ou
não (boolean). Criar um programa em Java para cadastrar os candidatos (desempregados ou empregados) e cadastrar as vagas (estágio ou contrato). O
sistema deve ser capaz de cadastrar os candidatos para as vagas.
Criar uma classe para criar a empresa de RH (main). Nesta classe deverá haver um
menu para cadastrar candidatos, cadastrar vagas, cadastrar candidato x vaga, listar
vagas por tipo, mostrar quantidade de candidatos e sua situação e os candidatos x
vaga.

4)  Criar um projeto para uma locadora. Esta locadora deve poder alugar filmes, livros
e jogos. O projeto deverá permitir o aluguel qualquer tipo de mídia citada
anteriormente. Uma mídia é alugada para um Cliente e o Cliente devolve a mídia
alugada. O cliente pode pagar no aluguel ou na devolução.
a. Escreva uma classe para representar a Mídia que será alugada. A mídia tem: um
código (int); uma descrição ou título (String); um tipo (String), que indica se é
um CD, DVD, Blu-ray, Brochura, Cartucho ou Digital; um gênero (String); e valor
(Double), que é o valor do aluguel.
b. Escreva uma classe para representar o Filme, que é filho da mídia. O filme terá:
uma classificação (String); e uma duração (int) em minutos.
c. Escreva uma classe para representar o Livro, que, também é filho de mídia. O
livro terá: um autor (String); uma editora (String); e uma edição (int).
d. Escreva uma classe para representar o Jogo, que, também é filho de mídia. O
jogo terá: console (String).
e. Escreva uma classe para representar um Cliente. O cliente terá: código (int);
nome (String); e idade (int).
f. Escrever uma classe para representar o aluguel. Uma mídia é alugada para um
cliente. Um cliente pode devolver uma mídia alugada. O aluguel pode ser pago
no início ou no fim do processo. O dono da locadora deseja saber quanto ele
recebeu e o cliente quanto tem para pagar.
Faça todas as adaptações necessárias para que o aluguel e a devolução funcionem.
Use vetores de objetos para alugar e devolver.

5) Criar um projeto para cadastrar os animais de um zoológico.
Os animais são conhecidos por seus nomes e especie. Eles podem ser de 3 tipos
Voador, que tem a cor da pena, terrestres, que tem a quantidade de patas e aquáticos,
que podem ou não respirar fora da água.
No zoológico cada animal tem seu habitat. Os habitats do zoológico são cinco, prédefinidos: jaula, gaiola, aquário, lago e viveiro. Cada habitat tem uma área e está
localizada em um local do zoológico.
A área é representada pela relação entre Comprimento e Largura.
Criar uma classe para testar todo o zoológico (main). Nesta classe deverá haver um
menu para Cadastrar animais, Listar animais, Quantidade de animais no Zoo, Quantidade de animais de cada tipo (Voador, Terrestre e Aquático), Quantidade de
animais por tipo de habitat e Área total que os animais ocupam.

6) Implemente um sistema para controle de um Colégio particular, onde um professor
ministra várias disciplinas para uma sala (composta por vários alunos).

a. Cada Pessoa é identificada por seu nome e sua idade.

b. Os Alunos estão em um curso (fundamental, médio, infantil, etc) e pagam uma
mensalidade.

c. Os Professores recebem um salário e ministram disciplinas.

d. As Salas tem um nome ou descrição (1A, 1B, 2D, etc) e tem a quantidade de
pessoas que fazem parte dela, exemplo 21 pessoas, 20 alunos e um professor.

e. Crie as classes Pessoa, Aluno, Professor, Sala e Colegio, conforme descrito na
figura 2.

f. A classe Colegio é a classe principal, onde será possível listar e/ou cadastrar as
Salas (criar um vetor de salas), usando polimorfismo, o professor e/ou os alunos
de cada sala.

g. Note alguns itens para facilitar: os métodos toString() para facilitar as
impressões e a instanciação dos métodos construtores para cada uma das
classe exceto a principal. Para tanto se utilize, em pelo menos um dos casos de
criação de objetos (instanciação), o segundo método construtor.

h. Para cadastro das disciplinas na classe Professor, utilize o código abaixo:
 public void setDisciplina( String disciplina ) {
 for (int i = 0 ; i < this.disciplina.length ; i++ ) {
 if ( this.disciplina[i] == null ) {
 this.disciplina[i] = disciplina;
 return;
 }
 }
 }

i. Extra: criar uma solução para os administradores do colégio verifiquem a
rentabilidade de cada sala e do colégio.
 <div align="center">
      <img src="https://github.com/babimingatos/java/assets/72284498/5c3fd704-6a01-4fbe-bce1-08b4e9f6d2f9" width=70%>
    </div>
