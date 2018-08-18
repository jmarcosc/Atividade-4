package br.com.fiap.exercicio2;

public class Aviao extends Thread {
	
	private String nomeVoo;
	private Aeroporto aeroporto;
	
	Aviao(String nomeVoo, Aeroporto aeroporto) {
		this.nomeVoo = nomeVoo;
		this.aeroporto = aeroporto;
	}

	public String getNomeVoo() {
		return nomeVoo;
	}

	public void setNomeVoo(String nomeVoo) {
		this.nomeVoo = nomeVoo;
	}

	public Aeroporto getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}
	
	@Override
	public void run() {
		voar();
	}

	public void decolar() {
		Aeroporto aeroporto = this.aeroporto;
		if (aeroporto.isStatusPista()) {
			System.out.println("Avi�o: " + this.getNomeVoo() + " decolando!");
		}
	}

	public void voar() {
		try {
			System.out.println("Avi�o " + this.getNomeVoo() + " em v�o!");
			Thread.sleep(2000);
			aterrissar();
		} catch (InterruptedException e) {
			System.out.println("Ocorreram problemas durante o v�o!");
		}
	}

	public void aterrissar() {
		Aeroporto aeroporto = this.aeroporto;
		if (aeroporto.isStatusPista()) {
			System.out.println("Avi�o: " + this.getNomeVoo() + " aterrisou!");
		}
	}

}