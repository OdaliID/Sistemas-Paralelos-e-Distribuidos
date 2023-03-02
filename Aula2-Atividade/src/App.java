public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        String texto = "License";
        var busca1 = new Buscador("livro1.txt", texto);
        var busca2 = new Buscador("livro2.txt", texto);
        var busca3 = new Buscador("livro3.txt", texto);

        new Thread(busca1).start();
        new Thread(busca2).start();
        new Thread(busca3).start();
    }
}
