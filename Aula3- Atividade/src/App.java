public class App {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador(); // Instancia o objeto contador
        Thread[] threads = new Thread[1000];  // Cria um array de threads
        
        for (int i = 0; i < threads.length; i++) {  // Cria e inicia as threads
            threads[i] = new Thread(new Tarefa(contador));  // Cada thread recebe uma instância do contador via construtor
            threads[i].start();  // Inicia a thread
        }
        
        for (int i = 0; i < threads.length; i++) { // Aguarda as threads terminarem
            threads[i].join();
        }
        
        System.out.println("Valor final: " + contador.getNumero());
    }
}