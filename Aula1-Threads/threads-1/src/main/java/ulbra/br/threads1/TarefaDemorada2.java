package ulbra.br.threads1;

public class TarefaDemorada2 implements Runnable {
    public void run() {
        try{
            Thread.sleep(5000);
            System.out.println("Terminou a tarefa...");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
