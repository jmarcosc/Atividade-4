package br.com.fiap.exercicio3;

public class Main {

	public static void main(String[] args) {
		
		for (Cores t : Cores.values()) {
			System.out.println("COR: " + t.toString() + " | CÓDIGO: " + t.getCodigo());
		}
		
		System.out.println("\nCodigo da cor branca: " + Cores.Branco.getCodigo());
		
	}
}