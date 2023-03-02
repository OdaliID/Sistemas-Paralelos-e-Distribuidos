class Contador {
    private int numero;
    
    public synchronized void incrementar() {
        this.numero++;
    }
    
    public synchronized int getNumero() {
        return this.numero;
    }
}

class Tarefa implements Runnable {
    private Contador contador;
    
    public Tarefa(Contador contador) {
        this.contador = contador;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(100);
            contador.incrementar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

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
