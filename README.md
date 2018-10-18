# Pizzaria Maluca

Materia: Estrutura de Dados </br>
Equipe: [@RafaJow](https://github.com/RafaJow) ; [@JPereira1330](https://github.com/JPereira1330).

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


__TABELA / TABULEIRO__
A tabela � uma lista circular duplamente encadeada para que o jogador consiga se movimentar por ela sem a possibilidade de encontrar o final da lista, dando assim uma imers�o de um jogo infinito. Cada jogador possuir� um tabuleiro como seu atributo, o atributo servir� para o usu�rio localizar sua posi��o no tabuleiro. A pizza � uma lista de ingredientes que � definido pelo sabor de pizza escolhido pelo usu�rio. o jogo possui eventos espalhados pelo tabuleiros, entre eles existe o sorte ou azar que s�o 20 eventos diferentes.

Tabuleiro (Lista circular duplamente encadeada)
String Evento
Tabuleiro anterior
Tabuleiro pr�ximo

