package tde2;

public class Moto extends Veiculo {
	private int cilindrada;
	
	public Moto(String placa, String modelo, int ano, int cilindrada) {
		super(placa, modelo, ano);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void exibir_dados() {
		System.out.println("Moto - Modelo: " +get_modelo()+ ", Placa: "+get_placa()+ ", Ano: "+get_modelo()+ ", Cilindrada: "+cilindrada);
	}
}
