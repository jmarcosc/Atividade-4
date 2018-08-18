package br.com.fiap.exercicio1;

import java.util.ArrayList;

public class Mensagem implements Runnable {

	@Override
	public void run() {

		ArrayList<String> mensagem = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			mensagem.add("Mensagem " + i);
		}
		for (String msg : mensagem) {
			try {
				System.out.println(msg);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Ocorreu um erro durante a execução!");
			}
		}

	}

}