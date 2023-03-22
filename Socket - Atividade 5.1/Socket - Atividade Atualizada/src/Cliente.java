import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 3333);
        System.out.println("Conectando ao servidor!");
        PrintWriter escritor = new PrintWriter(socket.getOutputStream());
        escritor.println("Sistemas Distribuídos");
        escritor.flush();
        System.out.println("Mensagem enviada!");
        System.out.println("");
        InputStreamReader leitor = new InputStreamReader(socket.getInputStream());
        BufferedReader leitorB = new BufferedReader(leitor);
        String resposta = leitorB.readLine();
        System.out.println("Resposta recebida: " + resposta);
        
        socket.close();
        escritor.close();
        leitor.close();
    }
}

// public class Cliente {
//     public static void main(String[] args) throws Exception {
//         Socket socket = new Socket("localhost", 3333);
//         System.out.println("Cliente conectando ao servidor...");
//         PrintWriter escritor = new PrintWriter(socket.getOutputStream());
//         escritor.println("Cliente: sistemas distribuidos");
//         escritor.flush();
        
//         InputStreamReader leitor = new InputStreamReader(socket.getInputStream());
//         BufferedReader leitorB = new BufferedReader(leitor);
//         String resposta = leitorB.readLine();
//         System.out.println(resposta);
//         socket.close();
//         escritor.close();
//         leitor.close();

//     }
// }





