package ulbra.br.threads1;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PrincipalController {

        @GetMapping
        public String semThread() throws InterruptedException{
            TarefaDemorada tarefa = new TarefaDemorada();
            tarefa.processar();
            return "Executou...";
        }
        
       

        @GetMapping("thread")
        public String comThread() throws InterruptedException{
            TarefaDemorada2 tarefa = new TarefaDemorada2();
            Thread minhaThread = new Thread(tarefa);
            minhaThread.start();
            return "Executou...";
        }
}
/*http://localhost:8080/thread*/