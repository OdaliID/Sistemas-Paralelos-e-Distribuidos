import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class Buscador implements Runnable {
   
    private String nomeArquivo;
    private String texto;

    public Buscador(String nomeArquivo, String texto){
        this.nomeArquivo = nomeArquivo;
        this.texto = texto;
    }
    @Override
    public void run(){
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            int numLinha = 1;
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                
                if (linha.toLowerCase().contains(texto.toLowerCase())) {
                    System.out.println(nomeArquivo + ": linha " + numLinha);
                }
                numLinha++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
