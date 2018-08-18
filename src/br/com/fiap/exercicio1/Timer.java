package br.com.fiap.exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timer implements Runnable {
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}