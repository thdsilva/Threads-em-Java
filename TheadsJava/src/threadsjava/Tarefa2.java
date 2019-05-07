package threadsjava;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarefa2 implements Runnable {
    public String demorada;
    public Tarefa2 (String demorada){
    this.demorada = demorada;
    }
    @Override
    public void run() {
        try {
            System.out.print("Tarefa Demorada iniciada às: " + LocalTime.now()+ "\n");
            Thread.sleep(10000);
            System.out.printf("Tarefa Demorada finalizada às: " + LocalTime.now() + "\n");
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarefa2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
