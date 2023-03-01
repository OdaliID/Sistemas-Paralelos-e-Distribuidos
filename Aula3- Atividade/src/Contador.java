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