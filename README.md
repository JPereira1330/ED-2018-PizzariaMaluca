# Pizzaria Maluca

Materia: Estrutura de Dados </br>
Equipe: [@RafaJow](https://github.com/RafaJow) ; [@JPereira1330](https://github.com/JPereira1330).

<br>

__Funcionamento Geral__
- **Objetivo:** Reunir os ingredientes necess√°rios para montar uma pizza de um determinado sabor.
- **Nro de jogadores:** 2 a 5
- **Como funciona o jogo:** O tabuleiro √© formado por um c√≠rculo subdividido em diversas partes. Cada parte √© nomeada com um dos ingredientes da pizza, alguma puni√ß√£o ou algum pr√™mio ao jogador.

<br>

__Elementos do jogo__
- **Elemento tipo pizza (para o jogador escolher qual vai montar):**  Montar 5 pizzas com 5 ingredientes cada. 
- **Elemento tipo ingrediente:** (a cada rodada o jogador pode conquistar mais um ingrediente para a sua pizza. Verificar no tabuleiro os ingredientes dispon√≠veis.
- **Elemento tipo sorte ou azar:** caso o jogador pare o seu pe√£o na parte indicando sorte ou azar, o mesmo vira uma ficha a qual cont√©m um pr√™mio ou uma puni√ß√£o.
- **Funcionamento do jogo:** todos os jogadores iniciam em uma posi√ß√£o do tabuleiro com um pe√£o. A cada rodada, os jogadores jogam o dado e seguem adiante n casas no tabuleiro, de acordo com o n√∫mero indicado pelo dado e recebe o ingrediente, a puni√ß√£o ou o pr√™mio (retirando a ficha sorte ou azar).


__TABELA / TABULEIRO__
A tabela È uma lista circular duplamente encadeada para que o jogador consiga se movimentar por ela sem a possibilidade de encontrar o final da lista, dando assim uma imers„o de um jogo infinito. Cada jogador possuir· um tabuleiro como seu atributo, o atributo servir· para o usu·rio localizar sua posiÁ„o no tabuleiro. A pizza È uma lista de ingredientes que È definido pelo sabor de pizza escolhido pelo usu·rio. o jogo possui eventos espalhados pelo tabuleiros, entre eles existe o sorte ou azar que s„o 20 eventos diferentes.

Tabuleiro (Lista circular duplamente encadeada)
String Evento
Tabuleiro anterior
Tabuleiro prÛximo

