package threadsjava;
public class ThreadsJava {
    public static void main(String[] args) {
	System.out.printf("Bem vindos Alunos da sala 216\n");
		
	Tarefa1 trabalho1 = new Tarefa1 ("Marcos");
	Thread thread1 = new Thread(trabalho1);
		
	Tarefa1 trabalho2 = new Tarefa1 ("Thiago");
	Thread thread2 = new Thread(trabalho2);
		
	Tarefa1 trabalho3 = new Tarefa1 ("Pedro");
	Thread thread3 = new Thread(trabalho3);		
		
	Tarefa2 demorado = new Tarefa2 (null);
	Thread thread4 = new Thread(demorado);
		
	thread1.start();
	thread2.start();
	thread3.start();
	thread4.start();
    }
}
