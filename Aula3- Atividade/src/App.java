public class App {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        Thread[] threads = new Thread[1000];
        
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Tarefa(contador));
            threads[i].start();
        }
        
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        
        System.out.println("Valor final: " + contador.getNumero());
    }
}