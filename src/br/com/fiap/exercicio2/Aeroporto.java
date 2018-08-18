package br.com.fiap.exercicio2;

public class Aeroporto extends Thread {
	
	private String nomeAeroporto;
	private boolean statusPista;
	
	Aeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}

	public String getNomeAeroporto() {
		return nomeAeroporto;
	}

	public void setNomeVoo(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Aeroporto " + nomeAeroporto + " aberto para v�os!");
			while (true) {
				Thread.sleep(3000);
				alterarEstadoPista();
			}
		} catch (Exception e) {
			System.out.println("Aeroporto fechado!");
		}

	}
	
	public void aguardarPistaDisponivel() {
		if (this.isStatusPista()) {
			System.out.println("Pista dispon�vel!");
		}
	}

	public synchronized void alterarEstadoPista() {
		statusPista = !statusPista;
		if (statusPista) {
			System.out.println("Pista dispon�vel!");
			notifyAll();
		} else {
			System.out.println("Pista n�o dispon�vel!");
		}
			
	}

	public boolean isStatusPista() {
		return statusPista;
	}

	public void setstatusPista(boolean statusPista) {
		this.statusPista = statusPista;
	}

}