class Contador {
    private int numero;
    
    public synchronized void incrementar() {
        this.numero++; // O método incrementar() é sincronizado para garantir que
    }                    // apenas uma thread por vez possa acessá-lo
    
    
    public synchronized int getNumero() {
        return this.numero; // Este metodo retorna um valor, sem modificá-lo
    }
}

class Tarefa implements Runnable {
    private Contador contador;
    
    public Tarefa(Contador contador) { // O construtor recebe uma instância de Contador
        this.contador = contador;       // que será utilizada para incrementar o contador
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(100); // Incrementa o contador
            contador.incrementar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}