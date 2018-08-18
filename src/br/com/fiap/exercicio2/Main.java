package br.com.fiap.exercicio2;

public class Main {

	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("Guarulhos");
		
		Aviao boeing = new Aviao("TAN 123", aeroporto);
		Aviao tucano = new Aviao("OLÉ 111", aeroporto);
		Aviao airbus = new Aviao("LINHA 222", aeroporto);
		
		System.out.println(boeing);
		System.out.println(tucano);
		System.out.println(airbus);
		
		aeroporto.start();
		boeing.start();
		tucano.start();
		airbus.start();
		
	}

}
