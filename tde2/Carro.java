package tde2;

public class Carro extends Veiculo {
	private int qtd_portas;
	
	public Carro(String placa, String modelo, int ano, int qtd_portas) {
		super(placa, modelo, ano);
		this.qtd_portas = qtd_portas;
	}
	
	@Override
	public void exibir_dados() {
		System.out.println("Carro - Modelo: "+get_modelo()+ ", Placa: " +get_placa()+ ", Ano: " +get_ano()+ ", Portas: " +qtd_portas);
	}
}
