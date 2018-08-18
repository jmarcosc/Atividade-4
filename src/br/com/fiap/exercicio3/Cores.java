package br.com.fiap.exercicio3;

public enum Cores {

	Branco("21"), Preto("22"), Vermelho("23"), Amarelo("24"), Azul("25");

	private String codigo;
	
	Cores(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return name();
	}
}