Atividade a ser realizada conforme instruído na última aula, em 15/02/2023.


Etapa 1 - Codificação

Criar um projeto Java simples no VSCode, implementar conforme instruções a seguir, e enviar em arquivo .zip.

Criar uma classe Contador, com uma propriedade numero e dois métodos:

-incrementar(): incrementa a propriedade numero.
-getNumero(): retorna a propriedade numero.

Criar uma classe Tarefa, que implementa Runnable e recebe uma instância de Contador via construtor.
No método run(), use estas duas instruções, lembrando de tratar exceção:

-Thread.sleep(100); contador.incrementar();

Na classe principal (App):

-Instanciar a classe Contador uma única vez: Contador contador = new Contador();
-Criar um array com 1000 threads: Thread[] threads = new Thread[1000];
Percorrer o array usando um for, criando e iniciando as threads (método start()).

Percorrer novamente o array usando outro for, aguardando as 1000 threads terminarem. Para isso, usem o método join(). Exemplo:
-threads[i].join(); (se isso não for feito, o programa não aguardará a conclusão das 1000 threads e exibirá um valor muito diferente do esperado).

Exibir o valor de contador.getNumero().
Recordando a aula, note que a propriedade numero da classe Contador, por meio do método incrementar(), é uma região crítica.

Execução do código:

Abra um terminal na pasta onde o arquivo "App.java" está localizado e compile o arquivo "App.java" usando o comando:
javac App.java



