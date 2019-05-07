package threadsjava;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarefa1 implements Runnable {
	public String nome;
	public Tarefa1 (String nome) {
		this.nome = nome;
	}
	@Override
	public void run() {
            try {
                System.out.printf("Iniciando a tarefa do %s às: " + LocalTime.now()  + "\n" , nome);
                Thread.sleep(3000);
                System.out.printf("Finalizando a tarefa do %s às: " + LocalTime.now() + "\n" , nome);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tarefa1.class.getName()).log(Level.SEVERE, null, ex);
            }	
	}
}