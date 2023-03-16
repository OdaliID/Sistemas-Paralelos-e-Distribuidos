import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 3333);
        System.out.println("Conectando ao servidor...");
        PrintWriter escritor = new PrintWriter(socket.getOutputStream());
        System.out.println("sistemas distribuidos");
        escritor.flush();
        
        InputStreamReader leitor = new InputStreamReader(socket.getInputStream());
        BufferedReader leitorB = new BufferedReader(leitor);
        String resposta = leitorB.readLine();
        System.out.println(resposta);

        socket.close();
        escritor.close();
        leitor.close();
    }
}
