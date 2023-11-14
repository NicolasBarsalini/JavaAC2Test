package mode.entities;

public class Jogo extends Produto{
	
	private String categoria;
	private String plataforma;
	private Cliente cliente;
	
	public Jogo() {
		super();
	}

	public Jogo(String nome, double precoPorDia, int dias, String categoria, String plataforma, Cliente cliente) {
		super(nome, precoPorDia, dias);
		this.categoria = categoria;
		this.plataforma = plataforma;
		this.cliente = cliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public Cliente getCliente(){
		return cliente;
	}

	@Override
	public double calcularTotal() {
		return getDias() * getPrecoPorDia();
	}
	
	@Override
	public String toString() {
		
		return "Jogo:\n" + super.toString() + ", Categoria: " + 
				getCategoria() + ", Plataforma: " + getPlataforma() + 
				", Preço a pagar total: " + calcularTotal() +
				", Cliente  vinculado: " + getCliente().getNome();
	}

}
