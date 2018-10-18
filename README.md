# Pizzaria Maluca

Materia: Estrutura de Dados </br>
Equipe: [@RafaJow](https://github.com/RafaJow) ; [@JPereira1330](https://github.com/JPereira1330).

<hr>

<br>

__Funcionamento Geral__
- **Objetivo:** Reunir os ingredientes necessários para montar uma pizza de um determinado sabor.
- **Nro de jogadores:** 2 a 5
- **Como funciona o jogo:** O tabuleiro é formado por um círculo subdividido em diversas partes. Cada parte é nomeada com um dos ingredientes da pizza, alguma punição ou algum prêmio ao jogador.

<br>

__Elementos do jogo__
- **Elemento tipo pizza (para o jogador escolher qual vai montar):**  Montar 5 pizzas com 5 ingredientes cada. 
- **Elemento tipo ingrediente:** (a cada rodada o jogador pode conquistar mais um ingrediente para a sua pizza. Verificar no tabuleiro os ingredientes disponíveis.
- **Elemento tipo sorte ou azar:** caso o jogador pare o seu peão na parte indicando sorte ou azar, o mesmo vira uma ficha a qual contém um prêmio ou uma punição.
- **Funcionamento do jogo:** todos os jogadores iniciam em uma posição do tabuleiro com um peão. A cada rodada, os jogadores jogam o dado e seguem adiante n casas no tabuleiro, de acordo com o número indicado pelo dado e recebe o ingrediente, a punição ou o prêmio (retirando a ficha sorte ou azar).

<br>

__Como implementar o jogo utilizando-se de TADs:__

Obs.: Todos os elementos devem utilizar-se de alocação dinâmica de memória.
<br>

O dado deve ser um número entre 1 e 6 sorteado aleatoriamente, utilizando-se de função randômica. 
Tabuleiro: implementar uma lista circular duplamente encadeada contendo sequencialmente todas as posições do tabuleiro. Todos os jogadores iniciam no início da lista. Obs.: a lista deve ter um ponteiro para cada jogador (para marcar a posição atual do jogador). Abaixo seguem todas as posições do tabuleiro, iniciando do primeiro elemento da primeira fila, seguindo-se no sentido horizontal até o último elemento da fila (1-perde tudo, 2- cebola..., 35- sorte ou azar)

**Inicio** :point_right:

COLUNA 01  | COLUNA 02 | COLUNA 03 | COLUNA 04 | COLUNA 05 | COLUNA 06 | COLUNA 07 |
:--------: | :-------: | :-------: | :-------: | :-------: | :-------: | :-------: |
Perde Tudo | Cebola    | Sorte Azar| Calabresa | Queijo    | Sorte Azar| Sorte Azar|
Tomate     | Ovos      | Azeitona  | Sorte Azar| Sorte Azar| Milho     | Azeitona  |
Sorte Azar | Prezunto  | Tomate    | Milho     | Sorte Azar| Sorte Azar| Brocolis  |
Sorte Azar | Ovos      | Cebola    | Sorte Azar| Calabreza | Sorte Azar| Prezunto  |
Sorte Azar | Queijo    | Azeitona  | Sorte Azar| Brocolos  | Azeitona  | Sorte Azar|

**Fim** :point_right:

Obs.: o elemento pizzaiolo foi substituído pelo elemento sorte ou azar. 
<br>

 - **Escolha da pizza a ser montada:**
As pizzas devem ser implementadas numa lista simplesmente encadeada, contendo 5 ingredientes. A cada ingrediente conquistado, o mesmo é retirado da lista. GANHA O JOGO o jogador que esvaziar primeiro a sua lista.
 - **Fichas sorte ou azar (prêmio ou punição):**
Implementar uma pilha contendo diversos prêmios ou punições para os participantes. Os prêmios e punições devem conter 20 fichas de cada ação empilhadas aleatoriamente, que são as seguintes: perder um ingrediente, ganhar dois ingredientes, retirar um ingrediente de um outro jogador, queimar a pizza(perder todos os ingredientes). Quando no tabuleiro o jogador for para a posição sorte ou azar, um elemento da pilha é retirado, revelado ao jogador e executada a ação descrita na ficha. Caso pilha se esvazie, empilhar novamente os elementos de forma aleatória.
