import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws Exception {
        System.out.println("Aguarde, porta executando!");
        try (ServerSocket servidor = new ServerSocket(3333)) {
            while(true) {
                Socket cliente = servidor.accept();
                System.out.println("Nova conexão recebida.");
                
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            InputStreamReader leitor = new InputStreamReader(cliente.getInputStream());
                            BufferedReader leitorB = new BufferedReader(leitor);
                            String linha = leitorB.readLine();
                            System.out.println(linha);
                        
                            PrintWriter escritor = new PrintWriter(cliente.getOutputStream());
                            escritor.println(linha.toUpperCase());
                            escritor.flush();
                        
                            leitor.close();
                            leitorB.close();
                            escritor.close();
                            cliente.close();
                            System.out.println("Conexão fechada.");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }
    }
}
