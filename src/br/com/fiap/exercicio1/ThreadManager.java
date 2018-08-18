package br.com.fiap.exercicio1;

public class ThreadManager implements Runnable {

	@Override
	public void run() {
		try {

			Thread mensagem = new Thread(new Mensagem());
			Thread timerThread = new Thread(new Timer());

			mensagem.start();
			timerThread.start();

			while (true) {

				System.out.println("A thread de mensagem está " + mensagem.getState());
				System.out.println("A thread de timer está " + timerThread.getState());

				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}