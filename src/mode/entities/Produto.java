package mode.entities;

public abstract class Produto {

	private String nome;
	private double precoPorDia;
	private int dias;
	
	public  Produto() {}
	
	public Produto(String nome, double precoPorDia, int dias) {
		this.nome = nome;
		this.precoPorDia = precoPorDia;
		this.dias = dias;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoPorDia() {
		return precoPorDia;
	}
	public void setPrecoPorDia(double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Preco por dia: " + 
				getPrecoPorDia() + ", Dias Alugados: " + getDias();
	}
	
	public abstract double calcularTotal();
	
}
