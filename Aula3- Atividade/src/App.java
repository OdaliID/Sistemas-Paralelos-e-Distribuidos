public class App {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador(); // Instancia o objeto contador
        Thread[] threads = new Thread[1000];  // Cria um array de threads
        
        for (int i = 0; i < threads.length; i++) {  // Cria e inicia as threads
            threads[i] = new Thread(new Tarefa(contador));
            threads[i].start();
        }
        
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        
        System.out.println("Valor final: " + contador.getNumero());
    }
}